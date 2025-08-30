package com.cpd.hotel_system.hotel_management_service_api.service;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestBranchDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestHotelDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.BranchPaginateResponseDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.HotelPaginateResponseDto;

public interface BranchService {
        public void creat(RequestBranchDto dto);
        public void update(RequestBranchDto dto, String branchId);
        public void delete(String branchId);
        public RequestBranchDto findById(String branchId);
        public BranchPaginateResponseDto findAll(int page, int size, String searchText);
        public BranchPaginateResponseDto findAllByHotelId(int page, int size,String hotelId,String searchText);

}