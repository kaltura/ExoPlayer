/*
 * Copyright (C) 2016 The Android Open Source Project
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
package com.google.android.exoplayer2.text.ttml;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Util;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * A representation of a TTML subtitle.
 */
/* package */ final class TtmlSubtitle implements Subtitle {

  private final TtmlNode root;
  private final long[] eventTimesUs;
  private final Map<String, TtmlStyle> globalStyles;
  private final Map<String, TtmlRegion> regionMap;
<<<<<<< HEAD:library/src/main/java/com/google/android/exoplayer/text/ttml/TtmlSubtitle.java

  public TtmlSubtitle(TtmlNode root, Map<String, TtmlStyle> globalStyles,
      Map<String, TtmlRegion> regionMap) {
    this.root = root;
    this.regionMap = regionMap;
    this.globalStyles = globalStyles != null
        ? Collections.unmodifiableMap(globalStyles) : Collections.<String, TtmlStyle>emptyMap();
=======
  private final Map<String, String> imageMap;

  public TtmlSubtitle(
      TtmlNode root,
      Map<String, TtmlStyle> globalStyles,
      Map<String, TtmlRegion> regionMap,
      Map<String, String> imageMap) {
    this.root = root;
    this.regionMap = regionMap;
    this.imageMap = imageMap;
    this.globalStyles =
        globalStyles != null ? Collections.unmodifiableMap(globalStyles) : Collections.emptyMap();
>>>>>>> 71f72c59537711399dc5496136dd6b867acc6d77:library/core/src/main/java/com/google/android/exoplayer2/text/ttml/TtmlSubtitle.java
    this.eventTimesUs = root.getEventTimesUs();
  }

  @Override
  public int getNextEventTimeIndex(long timeUs) {
    int index = Util.binarySearchCeil(eventTimesUs, timeUs, false, false);
    return index < eventTimesUs.length ? index : C.INDEX_UNSET;
  }

  @Override
  public int getEventTimeCount() {
    return eventTimesUs.length;
  }

  @Override
  public long getEventTime(int index) {
    return eventTimesUs[index];
  }

  /* @VisibleForTesting */
  /* package */ TtmlNode getRoot() {
    return root;
  }

  @Override
  public List<Cue> getCues(long timeUs) {
<<<<<<< HEAD:library/src/main/java/com/google/android/exoplayer/text/ttml/TtmlSubtitle.java
    return root.getCues(timeUs, globalStyles, regionMap);
=======
    return root.getCues(timeUs, globalStyles, regionMap, imageMap);
>>>>>>> 71f72c59537711399dc5496136dd6b867acc6d77:library/core/src/main/java/com/google/android/exoplayer2/text/ttml/TtmlSubtitle.java
  }

  /* @VisibleForTesting */
  /* package */ Map<String, TtmlStyle> getGlobalStyles() {
    return globalStyles;
  }
}
