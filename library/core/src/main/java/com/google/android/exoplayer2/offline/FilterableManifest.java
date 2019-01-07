/*
 * Copyright (C) 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.android.exoplayer2.offline;

import java.util.List;

/**
 * A manifest that can generate copies of itself including only the streams specified by the given
 * keys.
 *
 * @param <T> The manifest type.
 */
<<<<<<< HEAD:library/src/main/java/com/google/android/exoplayer/hls/HlsMasterPlaylist.java
public final class HlsMasterPlaylist extends HlsPlaylist {

  public final List<Variant> variants;
  public final List<Variant> audios;
  public final List<Variant> subtitles;

  public final String muxedAudioLanguage;
  public final String muxedCaptionLanguage;

  public HlsMasterPlaylist(String baseUri, List<Variant> variants,
      List<Variant> audios, List<Variant> subtitles, String muxedAudioLanguage,
      String muxedCaptionLanguage) {
    super(baseUri, HlsPlaylist.TYPE_MASTER);
    this.variants = Collections.unmodifiableList(variants);
    this.audios = Collections.unmodifiableList(audios);
    this.subtitles = Collections.unmodifiableList(subtitles);
    this.muxedAudioLanguage = muxedAudioLanguage;
    this.muxedCaptionLanguage = muxedCaptionLanguage;
  }
=======
public interface FilterableManifest<T> {
>>>>>>> 71f72c59537711399dc5496136dd6b867acc6d77:library/core/src/main/java/com/google/android/exoplayer2/offline/FilterableManifest.java

  /**
   * Returns a copy of the manifest including only the streams specified by the given keys. If the
   * manifest is unchanged then the instance may return itself.
   *
   * @param streamKeys A non-empty list of stream keys.
   * @return The filtered manifest.
   */
  T copy(List<StreamKey> streamKeys);
}
