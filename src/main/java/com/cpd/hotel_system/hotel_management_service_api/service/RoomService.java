package com.cpd.hotel_system.hotel_management_service_api.service;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestRoomDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseRoomDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.RoomPaginateResponceDto;

public interface RoomService {

        public void creat(RequestRoomDto dto);
        public void update(RequestRoomDto dto, String branchId);
        public void delete(String roomId);
        public ResponseRoomDto findById(String roomId);
        public RoomPaginateResponceDto findAll(int page, int size);

    }
