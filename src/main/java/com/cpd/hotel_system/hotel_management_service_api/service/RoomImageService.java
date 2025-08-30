package com.cpd.hotel_system.hotel_management_service_api.service;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestRoomDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestRoomImageDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseRoomDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseRoomImageDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.RoomImagePaginateResponseDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.RoomPaginateResponceDto;

public interface RoomImageService {
    public void creat(RequestRoomImageDto dto);
    public void update(RequestRoomImageDto dto, String imageId);
    public void delete(String imageId);
    public ResponseRoomImageDto findById(String imageId);
    public RoomImagePaginateResponseDto findByBranchId(String branchId);

}
