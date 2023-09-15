package net.fzy.fitness.mapper;

import net.fzy.fitness.model.entity.Episode;
import org.apache.ibatis.annotations.Param;

public interface EpisodeMapper {


    Episode findFirstEpisodeByVideoId(@Param("video_id") int videoId);

}
