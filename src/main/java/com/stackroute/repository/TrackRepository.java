package com.stackroute.repository;

import com.stackroute.domain.Track;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackRepository  extends MongoRepository<Track, Integer> {

    public Track findByTrackName(String trackName);
}