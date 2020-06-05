package com.exp.imdb.converter;

public interface ModelConverter<E,M> {
    public E toEntity(M model);
    public M toModel(E entity);
}
