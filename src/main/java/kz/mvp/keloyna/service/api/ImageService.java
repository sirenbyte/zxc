package kz.mvp.keloyna.service.api;

import kz.mvp.keloyna.entity.Image;
import kz.mvp.keloyna.service.base.BaseService;

import java.util.List;

public interface ImageService extends BaseService<Image, Long> {
    List<Image> getImagesById(Long id);

}
