package cn.itrip.service.itripHotelTempStore;
import cn.itrip.beans.ItripHotelTempStore
public interface ItripHotelTempStoreService {

    public ItripHotelTempStore getItripHotelTempStoreById(Long id)throws Exception;
;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
import cn.itrip.common.Page;
/**
* Created by shang-pc on 2015/11/7.
*/
    public List<ItripHotelTempStore>	getItripHotelTempStoreListByMap(Map<String,Object> param)throws Exception;

    public Integer getItripHotelTempStoreCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddItripHotelTempStore(ItripHotelTempStore itripHotelTempStore)throws Exception;

    public Integer itriptxModifyItripHotelTempStore(ItripHotelTempStore itripHotelTempStore)throws Exception;

    public Integer itriptxDeleteItripHotelTempStoreById(Long id)throws Exception;

    public Page<ItripHotelTempStore> queryItripHotelTempStorePageByMap(Map<String,Object> param,Integer pageNo,Integer pageSize)throws Exception;
}
