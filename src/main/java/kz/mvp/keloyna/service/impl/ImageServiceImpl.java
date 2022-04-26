package kz.mvp.keloyna.service.impl;

import kz.mvp.keloyna.entity.Image;
import kz.mvp.keloyna.repository.ImageRepository;
import kz.mvp.keloyna.service.api.ImageService;
import kz.mvp.keloyna.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceImpl extends BaseServiceImpl<Image, Long, ImageRepository> implements ImageService {

    @Override
    public List<Image> getImagesById(Long id) {
        return getRepository().getByPlaygroundId(id);
    }
}
