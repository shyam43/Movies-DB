/*
 * Copyright (c) Joaquim Ley 2016. All Rights Reserved.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.joaquimley.core.data.network;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.joaquimley.core.data.model.ResultsWrapper;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MarvelService {

//    https://api.themoviedb.org/3/search/movie?api_key=b6f21cf08123c048d122efbba7293173&query=dark%20night&page=2
    /**
     * Retrieve list of characters
     */
    @GET("search/movie")
    Call<ResultsWrapper> getCharacters(@Query("api_key") String publicKey,
                                                           @NonNull @Query("page") Integer page,
                                                           @Nullable @Query("query") String searchQuery);

    @GET("search/movie")
    Call<ResultsWrapper> getCharacters(@Query("api_key") String publicKey,
                                       @Nullable @Query("query") String searchQuery);

//    https://api.themoviedb.org/3/movie/76341?api_key=b6f21cf08123c048d122efbba7293173
    /**
     * Retrieve Movie by given Id
     */
    @GET("movie/{movieId}")
    Call<ResultsWrapper> getCharacter(@Path("movieId") long movieId,
                                                             @Query("api_key") String publicKey);

//    /**
//     * Retrieve list of comics by character Id
//     */
//    @GET("characters/{characterId}/{comicType}")
//    Call<DataWrapper<List<Comic>>> getCharacterComics(@Path("characterId") long characterId,
//                                                      @Path("comicType") String comicType,
//                                                      @Query("offset") Integer offset,
//                                                      @Query("limit") Integer limit,
//                                                      @Query("apikey") String publicKey,
//                                                      @Query("hash") String md5Digest,
//                                                      @Query("ts") long timestamp);
}


