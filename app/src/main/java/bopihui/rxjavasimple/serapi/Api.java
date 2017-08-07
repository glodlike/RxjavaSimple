package bopihui.rxjavasimple.serapi;

import bopihui.rxjavasimple.Bean.Bean;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2017/8/2 0002.
 */

public interface Api {
    @GET("http://tcc.taobao.com/cc/json/mobile_tel_segment.htm")
    public Observable<Bean> getIndex(@Query("r_type") String userId, @Query("shop_id") String shop_id);
}
