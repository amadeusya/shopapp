package com.ecommerce.shopapp.Business.Utils;



import com.ecommerce.shopapp.DTOs.Requests.StoreRequestDTO;
import com.ecommerce.shopapp.DTOs.Responses.StoreResponseDTO;
import com.ecommerce.shopapp.Entities.Concretes.Store;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StoreMapper {
    @Mapping(source = "slug", target = "slug")
    Store toEntity(StoreRequestDTO dto);

    List<StoreResponseDTO> toDtoList(List<Store> entities);

    @Mapping(source = "createdAt", target = "createdAt")
    @Mapping(source = "slug", target = "slug")
    StoreResponseDTO toDto(Store entity);
}
