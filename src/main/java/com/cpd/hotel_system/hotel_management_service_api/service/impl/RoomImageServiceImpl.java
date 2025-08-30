package com.cpd.hotel_system.hotel_management_service_api.service.impl;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestRoomImageDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseRoomImageDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.RoomImagePaginateResponseDto;
import com.cpd.hotel_system.hotel_management_service_api.service.RoomImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoomImageServiceImpl implements RoomImageService {
    @Override
    public void creat(RequestRoomImageDto dto) {

    }

    @Override
    public void update(RequestRoomImageDto dto, String imageId) {

    }

    @Override
    public void delete(String imageId) {

    }

    @Override
    public ResponseRoomImageDto findById(String imageId) {
        return null;
    }

    @Override
    public RoomImagePaginateResponseDto findByBranchId(String branchId) {
        return null;
    }
}
