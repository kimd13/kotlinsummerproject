package com.example.kotlinsummerproject.data.db.entity


import com.google.gson.annotations.SerializedName

data class DataX(

    /*
    @SerializedName("all_awardings")
    val allAwardings: List<Any> = listOf(),
    @SerializedName("allow_live_comments")
    val allowLiveComments: Boolean = false,
    @SerializedName("approved_at_utc")
    val approvedAtUtc: Any? = Any(),
    @SerializedName("approved_by")
    val approvedBy: Any? = Any(),
    val archived: Boolean = false,
    */

    val author: String = "",

    /*
    @SerializedName("author_flair_background_color")
    val authorFlairBackgroundColor: String = "",
    @SerializedName("author_flair_css_class")
    val authorFlairCssClass: String = "",
    @SerializedName("author_flair_richtext")
    val authorFlairRichtext: List<AuthorFlairRichtext> = listOf(),
    @SerializedName("author_flair_template_id")
    val authorFlairTemplateId: String = "",
    @SerializedName("author_flair_text")
    val authorFlairText: String = "",
    @SerializedName("author_flair_text_color")
    val authorFlairTextColor: String = "",
    @SerializedName("author_flair_type")
    val authorFlairType: String = "",
    @SerializedName("author_fullname")
    val authorFullname: String = "",
    @SerializedName("author_patreon_flair")
    val authorPatreonFlair: Boolean = false,
    @SerializedName("banned_at_utc")
    val bannedAtUtc: Any? = Any(),
    @SerializedName("banned_by")
    val bannedBy: Any? = Any(),
    @SerializedName("can_gild")
    val canGild: Boolean = false,
    @SerializedName("can_mod_post")
    val canModPost: Boolean = false,
    val category: Any? = Any(),
    val clicked: Boolean = false,
    @SerializedName("content_categories")
    val contentCategories: Any? = Any(),
    @SerializedName("contest_mode")
    val contestMode: Boolean = false,
    val created: Double = 0.0,
    @SerializedName("created_utc")
    val createdUtc: Double = 0.0,
    @SerializedName("discussion_type")
    val discussionType: Any? = Any(),
    val distinguished: Any? = Any(),
    val domain: String = "",
    val downs: Int = 0,
    //val edited: Boolean = false,
    //edited throws an error due to type mismatch; edited is either false or a number
    //we could ignore since we don't need it
    val gilded: Int = 0,
    val gildings: Gildings = Gildings(),
    val hidden: Boolean = false,
    @SerializedName("hide_score")
    val hideScore: Boolean = false,
    val id: String = "",
    @SerializedName("is_crosspostable")
    val isCrosspostable: Boolean = false,
    @SerializedName("is_meta")
    val isMeta: Boolean = false,
    @SerializedName("is_original_content")
    val isOriginalContent: Boolean = false,
    @SerializedName("is_reddit_media_domain")
    val isRedditMediaDomain: Boolean = false,
    @SerializedName("is_robot_indexable")
    val isRobotIndexable: Boolean = false,
    @SerializedName("is_self")
    val isSelf: Boolean = false,
    @SerializedName("is_video")
    val isVideo: Boolean = false,
    val likes: Any? = Any(),
    @SerializedName("link_flair_background_color")
    val linkFlairBackgroundColor: String = "",
    @SerializedName("link_flair_css_class")
    val linkFlairCssClass: String = "",
    @SerializedName("link_flair_richtext")
    val linkFlairRichtext: List<LinkFlairRichtext> = listOf(),
    @SerializedName("link_flair_template_id")
    val linkFlairTemplateId: String = "",
    @SerializedName("link_flair_text")
    val linkFlairText: String = "",
    @SerializedName("link_flair_text_color")
    val linkFlairTextColor: String = "",
    @SerializedName("link_flair_type")
    val linkFlairType: String = "",
    val locked: Boolean = false,
    val media: Any? = Any(),
    @SerializedName("media_embed")
    val mediaEmbed: MediaEmbed = MediaEmbed(),
    @SerializedName("media_only")
    val mediaOnly: Boolean = false,
    @SerializedName("mod_note")
    val modNote: Any? = Any(),
    @SerializedName("mod_reason_by")
    val modReasonBy: Any? = Any(),
    @SerializedName("mod_reason_title")
    val modReasonTitle: Any? = Any(),
    @SerializedName("mod_reports")
    val modReports: List<Any> = listOf(),
    val name: String = "",
    @SerializedName("no_follow")
    val noFollow: Boolean = false,
    @SerializedName("num_comments")
    val numComments: Int = 0,
    @SerializedName("num_crossposts")
    val numCrossposts: Int = 0,
    @SerializedName("num_reports")
    val numReports: Any? = Any(),
    @SerializedName("over_18")
    val over18: Boolean = false,
    @SerializedName("parent_whitelist_status")
    val parentWhitelistStatus: String = "",
    val permalink: String = "",
    val pinned: Boolean = false,
    @SerializedName("post_hint")
    val postHint: String = "",
    val preview: Preview = Preview(),
    val pwls: Int = 0,
    val quarantine: Boolean = false,
    @SerializedName("removal_reason")
    val removalReason: Any? = Any(),
    @SerializedName("report_reasons")
    val reportReasons: Any? = Any(),
    val saved: Boolean = false,
    val score: Int = 0,
    @SerializedName("secure_media")
    val secureMedia: Any? = Any(),
    @SerializedName("secure_media_embed")
    val secureMediaEmbed: SecureMediaEmbed = SecureMediaEmbed(),
    val selftext: String = "",
    @SerializedName("selftext_html")
    val selftextHtml: Any? = Any(),
    @SerializedName("send_replies")
    val sendReplies: Boolean = false,
    val spoiler: Boolean = false,
    val stickied: Boolean = false,
    val subreddit: String = "",
    @SerializedName("subreddit_id")
    val subredditId: String = "",
    @SerializedName("subreddit_name_prefixed")
    val subredditNamePrefixed: String = "",
    @SerializedName("subreddit_subscribers")
    val subredditSubscribers: Int = 0,
    @SerializedName("subreddit_type")
    val subredditType: String = "",
    @SerializedName("suggested_sort")
    val suggestedSort: Any? = Any(),
    val thumbnail: String = "",
    @SerializedName("thumbnail_height")
    val thumbnailHeight: Int = 0,
    @SerializedName("thumbnail_width")
    val thumbnailWidth: Int = 0,
    */


    val title: String = ""

    /*
    @SerializedName("total_awards_received")
    val totalAwardsReceived: Int = 0,
    val ups: Int = 0,
    val url: String = "",
    @SerializedName("user_reports")
    val userReports: List<Any> = listOf(),
    @SerializedName("view_count")
    val viewCount: Any? = Any(),
    val visited: Boolean = false,
    @SerializedName("whitelist_status")
    val whitelistStatus: String = "",
    val wls: Int = 0
     */
)