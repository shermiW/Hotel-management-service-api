package com.cpd.hotel_system.hotel_management_service_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Lob;

@Embeddable
public class FileFormatter {
    @Lob
    @Column(name="file_name")
    private byte[] file;

    @Column(name="resource_Url")
    private byte[] resourceUrl;

    @Column(name="directory")
    private byte[] directory;

    @Column(name="hash")
    private byte[] hash;




}
