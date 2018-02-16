package pl.familydoctor.family.mapper;

import java.util.List;

public interface Mapper<D, E> {

    E convertToEntity(D dto);

    D convertToDto(E entity);

    List<E> convertToEntities(List<D> dtos);

    List<D> convertToDtos(List<E> entities);
}
