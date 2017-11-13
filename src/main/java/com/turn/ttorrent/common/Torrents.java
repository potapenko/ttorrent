package com.turn.ttorrent.common;

import com.turn.ttorrent.client.SharedTorrent;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Torrents {

  private final ConcurrentMap<String, SharedTorrent> torrents;

  public Torrents() {
    this.torrents = new ConcurrentHashMap<String, SharedTorrent>();
  }

  public boolean hasTorrent(String hash) {
    return torrents.containsKey(hash);
  }

  public SharedTorrent getTorrent(String hash) {
    return torrents.get(hash);
  }

  public void put(String hash, SharedTorrent torrent) {
    torrents.put(hash, torrent);
  }

}
