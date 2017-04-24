package com.example.iampamungkas.laksanamekar.interfaces;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by iampamungkas on 4/24/17.
 */

public interface WPAPI {
    @GET("wp-json/wp/v2/posts")
    Call
}
