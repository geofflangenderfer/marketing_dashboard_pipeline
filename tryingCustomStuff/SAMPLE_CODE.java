/**
 * Copyright (c) 2015-present, Facebook, Inc. All rights reserved.
 *
 * You are hereby granted a non-exclusive, worldwide, royalty-free license to
 * use, copy, modify, and distribute this software in source code or binary
 * form for use in connection with the web services and APIs provided by
 * Facebook.
 *
 * As with any software that integrates with the Facebook platform, your use
 * of this software is subject to the Facebook Developer Principles and
 * Policies [http://developers.facebook.com/policy/]. This copyright notice
 * shall be included in all copies or substantial portions of the software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 *
 */

import com.facebook.ads.sdk.*;
import java.io.File;
import java.util.Arrays;

public class SAMPLE_CODE {
  public static void main (String args[]) throws APIException {

    String access_token = "EAAEDHwyZByqgBAI5zHonErX1AULOm033l8rKwNl6T2Y7usE6GZBpGB9hr3pNRgHFsXditdJmX85y1dbRJuNLRlThkv7ruvxvN2CTEVBYprEXXqNeuEok6r13a561IofZCauOyuxq2DqmCZAcpoJKnWwbSFVbGtu041PCus8SB1hBxcqaSUOvxhbZBTANdS90ZD";
    String ad_account_id = "1335167736833434";
    String app_secret = "dfcc46538deeb7cc3f91d35aba9e5490";
    String app_id = "284906869410472";
    APIContext context = new APIContext(access_token).enableDebug(true);

    new AdAccount(ad_account_id, context).getInsights()
      .setTimeRange("{\"since\":\"2020-10-01\",\"until\":\"2021-01-01\"}")
      .setFiltering("[]")
      .setLevel(AdsInsights.EnumLevel.VALUE_ACCOUNT)
      .setBreakdowns(Arrays.asList(AdsInsights.EnumBreakdowns.VALUE_GENDER))
      .requestField("results")
      .requestField("result_rate")
      .requestField("reach")
      .requestField("frequency")
      .requestField("impressions")
      .requestField("delivery")
      .requestField("spend")
      .requestField("impressions_gross")
      .requestField("impressions_auto_refresh")
      .requestField("cost_per_result")
      .requestField("cpp")
      .requestField("cpm")
      .requestField("actions:page_engagement")
      .requestField("actions:like")
      .requestField("actions:comment")
      .requestField("actions:post_engagement")
      .requestField("actions:post_reaction")
      .requestField("actions:onsite_conversion.post_save")
      .requestField("actions:post")
      .requestField("actions:photo_view")
      .requestField("actions:rsvp")
      .requestField("actions:checkin")
      .requestField("actions:full_view")
      .requestField("unique_actions:full_view")
      .requestField("ar_effect_share:ar_effect_share")
      .requestField("cost_per_action_type:page_engagement")
      .requestField("cost_per_action_type:like")
      .requestField("cost_per_action_type:post_engagement")
      .requestField("cost_per_action_type:rsvp")
      .requestField("unique_video_continuous_2_sec_watched_actions:video_view")
      .requestField("video_continuous_2_sec_watched_actions:video_view")
      .requestField("actions:video_view")
      .requestField("video_thruplay_watched_actions:video_view")
      .requestField("video_p25_watched_actions:video_view")
      .requestField("video_p50_watched_actions:video_view")
      .requestField("video_p75_watched_actions:video_view")
      .requestField("video_p95_watched_actions:video_view")
      .requestField("video_p100_watched_actions:video_view")
      .requestField("video_avg_time_watched_actions:video_view")
      .requestField("video_play_actions:video_view")
      .requestField("canvas_avg_view_time")
      .requestField("canvas_avg_view_percent")
      .requestField("cost_per_2_sec_continuous_video_view:video_view")
      .requestField("cost_per_action_type:video_view")
      .requestField("cost_per_thruplay:video_view")
      .requestField("actions:link_click")
      .requestField("unique_actions:link_click")
      .requestField("outbound_clicks:outbound_click")
      .requestField("unique_outbound_clicks:outbound_click")
      .requestField("website_ctr:link_click")
      .requestField("unique_link_clicks_ctr")
      .requestField("outbound_clicks_ctr:outbound_click")
      .requestField("unique_outbound_clicks_ctr:outbound_click")
      .requestField("clicks")
      .requestField("unique_clicks")
      .requestField("ctr")
      .requestField("unique_ctr")
      .requestField("cost_per_action_type:link_click")
      .requestField("cost_per_unique_action_type:link_click")
      .requestField("cost_per_outbound_click:outbound_click")
      .requestField("cost_per_unique_outbound_click:outbound_click")
      .requestField("cpc")
      .requestField("cost_per_unique_click")
      .requestField("estimated_ad_recallers")
      .requestField("estimated_ad_recall_rate")
      .requestField("cost_per_estimated_ad_recallers")
      .execute();
  }
}
