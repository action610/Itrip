package cn.itrip.service.itripHotelRoom;
import cn.itrip.beans.ItripHotelRoom
public interface ItripHotelRoomService {

    public ItripHotelRoom getItripHotelRoomById(Long id)throws Exception;
;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
import cn.itrip.common.Page;
/**
* Created by shang-pc on 2015/11/7.
*/
    public List<ItripHotelRoom>	getItripHotelRoomListByMap(Map<String,Object> param)throws Exception;

    public Integer getItripHotelRoomCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddItripHotelRoom(ItripHotelRoom itripHotelRoom)throws Exception;

    public Integer itriptxModifyItripHotelRoom(ItripHotelRoom itripHotelRoom)throws Exception;

    public Integer itriptxDeleteItripHotelRoomById(Long id)throws Exception;

    public Page<ItripHotelRoom> queryItripHotelRoomPageByMap(Map<String,Object> param,Integer pageNo,Integer pageSize)throws Exception;
}
