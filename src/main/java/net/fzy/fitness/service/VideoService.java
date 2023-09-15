package net.fzy.fitness.service;

import net.fzy.fitness.model.entity.Video;
import net.fzy.fitness.model.entity.VideoBanner;

import java.util.List;

public interface VideoService {

    List<Video> listVideo();

    List<VideoBanner> listBanner();

    Video findDetailById(int videoId);
}
