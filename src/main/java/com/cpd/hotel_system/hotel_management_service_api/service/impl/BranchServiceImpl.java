package com.cpd.hotel_system.hotel_management_service_api.service.impl;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestBranchDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.BranchPaginateResponseDto;
import com.cpd.hotel_system.hotel_management_service_api.service.BranchService;
import org.springframework.stereotype.Service;

@Service
public class BranchServiceImpl implements BranchService {
    @Override
    public void creat(RequestBranchDto dto) {

    }

    @Override
    public void update(RequestBranchDto dto, String branchId) {

    }

    @Override
    public void delete(String branchId) {

    }

    @Override
    public RequestBranchDto findById(String branchId) {
        return null;
    }

    @Override
    public BranchPaginateResponseDto findAll(int page, int size, String searchText) {
        return null;
    }

    @Override
    public BranchPaginateResponseDto findAllByHotelId(int page, int size, String hotelId, String searchText) {
        return null;
    }
}
