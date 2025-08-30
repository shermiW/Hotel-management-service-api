package com.cpd.hotel_system.hotel_management_service_api.service.impl;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestRoomDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseRoomDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.RoomPaginateResponceDto;
import com.cpd.hotel_system.hotel_management_service_api.service.RoomService;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {
    @Override
    public void creat(RequestRoomDto dto) {

    }

    @Override
    public void update(RequestRoomDto dto, String branchId) {

    }

    @Override
    public void delete(String roomId) {

    }

    @Override
    public ResponseRoomDto findById(String roomId) {
        return null;
    }

    @Override
    public RoomPaginateResponceDto findAll(int page, int size) {
        return null;
    }
}
