package com.cpd.hotel_system.hotel_management_service_api.service;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestAddressDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestBranchDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestHotelDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseAddressDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.BranchPaginateResponseDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.HotelPaginateResponseDto;

public interface AddressService {
    public void creat(RequestAddressDto dto);
    public void update(RequestAddressDto dto, String addressId);
    public void delete(String addressId);
    public ResponseAddressDto findById(String branchId);
    public ResponseAddressDto findByBranchId(String branchId);

}