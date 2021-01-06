#!/usr/bin/env bash

userAccessToken="EAAEDHwyZByqgBAI5zHonErX1AULOm033l8rKwNl6T2Y7usE6GZBpGB9hr3pNRgHFsXditdJmX85y1dbRJuNLRlThkv7ruvxvN2CTEVBYprEXXqNeuEok6r13a561IofZCauOyuxq2DqmCZAcpoJKnWwbSFVbGtu041PCus8SB1hBxcqaSUOvxhbZBTANdS90ZD"
gnl_software_access_token="EAAEDHwyZByqgBAE6ZCqkWftyoMWjyyolwTM7ZCrzBcrIFO4tFZAFpWBDNU7Gpu638gvrdsfjZAkZB31MBqju710ZBy8rZCg1g19wkBZBVQ3HwkdZAZAcN6trAlAZC31ZAeexGLNAKfZA14FGyjrA8VMHkhFmFToSWwep5WIphLZAdZCeeiwRKeoH6r1LhzYoztenrZAdDOF0ZD"
adset_id="23846073762980685"
gnl_software_page_id="104785448109685"
#curl -i -X GET \
#   "https://graph.facebook.com/v9.0/me/insights/page_impressions_unique?access_token=$userAccessToken"

# get page access token
#curl -i -X GET "https://graph.facebook.com/$gnl_software_page_id?fields=access_token&access_token=$userAccessToken"

# get page id
#curl -i \
#  -X GET \
#  "https://graph.facebook.com/gnlsoftware?access_token=$userAccessToken"


curl -i -G \
"https://graph.facebook.com/v9.0/$gnl_software_page_id/insights/page_tab_views_logout_top/profile_likes?period=days_28" \
-d "access_token=$gnl_software_access_token" \
#-d "metric=post_reactions_like_total,post_reactions_love_total,post_reactions_wow_total" \
#-d "metric=page_impressions_unique,page_engaged_users" \
#-d "since=2020-01-01" \


# leftoff
# https://developers.facebook.com/docs/platforminsights/page/
