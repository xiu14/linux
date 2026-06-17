.class public Ldev/jahir/frames/ui/activities/ViewerActivity;
.super Ldev/jahir/frames/ui/activities/base/BaseWallpaperApplierActivity;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldev/jahir/frames/ui/activities/ViewerActivity$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldev/jahir/frames/ui/activities/base/BaseWallpaperApplierActivity<",
        "Ldev/jahir/frames/data/Preferences;",
        ">;"
    }
.end annotation


# static fields
.field public static final CAN_TOGGLE_SYSTEMUI_VISIBILITY_KEY:Ljava/lang/String; = "can_toggle_visibility"

.field private static final CLOSING_KEY:Ljava/lang/String; = "closing"

.field public static final Companion:Ldev/jahir/frames/ui/activities/ViewerActivity$Companion;

.field private static final ENTER_TRANSITION_DURATION:J = 0x12cL

.field public static final FAVORITES_MODIFIED:Ljava/lang/String; = "favorites_modified"

.field public static final FAVORITES_MODIFIED_RESULT:I = 0x1

.field public static final FAVORITES_NOT_MODIFIED_RESULT:I = 0x0

.field public static final IS_FOR_FAVS:Ljava/lang/String; = "viewer_is_for_favs"

.field private static final IS_IN_FAVORITES_KEY:Ljava/lang/String; = "is_in_favorites"

.field public static final LICENSE_CHECK_ENABLED:Ljava/lang/String; = "license_check_enabled"

.field public static final MIN_TIME:J = 0xa4cb80L

.field private static final RETURN_TRANSITION_DURATION:J = 0xfaL

.field public static final SHARED_IMAGE_NAME:Ljava/lang/String; = "thumb.jpg"

.field private static final TRANSITIONED_KEY:Ljava/lang/String; = "transitioned"

.field public static final TRANSITION_NAME:Ljava/lang/String; = "wallpaper_transition_container"


# instance fields
.field private applierDialog:Landroidx/fragment/app/y;

.field private closing:Z

.field private collectionName:Ljava/lang/String;

.field private final detailsFragment$delegate:Lp4/c;

.field private downloadBlockedDialog:Landroidx/appcompat/app/r;

.field private favoritesModified:Z

.field private firstImageLoad:Z

.field private final imageView$delegate:Lp4/c;

.field private isForFavs:Z

.field private isInFavorites:Z

.field private final preferences$delegate:Lp4/c;

.field private final shouldChangeNavigationBarLightStatus:Z

.field private final shouldChangeStatusBarLightStatus:Z

.field private final toolbar$delegate:Lp4/c;

.field private transitioned:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldev/jahir/frames/ui/activities/ViewerActivity$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ldev/jahir/frames/ui/activities/ViewerActivity$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldev/jahir/frames/ui/activities/ViewerActivity;->Companion:Ldev/jahir/frames/ui/activities/ViewerActivity$Companion;

    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/base/BaseWallpaperApplierActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldev/jahir/frames/ui/activities/k;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Ldev/jahir/frames/ui/activities/k;-><init>(Ldev/jahir/frames/ui/activities/ViewerActivity;I)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->preferences$delegate:Lp4/c;

    .line 15
    .line 16
    sget v0, Ldev/jahir/frames/R$id;->toolbar:I

    .line 17
    .line 18
    new-instance v1, Ldev/jahir/frames/ui/activities/ViewerActivity$special$$inlined$findView$default$1;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-direct {v1, p0, v0, v2}, Ldev/jahir/frames/ui/activities/ViewerActivity$special$$inlined$findView$default$1;-><init>(Landroid/app/Activity;IZ)V

    .line 22
    .line 23
    .line 24
    invoke-static {v1}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->toolbar$delegate:Lp4/c;

    .line 29
    .line 30
    sget v0, Ldev/jahir/frames/R$id;->wallpaper:I

    .line 31
    .line 32
    new-instance v1, Ldev/jahir/frames/ui/activities/ViewerActivity$special$$inlined$findView$default$2;

    .line 33
    .line 34
    invoke-direct {v1, p0, v0, v2}, Ldev/jahir/frames/ui/activities/ViewerActivity$special$$inlined$findView$default$2;-><init>(Landroid/app/Activity;IZ)V

    .line 35
    .line 36
    .line 37
    invoke-static {v1}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->imageView$delegate:Lp4/c;

    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    iput-boolean v0, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->firstImageLoad:Z

    .line 45
    .line 46
    new-instance v0, Ldev/jahir/frames/ui/activities/k;

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    invoke-direct {v0, p0, v1}, Ldev/jahir/frames/ui/activities/k;-><init>(Ldev/jahir/frames/ui/activities/ViewerActivity;I)V

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->detailsFragment$delegate:Lp4/c;

    .line 57
    .line 58
    return-void
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public static synthetic A(Ldev/jahir/frames/ui/activities/ViewerActivity;Ln1/h;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/frames/ui/activities/ViewerActivity;->generatePalette$lambda$14$lambda$13(Ldev/jahir/frames/ui/activities/ViewerActivity;Ln1/h;)V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method

.method public static synthetic B(ZLcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/frames/ui/activities/ViewerActivity;->hasValidNetworkAvailable$lambda$23(ZLcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method

.method public static synthetic C(Ldev/jahir/frames/ui/widgets/FramesBottomNavigationView;Landroid/view/View;Lm0/c2;)Lm0/c2;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ldev/jahir/frames/ui/activities/ViewerActivity;->initWindow$lambda$21$lambda$20(Ldev/jahir/frames/ui/widgets/FramesBottomNavigationView;Landroid/view/View;Lm0/c2;)Lm0/c2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method

.method public static synthetic D(Ldev/jahir/frames/ui/activities/ViewerActivity;Ldev/jahir/frames/data/models/Wallpaper;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ldev/jahir/frames/ui/activities/ViewerActivity;->configureUIForWallpaper$lambda$10(Ldev/jahir/frames/ui/activities/ViewerActivity;Ldev/jahir/frames/data/models/Wallpaper;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method

.method public static synthetic E(Lcom/google/android/material/appbar/AppBarLayout;Ldev/jahir/frames/ui/activities/ViewerActivity;Landroid/view/View;Lm0/c2;)Lm0/c2;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Ldev/jahir/frames/ui/activities/ViewerActivity;->initWindow$lambda$19$lambda$18(Lcom/google/android/material/appbar/AppBarLayout;Ldev/jahir/frames/ui/activities/ViewerActivity;Landroid/view/View;Lm0/c2;)Lm0/c2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
.end method

.method public static synthetic F(Ldev/jahir/frames/ui/activities/ViewerActivity;Ljava/util/List;)Lp4/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/frames/ui/activities/ViewerActivity;->onCreate$lambda$6(Ldev/jahir/frames/ui/activities/ViewerActivity;Ljava/util/List;)Lp4/k;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method

.method public static synthetic G(Ldev/jahir/frames/ui/activities/ViewerActivity;Ldev/jahir/frames/data/models/Wallpaper;Landroid/view/MenuItem;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ldev/jahir/frames/ui/activities/ViewerActivity;->configureUIForWallpaper$lambda$9(Ldev/jahir/frames/ui/activities/ViewerActivity;Ldev/jahir/frames/data/models/Wallpaper;Landroid/view/MenuItem;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method

.method public static synthetic H(Ldev/jahir/frames/ui/activities/ViewerActivity;)Ldev/jahir/frames/data/Preferences;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/frames/ui/activities/ViewerActivity;->preferences_delegate$lambda$0(Ldev/jahir/frames/ui/activities/ViewerActivity;)Ldev/jahir/frames/data/Preferences;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static final synthetic access$configureUIForWallpaper(Ldev/jahir/frames/ui/activities/ViewerActivity;Ldev/jahir/frames/data/models/Wallpaper;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ldev/jahir/frames/ui/activities/ViewerActivity;->configureUIForWallpaper(Ldev/jahir/frames/data/models/Wallpaper;)V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method

.method public static final synthetic access$getCollectionName$p(Ldev/jahir/frames/ui/activities/ViewerActivity;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->collectionName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static final synthetic access$isForFavs$p(Ldev/jahir/frames/ui/activities/ViewerActivity;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->isForFavs:Z

    .line 2
    .line 3
    return p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method private final applyWallpaper(Ldev/jahir/frames/data/models/Wallpaper;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/ViewerActivity;->dismissApplierDialog()V

    .line 5
    .line 6
    .line 7
    new-instance p1, Ldev/jahir/frames/ui/fragments/viewer/SetAsOptionsDialog;

    .line 8
    .line 9
    invoke-direct {p1}, Ldev/jahir/frames/ui/fragments/viewer/SetAsOptionsDialog;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->applierDialog:Landroidx/fragment/app/y;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/q0;->getSupportFragmentManager()Landroidx/fragment/app/j1;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "set_wallpaper_options_dialog"

    .line 19
    .line 20
    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/y;->show(Landroidx/fragment/app/j1;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method private final checkForDownload()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/ViewerActivity;->shouldShowDownloadOption()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    const-string v1, "license_check_enabled"

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x1

    .line 22
    if-ne v0, v1, :cond_2

    .line 23
    .line 24
    const-wide/32 v0, 0xa4cb80

    .line 25
    .line 26
    .line 27
    invoke-static {p0, v0, v1}, Ldev/jahir/frames/extensions/context/ContextKt;->compliesWithMinTime(Landroid/content/Context;J)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-nez v3, :cond_2

    .line 32
    .line 33
    sget v3, Ldev/jahir/frames/R$bool;->allow_immediate_downloads:I

    .line 34
    .line 35
    const/4 v4, 0x2

    .line 36
    const/4 v5, 0x0

    .line 37
    invoke-static {p0, v3, v2, v4, v5}, Ldev/jahir/frames/extensions/context/ContextKt;->boolean$default(Landroid/content/Context;IZILjava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 45
    .line 46
    .line 47
    move-result-wide v2

    .line 48
    invoke-static {p0}, Ldev/jahir/frames/extensions/context/ContextKt;->getFirstInstallTime(Landroid/content/Context;)J

    .line 49
    .line 50
    .line 51
    move-result-wide v4

    .line 52
    sub-long/2addr v2, v4

    .line 53
    sub-long/2addr v0, v2

    .line 54
    invoke-static {v0, v1}, Ldev/jahir/frames/extensions/resources/LongKt;->toReadableTime(J)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/ViewerActivity;->dismissDownloadBlockedDialog()V

    .line 59
    .line 60
    .line 61
    new-instance v1, Ldev/jahir/blueprint/ui/activities/b;

    .line 62
    .line 63
    invoke-direct {v1, p0, v0}, Ldev/jahir/blueprint/ui/activities/b;-><init>(Ldev/jahir/frames/ui/activities/ViewerActivity;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-static {p0, v1}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->mdDialog(Landroid/content/Context;Ld5/l;)Landroidx/appcompat/app/r;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iput-object v0, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->downloadBlockedDialog:Landroidx/appcompat/app/r;

    .line 71
    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_2
    :goto_0
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/ViewerActivity;->hasValidNetworkAvailable()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-nez v0, :cond_4

    .line 83
    .line 84
    :cond_3
    :goto_1
    return-void

    .line 85
    :cond_4
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;->requestStoragePermission()V

    .line 86
    .line 87
    .line 88
    return-void
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method private static final checkForDownload$lambda$25(Ldev/jahir/frames/ui/activities/ViewerActivity;Ljava/lang/String;Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 3

    .line 1
    const-string v0, "$this$mdDialog"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Ldev/jahir/frames/R$string;->prevent_download_title:I

    .line 7
    .line 8
    invoke-static {p2, v0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->title(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;I)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 9
    .line 10
    .line 11
    sget v0, Ldev/jahir/frames/R$string;->prevent_download_content:I

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    aput-object p1, v1, v2

    .line 18
    .line 19
    invoke-static {p0, v0, v1}, Ldev/jahir/frames/extensions/context/ContextKt;->string(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p2, p0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->message(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;Ljava/lang/String;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 24
    .line 25
    .line 26
    new-instance p0, Ldev/jahir/frames/ui/activities/c;

    .line 27
    .line 28
    const/4 p1, 0x2

    .line 29
    invoke-direct {p0, p1}, Ldev/jahir/frames/ui/activities/c;-><init>(I)V

    .line 30
    .line 31
    .line 32
    const p1, 0x104000a

    .line 33
    .line 34
    .line 35
    invoke-static {p2, p1, p0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->positiveButton(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;ILd5/l;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method

.method private static final checkForDownload$lambda$25$lambda$24(Landroid/content/DialogInterface;)Lp4/k;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 10
    .line 11
    return-object p0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method private final configureUIForWallpaper(Ldev/jahir/frames/data/models/Wallpaper;)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/ViewerActivity;->finish()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseSystemUIVisibilityActivity;->getBottomNavigation()Ldev/jahir/frames/ui/widgets/FramesBottomNavigationView;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    sget v2, Ldev/jahir/frames/R$id;->download:I

    .line 15
    .line 16
    invoke-virtual {p1}, Ldev/jahir/frames/data/models/Wallpaper;->getDownloadable()Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-static {v3, v4}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-nez v3, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/ViewerActivity;->shouldShowDownloadOption()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    const/4 v3, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v3, 0x0

    .line 37
    :goto_0
    invoke-virtual {v0, v2, v3}, Ldev/jahir/frames/ui/widgets/FramesBottomNavigationView;->setItemVisible(IZ)V

    .line 38
    .line 39
    .line 40
    :cond_2
    sget v0, Ldev/jahir/frames/R$id;->toolbar_title:I

    .line 41
    .line 42
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/u;->findViewById(I)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const/4 v2, 0x0

    .line 47
    if-eqz v0, :cond_4

    .line 48
    .line 49
    instance-of v3, v0, Landroid/widget/TextView;

    .line 50
    .line 51
    if-eqz v3, :cond_3

    .line 52
    .line 53
    check-cast v0, Landroid/widget/TextView;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    move-object v0, v2

    .line 57
    :goto_1
    if-eqz v0, :cond_4

    .line 58
    .line 59
    invoke-virtual {p1}, Ldev/jahir/frames/data/models/Wallpaper;->getName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 64
    .line 65
    .line 66
    :cond_4
    sget v0, Ldev/jahir/frames/R$id;->toolbar_subtitle:I

    .line 67
    .line 68
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/u;->findViewById(I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-eqz v0, :cond_7

    .line 73
    .line 74
    instance-of v3, v0, Landroid/widget/TextView;

    .line 75
    .line 76
    if-eqz v3, :cond_5

    .line 77
    .line 78
    move-object v3, v0

    .line 79
    check-cast v3, Landroid/widget/TextView;

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_5
    move-object v3, v2

    .line 83
    :goto_2
    if-eqz v3, :cond_6

    .line 84
    .line 85
    invoke-virtual {p1}, Ldev/jahir/frames/data/models/Wallpaper;->getAuthor()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    .line 91
    .line 92
    :cond_6
    invoke-virtual {p1}, Ldev/jahir/frames/data/models/Wallpaper;->getAuthor()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-static {v3}, Ldev/jahir/frames/extensions/resources/StringKt;->hasContent(Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    invoke-static {v0, v3}, Ldev/jahir/frames/extensions/views/ViewKt;->visibleIf(Landroid/view/View;Z)Landroid/view/View;

    .line 101
    .line 102
    .line 103
    :cond_7
    invoke-virtual {p0, p1}, Ldev/jahir/frames/ui/activities/base/BaseWallpaperFetcherActivity;->initWallpaperFetcher$library_release(Ldev/jahir/frames/data/models/Wallpaper;)V

    .line 104
    .line 105
    .line 106
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/ViewerActivity;->getDetailsFragment()Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0, p1}, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;->setWallpaper(Ldev/jahir/frames/data/models/Wallpaper;)V

    .line 111
    .line 112
    .line 113
    invoke-direct {p0, p1}, Ldev/jahir/frames/ui/activities/ViewerActivity;->loadWallpaper(Ldev/jahir/frames/data/models/Wallpaper;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1}, Ldev/jahir/frames/data/models/Wallpaper;->isInFavorites()Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    invoke-direct {p0, v0}, Ldev/jahir/frames/ui/activities/ViewerActivity;->setInFavorites(Z)V

    .line 121
    .line 122
    .line 123
    const/4 v0, 0x3

    .line 124
    invoke-static {p0, v1, v1, v0, v2}, Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;->loadWallpapersData$library_release$default(Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;ZZILjava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseSystemUIVisibilityActivity;->getBottomNavigation()Ldev/jahir/frames/ui/widgets/FramesBottomNavigationView;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    if-eqz v0, :cond_8

    .line 132
    .line 133
    new-instance v1, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/g;

    .line 134
    .line 135
    const/4 v2, 0x4

    .line 136
    invoke-direct {v1, v2, p0, p1}, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomnavigation/BottomNavigationView;->setOnNavigationItemSelectedListener(Lcom/google/android/material/bottomnavigation/BottomNavigationView$OnNavigationItemSelectedListener;)V

    .line 140
    .line 141
    .line 142
    :cond_8
    sget v0, Ldev/jahir/frames/R$id;->go_previous:I

    .line 143
    .line 144
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/u;->findViewById(I)Landroid/view/View;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    check-cast v0, Landroidx/appcompat/widget/AppCompatImageButton;

    .line 149
    .line 150
    if-eqz v0, :cond_9

    .line 151
    .line 152
    new-instance v1, Ldev/jahir/frames/ui/activities/j;

    .line 153
    .line 154
    const/4 v2, 0x0

    .line 155
    invoke-direct {v1, p0, p1, v2}, Ldev/jahir/frames/ui/activities/j;-><init>(Ldev/jahir/frames/ui/activities/ViewerActivity;Ldev/jahir/frames/data/models/Wallpaper;I)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 159
    .line 160
    .line 161
    :cond_9
    sget v0, Ldev/jahir/frames/R$id;->go_next:I

    .line 162
    .line 163
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/u;->findViewById(I)Landroid/view/View;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    check-cast v0, Landroidx/appcompat/widget/AppCompatImageButton;

    .line 168
    .line 169
    if-eqz v0, :cond_a

    .line 170
    .line 171
    new-instance v1, Ldev/jahir/frames/ui/activities/j;

    .line 172
    .line 173
    const/4 v2, 0x1

    .line 174
    invoke-direct {v1, p0, p1, v2}, Ldev/jahir/frames/ui/activities/j;-><init>(Ldev/jahir/frames/ui/activities/ViewerActivity;Ldev/jahir/frames/data/models/Wallpaper;I)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 178
    .line 179
    .line 180
    :cond_a
    return-void
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
.end method

.method private static final configureUIForWallpaper$lambda$10(Ldev/jahir/frames/ui/activities/ViewerActivity;Ldev/jahir/frames/data/models/Wallpaper;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/t0;->e(Landroidx/fragment/app/q0;)Landroidx/lifecycle/r;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    new-instance v0, Ldev/jahir/frames/ui/activities/ViewerActivity$configureUIForWallpaper$4$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, p1, v1}, Ldev/jahir/frames/ui/activities/ViewerActivity$configureUIForWallpaper$4$1;-><init>(Ldev/jahir/frames/ui/activities/ViewerActivity;Ldev/jahir/frames/data/models/Wallpaper;Lt4/c;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x3

    .line 12
    invoke-static {p2, v1, v1, v0, p0}, Ln5/x;->p(Ln5/v;Lt4/h;Ln5/w;Ld5/p;I)Ln5/a0;

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method

.method private static final configureUIForWallpaper$lambda$11(Ldev/jahir/frames/ui/activities/ViewerActivity;Ldev/jahir/frames/data/models/Wallpaper;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/t0;->e(Landroidx/fragment/app/q0;)Landroidx/lifecycle/r;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    new-instance v0, Ldev/jahir/frames/ui/activities/ViewerActivity$configureUIForWallpaper$5$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, p1, v1}, Ldev/jahir/frames/ui/activities/ViewerActivity$configureUIForWallpaper$5$1;-><init>(Ldev/jahir/frames/ui/activities/ViewerActivity;Ldev/jahir/frames/data/models/Wallpaper;Lt4/c;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x3

    .line 12
    invoke-static {p2, v1, v1, v0, p0}, Ln5/x;->p(Ln5/v;Lt4/h;Ln5/w;Ld5/p;I)Ln5/a0;

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method

.method private static final configureUIForWallpaper$lambda$9(Ldev/jahir/frames/ui/activities/ViewerActivity;Ldev/jahir/frames/data/models/Wallpaper;Landroid/view/MenuItem;)Z
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    invoke-virtual {p0, p2, p1}, Ldev/jahir/frames/ui/activities/ViewerActivity;->handleNavigationItemSelected(ILdev/jahir/frames/data/models/Wallpaper;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method

.method private static final detailsFragment_delegate$lambda$1(Ldev/jahir/frames/ui/activities/ViewerActivity;)Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;
    .locals 6

    .line 1
    sget-object v0, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;->Companion:Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment$Companion;

    .line 2
    .line 3
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/ViewerActivity;->shouldShowWallpapersPalette()Z

    .line 4
    .line 5
    .line 6
    move-result v3

    .line 7
    const/4 v4, 0x3

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-static/range {v0 .. v5}, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment$Companion;->create$default(Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment$Companion;Ldev/jahir/frames/data/models/Wallpaper;Ln1/h;ZILjava/lang/Object;)Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method private final dismissApplierDialog()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->applierDialog:Landroidx/fragment/app/y;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/fragment/app/y;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    :catch_0
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->applierDialog:Landroidx/fragment/app/y;

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method private final dismissDownloadBlockedDialog()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->downloadBlockedDialog:Landroidx/appcompat/app/r;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/appcompat/app/s0;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    :catch_0
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->downloadBlockedDialog:Landroidx/appcompat/app/r;

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method private final generatePalette(Landroid/graphics/drawable/Drawable;)V
    .locals 6

    .line 1
    sget v0, Ldev/jahir/frames/R$id;->loading:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/u;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Ldev/jahir/frames/extensions/views/ViewKt;->gone(Landroid/view/View;)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/ViewerActivity;->shouldShowWallpapersPalette()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x1

    .line 17
    const/4 v2, 0x0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    invoke-static {p0, v2, v1, v2}, Ldev/jahir/frames/ui/activities/ViewerActivity;->setBackgroundColor$default(Ldev/jahir/frames/ui/activities/ViewerActivity;Ljava/lang/Integer;ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    if-nez p1, :cond_3

    .line 25
    .line 26
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/ViewerActivity;->getImageView()Lcom/ortiz/touchview/TouchImageView;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    move-object p1, v2

    .line 38
    :cond_3
    :goto_0
    if-eqz p1, :cond_5

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    const/4 v3, 0x3

    .line 42
    invoke-static {p1, v0, v2, v3, v2}, Ldev/jahir/frames/extensions/resources/DrawableKt;->asBitmap$default(Landroid/graphics/drawable/Drawable;FLandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-eqz p1, :cond_5

    .line 47
    .line 48
    new-instance v0, Ln1/e;

    .line 49
    .line 50
    invoke-direct {v0, p1}, Ln1/e;-><init>(Landroid/graphics/Bitmap;)V

    .line 51
    .line 52
    .line 53
    const/16 p1, 0xc

    .line 54
    .line 55
    iput p1, v0, Ln1/e;->c:I

    .line 56
    .line 57
    new-instance v3, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;

    .line 58
    .line 59
    invoke-direct {v3, p1, p0}, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;-><init>(ILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    new-instance p1, Ln1/d;

    .line 63
    .line 64
    invoke-direct {p1, v0, v3}, Ln1/d;-><init>(Ln1/e;Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;)V

    .line 65
    .line 66
    .line 67
    sget-object v3, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    .line 68
    .line 69
    new-array v4, v1, [Landroid/graphics/Bitmap;

    .line 70
    .line 71
    const/4 v5, 0x0

    .line 72
    iget-object v0, v0, Ln1/e;->a:Landroid/graphics/Bitmap;

    .line 73
    .line 74
    aput-object v0, v4, v5

    .line 75
    .line 76
    invoke-virtual {p1, v3, v4}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-nez p1, :cond_4

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    return-void

    .line 84
    :cond_5
    :goto_1
    invoke-static {p0, v2, v1, v2}, Ldev/jahir/frames/ui/activities/ViewerActivity;->setBackgroundColor$default(Ldev/jahir/frames/ui/activities/ViewerActivity;Ljava/lang/Integer;ILjava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    return-void
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
.end method

.method public static synthetic generatePalette$default(Ldev/jahir/frames/ui/activities/ViewerActivity;Landroid/graphics/drawable/Drawable;ILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    and-int/lit8 p2, p2, 0x1

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    :cond_0
    invoke-direct {p0, p1}, Ldev/jahir/frames/ui/activities/ViewerActivity;->generatePalette(Landroid/graphics/drawable/Drawable;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 13
    .line 14
    const-string p1, "Super calls with default arguments not supported in this target, function: generatePalette"

    .line 15
    .line 16
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
.end method

.method private static final generatePalette$lambda$14$lambda$13(Ldev/jahir/frames/ui/activities/ViewerActivity;Ln1/h;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {p1}, Ldev/jahir/frames/extensions/utils/PaletteKt;->getBestSwatch(Ln1/h;)Ln1/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget v0, v0, Ln1/g;->d:I

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-direct {p0, v0}, Ldev/jahir/frames/ui/activities/ViewerActivity;->setBackgroundColor(Ljava/lang/Integer;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/ViewerActivity;->getDetailsFragment()Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0, p1}, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;->setPalette(Ln1/h;)V

    .line 25
    .line 26
    .line 27
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method

.method private final getDetailsFragment()Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->detailsFragment$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;

    .line 8
    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method private final getImageView()Lcom/ortiz/touchview/TouchImageView;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->imageView$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/ortiz/touchview/TouchImageView;

    .line 8
    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method private final getToolbar()Landroidx/appcompat/widget/Toolbar;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->toolbar$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 8
    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method private final hasValidNetworkAvailable()Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/ViewerActivity;->getPreferences()Ldev/jahir/frames/data/Preferences;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ldev/jahir/frames/data/Preferences;->getShouldDownloadOnWiFiOnly()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {p0}, Ldev/jahir/frames/extensions/context/ContextKt;->isNetworkAvailable(Landroid/content/Context;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x1

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v0, :cond_7

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    :try_start_0
    const-class v4, Landroid/net/ConnectivityManager;

    .line 19
    .line 20
    invoke-static {p0, v4}, Lq3/a;->J(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    check-cast v4, Landroid/net/ConnectivityManager;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catch_0
    nop

    .line 28
    move-object v4, v0

    .line 29
    :goto_0
    if-nez v4, :cond_1

    .line 30
    .line 31
    :try_start_1
    const-string v5, "connectivity"

    .line 32
    .line 33
    invoke-virtual {p0, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    instance-of v6, v5, Landroid/net/ConnectivityManager;

    .line 38
    .line 39
    if-eqz v6, :cond_0

    .line 40
    .line 41
    move-object v0, v5

    .line 42
    check-cast v0, Landroid/net/ConnectivityManager;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :catch_1
    nop

    .line 46
    goto :goto_2

    .line 47
    :cond_0
    :goto_1
    move-object v4, v0

    .line 48
    :cond_1
    :goto_2
    if-nez v4, :cond_3

    .line 49
    .line 50
    :cond_2
    :goto_3
    const/4 v0, 0x0

    .line 51
    goto :goto_4

    .line 52
    :cond_3
    :try_start_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 53
    .line 54
    const/16 v5, 0x17

    .line 55
    .line 56
    if-lt v0, v5, :cond_5

    .line 57
    .line 58
    invoke-static {v4}, Ln0/d;->b(Landroid/net/ConnectivityManager;)Landroid/net/Network;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-nez v0, :cond_4

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_4
    invoke-virtual {v4, v0}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    if-eqz v0, :cond_2

    .line 70
    .line 71
    invoke-virtual {v0, v2}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    goto :goto_4

    .line 76
    :catch_2
    nop

    .line 77
    goto :goto_3

    .line 78
    :cond_5
    invoke-virtual {v4}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    if-nez v0, :cond_6

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_6
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isAvailable()Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-eqz v4, :cond_2

    .line 90
    .line 91
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnectedOrConnecting()Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-eqz v4, :cond_2

    .line 96
    .line 97
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I

    .line 98
    .line 99
    .line 100
    move-result v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 101
    if-ne v0, v2, :cond_2

    .line 102
    .line 103
    const/4 v0, 0x1

    .line 104
    :goto_4
    if-nez v0, :cond_7

    .line 105
    .line 106
    if-eqz v1, :cond_7

    .line 107
    .line 108
    const/4 v0, 0x1

    .line 109
    goto :goto_5

    .line 110
    :cond_7
    const/4 v0, 0x0

    .line 111
    :goto_5
    if-eqz v1, :cond_9

    .line 112
    .line 113
    if-eqz v0, :cond_8

    .line 114
    .line 115
    goto :goto_6

    .line 116
    :cond_8
    const/4 v1, 0x0

    .line 117
    goto :goto_7

    .line 118
    :cond_9
    :goto_6
    const/4 v1, 0x1

    .line 119
    :goto_7
    if-eqz v1, :cond_b

    .line 120
    .line 121
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/ViewerActivity;->dismissDownloadBlockedDialog()V

    .line 122
    .line 123
    .line 124
    new-instance v1, Ldev/jahir/frames/ui/activities/i;

    .line 125
    .line 126
    invoke-direct {v1, v0}, Ldev/jahir/frames/ui/activities/i;-><init>(Z)V

    .line 127
    .line 128
    .line 129
    invoke-static {p0, v1}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->mdDialog(Landroid/content/Context;Ld5/l;)Landroidx/appcompat/app/r;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    iput-object v0, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->downloadBlockedDialog:Landroidx/appcompat/app/r;

    .line 134
    .line 135
    if-eqz v0, :cond_a

    .line 136
    .line 137
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 138
    .line 139
    .line 140
    :cond_a
    return v3

    .line 141
    :cond_b
    return v2
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method private static final hasValidNetworkAvailable$lambda$23(ZLcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 1

    .line 1
    const-string v0, "$this$mdDialog"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Ldev/jahir/frames/R$string;->error:I

    .line 7
    .line 8
    invoke-static {p1, v0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->title(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;I)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 9
    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    sget p0, Ldev/jahir/frames/R$string;->data_error_network_wifi_only:I

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget p0, Ldev/jahir/frames/R$string;->data_error_network:I

    .line 17
    .line 18
    :goto_0
    invoke-static {p1, p0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->message(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;I)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 19
    .line 20
    .line 21
    new-instance p0, Ldev/jahir/frames/ui/activities/c;

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    invoke-direct {p0, v0}, Ldev/jahir/frames/ui/activities/c;-><init>(I)V

    .line 25
    .line 26
    .line 27
    const v0, 0x104000a

    .line 28
    .line 29
    .line 30
    invoke-static {p1, v0, p0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->positiveButton(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;ILd5/l;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method

.method private static final hasValidNetworkAvailable$lambda$23$lambda$22(Landroid/content/DialogInterface;)Lp4/k;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 10
    .line 11
    return-object p0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method private final initWindow()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/16 v1, 0x700

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/high16 v1, -0x80000000

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "getAttributes(...)"

    .line 32
    .line 33
    invoke-static {v0, v1}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 37
    .line 38
    const v2, -0x4000001

    .line 39
    .line 40
    .line 41
    and-int/2addr v1, v2

    .line 42
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v1, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseSystemUIVisibilityActivity;->getAppbar$library_release()Lcom/google/android/material/appbar/AppBarLayout;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    new-instance v1, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/g;

    .line 58
    .line 59
    const/4 v2, 0x3

    .line 60
    invoke-direct {v1, v2, v0, p0}, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    sget-object v2, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 64
    .line 65
    invoke-static {v0, v1}, Lm0/k0;->u(Landroid/view/View;Lm0/w;)V

    .line 66
    .line 67
    .line 68
    :cond_0
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseSystemUIVisibilityActivity;->getBottomNavigation()Ldev/jahir/frames/ui/widgets/FramesBottomNavigationView;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-eqz v0, :cond_1

    .line 73
    .line 74
    new-instance v1, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;

    .line 75
    .line 76
    const/16 v2, 0xb

    .line 77
    .line 78
    invoke-direct {v1, v2, v0}, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;-><init>(ILjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    sget-object v2, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 82
    .line 83
    invoke-static {v0, v1}, Lm0/k0;->u(Landroid/view/View;Lm0/w;)V

    .line 84
    .line 85
    .line 86
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    sget v1, Ldev/jahir/frames/R$color;->viewer_bars_colors:I

    .line 91
    .line 92
    const/4 v2, 0x0

    .line 93
    const/4 v3, 0x2

    .line 94
    const/4 v4, 0x0

    .line 95
    invoke-static {p0, v1, v2, v3, v4}, Ldev/jahir/frames/extensions/context/ContextKt;->color$default(Landroid/content/Context;IIILjava/lang/Object;)I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    sget v1, Ldev/jahir/frames/R$color;->viewer_bars_colors:I

    .line 107
    .line 108
    invoke-static {p0, v1, v2, v3, v4}, Ldev/jahir/frames/extensions/context/ContextKt;->color$default(Landroid/content/Context;IIILjava/lang/Object;)I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    invoke-virtual {v0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 113
    .line 114
    .line 115
    return-void
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method private static final initWindow$lambda$19$lambda$18(Lcom/google/android/material/appbar/AppBarLayout;Ldev/jahir/frames/ui/activities/ViewerActivity;Landroid/view/View;Lm0/c2;)Lm0/c2;
    .locals 3

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "insets"

    .line 7
    .line 8
    invoke-static {p3, p2}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p3}, Lm0/c2;->d()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    invoke-static {p0, p2}, Ldev/jahir/frames/extensions/views/ViewKt;->setPaddingTop(Landroid/view/View;I)V

    .line 16
    .line 17
    .line 18
    sget p2, Ldev/jahir/frames/R$bool;->is_landscape:I

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    const/4 v1, 0x2

    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-static {p1, p2, v0, v1, v2}, Ldev/jahir/frames/extensions/context/ContextKt;->boolean$default(Landroid/content/Context;IZILjava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-eqz p2, :cond_0

    .line 28
    .line 29
    invoke-virtual {p3}, Lm0/c2;->b()I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p2, 0x0

    .line 35
    :goto_0
    invoke-static {p0, p2}, Ldev/jahir/frames/extensions/views/ViewKt;->setPaddingLeft(Landroid/view/View;I)V

    .line 36
    .line 37
    .line 38
    sget p2, Ldev/jahir/frames/R$bool;->is_landscape:I

    .line 39
    .line 40
    invoke-static {p1, p2, v0, v1, v2}, Ldev/jahir/frames/extensions/context/ContextKt;->boolean$default(Landroid/content/Context;IZILjava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    invoke-virtual {p3}, Lm0/c2;->c()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    :cond_1
    invoke-static {p0, v0}, Ldev/jahir/frames/extensions/views/ViewKt;->setPaddingRight(Landroid/view/View;I)V

    .line 51
    .line 52
    .line 53
    return-object p3
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
.end method

.method private static final initWindow$lambda$21$lambda$20(Ldev/jahir/frames/ui/widgets/FramesBottomNavigationView;Landroid/view/View;Lm0/c2;)Lm0/c2;
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "insets"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Lm0/c2;->a()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-static {p0, p1}, Ldev/jahir/frames/extensions/views/ViewKt;->setPaddingBottom(Landroid/view/View;I)V

    .line 16
    .line 17
    .line 18
    return-object p2
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method

.method private final loadWallpaper(Ldev/jahir/frames/data/models/Wallpaper;)V
    .locals 12

    .line 1
    sget v0, Ldev/jahir/frames/R$id;->loading:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/u;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, Ldev/jahir/frames/extensions/views/ViewKt;->visible$default(Landroid/view/View;ZILjava/lang/Object;)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    const-string v4, "wallpaper"

    .line 28
    .line 29
    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ldev/jahir/frames/data/models/Wallpaper;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0}, Ldev/jahir/frames/data/models/Wallpaper;->getUrl()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move-object v0, v3

    .line 43
    :goto_0
    :try_start_0
    invoke-virtual {p1}, Ldev/jahir/frames/data/models/Wallpaper;->getUrl()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-static {v0, v4}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    const-string v0, "thumb.jpg"

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    .line 56
    .line 57
    .line 58
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    :try_start_1
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 62
    .line 63
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->getResources()Landroid/content/res/Resources;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-direct {v0, v2, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Ljava/io/InputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    .line 69
    .line 70
    :try_start_2
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 71
    .line 72
    .line 73
    :goto_1
    move-object v7, v0

    .line 74
    goto :goto_3

    .line 75
    :catch_0
    nop

    .line 76
    move-object v3, v0

    .line 77
    goto :goto_2

    .line 78
    :catchall_0
    move-exception v0

    .line 79
    move-object v2, v0

    .line 80
    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 81
    :catchall_1
    move-exception v0

    .line 82
    :try_start_4
    invoke-static {v1, v2}, Lq3/a;->p(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    throw v0

    .line 86
    :catch_1
    nop

    .line 87
    :cond_2
    :goto_2
    move-object v7, v3

    .line 88
    goto :goto_3

    .line 89
    :cond_3
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/ViewerActivity;->getImageView()Lcom/ortiz/touchview/TouchImageView;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    if-eqz v0, :cond_4

    .line 94
    .line 95
    invoke-static {v0}, Lo3/e;->c(Landroid/view/View;)Lj3/t;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v0}, Lj3/t;->a()V

    .line 100
    .line 101
    .line 102
    :cond_4
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 103
    .line 104
    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 105
    .line 106
    .line 107
    :try_start_5
    iput-boolean v2, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->firstImageLoad:Z

    .line 108
    .line 109
    invoke-static {p0, v3, v2, v3}, Ldev/jahir/frames/ui/activities/ViewerActivity;->setBackgroundColor$default(Ldev/jahir/frames/ui/activities/ViewerActivity;Ljava/lang/Integer;ILjava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :goto_3
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/ViewerActivity;->getImageView()Lcom/ortiz/touchview/TouchImageView;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    if-eqz v4, :cond_5

    .line 118
    .line 119
    invoke-virtual {p1}, Ldev/jahir/frames/data/models/Wallpaper;->getUrl()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    invoke-virtual {p1}, Ldev/jahir/frames/data/models/Wallpaper;->getThumbnail()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    new-instance v11, Ldev/jahir/frames/ui/activities/l;

    .line 128
    .line 129
    const/4 p1, 0x1

    .line 130
    invoke-direct {v11, p0, p1}, Ldev/jahir/frames/ui/activities/l;-><init>(Ldev/jahir/frames/ui/activities/ViewerActivity;I)V

    .line 131
    .line 132
    .line 133
    const/4 v8, 0x1

    .line 134
    const/4 v9, 0x0

    .line 135
    const/4 v10, 0x0

    .line 136
    invoke-static/range {v4 .. v11}, Ldev/jahir/frames/extensions/views/ImageViewKt;->loadFramesPic(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;ZZZLd5/l;)V

    .line 137
    .line 138
    .line 139
    :cond_5
    return-void
    .line 140
.end method

.method private static final loadWallpaper$lambda$17(Ldev/jahir/frames/ui/activities/ViewerActivity;Landroid/graphics/drawable/Drawable;)Lp4/k;
    .locals 4

    .line 1
    iget-boolean v0, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->firstImageLoad:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->firstImageLoad:Z

    .line 7
    .line 8
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/ViewerActivity;->getImageView()Lcom/ortiz/touchview/TouchImageView;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    new-instance v1, Lc4/f;

    .line 15
    .line 16
    new-instance v2, Landroid/graphics/PointF;

    .line 17
    .line 18
    const/high16 v3, 0x3f000000    # 0.5f

    .line 19
    .line 20
    invoke-direct {v2, v3, v3}, Landroid/graphics/PointF;-><init>(FF)V

    .line 21
    .line 22
    .line 23
    invoke-direct {v1, v0, v2}, Lc4/f;-><init>(Lcom/ortiz/touchview/TouchImageView;Landroid/graphics/PointF;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-direct {p0, p1}, Ldev/jahir/frames/ui/activities/ViewerActivity;->generatePalette(Landroid/graphics/drawable/Drawable;)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 33
    .line 34
    return-object p0
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method

.method private static final onCreate$lambda$6(Ldev/jahir/frames/ui/activities/ViewerActivity;Ljava/util/List;)Lp4/k;
    .locals 3

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Ldev/jahir/frames/data/models/Wallpaper;

    .line 29
    .line 30
    invoke-virtual {v0}, Ldev/jahir/frames/data/models/Wallpaper;->getUrl()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseWallpaperFetcherActivity;->getWallpaperDownloadUrl$library_release()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-static {v0, v2}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    :cond_2
    :goto_0
    invoke-direct {p0, v1}, Ldev/jahir/frames/ui/activities/ViewerActivity;->setInFavorites(Z)V

    .line 46
    .line 47
    .line 48
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 49
    .line 50
    return-object p0
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method

.method private static final preferences_delegate$lambda$0(Ldev/jahir/frames/ui/activities/ViewerActivity;)Ldev/jahir/frames/data/Preferences;
    .locals 1

    .line 1
    new-instance v0, Ldev/jahir/frames/data/Preferences;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ldev/jahir/frames/data/Preferences;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-object v0
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method private final setBackgroundColor(Ljava/lang/Integer;)V
    .locals 4

    .line 1
    sget v0, Ldev/jahir/frames/R$id;->activity_root_view:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/u;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x2

    .line 17
    const/4 v1, 0x0

    .line 18
    const v2, 0x1010031

    .line 19
    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-static {p0, v2, v3, p1, v1}, Ldev/jahir/frames/extensions/context/ContextKt;->resolveColor$default(Landroid/content/Context;IIILjava/lang/Object;)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static synthetic setBackgroundColor$default(Ldev/jahir/frames/ui/activities/ViewerActivity;Ljava/lang/Integer;ILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    and-int/lit8 p2, p2, 0x1

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    :cond_0
    invoke-direct {p0, p1}, Ldev/jahir/frames/ui/activities/ViewerActivity;->setBackgroundColor(Ljava/lang/Integer;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 13
    .line 14
    const-string p1, "Super calls with default arguments not supported in this target, function: setBackgroundColor"

    .line 15
    .line 16
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
.end method

.method private final setInFavorites(Z)V
    .locals 2

    .line 1
    iput-boolean p1, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->isInFavorites:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseSystemUIVisibilityActivity;->getBottomNavigation()Ldev/jahir/frames/ui/widgets/FramesBottomNavigationView;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    sget p1, Ldev/jahir/frames/R$id;->favorites:I

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget p1, Ldev/jahir/frames/R$id;->details:I

    .line 15
    .line 16
    :goto_0
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, p1, v1}, Ldev/jahir/frames/ui/widgets/FramesBottomNavigationView;->setSelectedItemId(IZ)V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method private final shouldShowWallpapersPalette()Z
    .locals 2

    .line 1
    sget v0, Ldev/jahir/frames/R$bool;->show_wallpaper_palette_details:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {p0, v0, v1}, Ldev/jahir/frames/extensions/context/ContextKt;->boolean(Landroid/content/Context;IZ)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public static synthetic u(Ldev/jahir/frames/ui/activities/ViewerActivity;Ldev/jahir/frames/data/models/Wallpaper;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ldev/jahir/frames/ui/activities/ViewerActivity;->configureUIForWallpaper$lambda$11(Ldev/jahir/frames/ui/activities/ViewerActivity;Ldev/jahir/frames/data/models/Wallpaper;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method

.method public static synthetic v(Landroid/content/DialogInterface;)Lp4/k;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/frames/ui/activities/ViewerActivity;->hasValidNetworkAvailable$lambda$23$lambda$22(Landroid/content/DialogInterface;)Lp4/k;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static synthetic w(Ldev/jahir/frames/ui/activities/ViewerActivity;)Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/frames/ui/activities/ViewerActivity;->detailsFragment_delegate$lambda$1(Ldev/jahir/frames/ui/activities/ViewerActivity;)Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static synthetic x(Landroid/content/DialogInterface;)Lp4/k;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/frames/ui/activities/ViewerActivity;->checkForDownload$lambda$25$lambda$24(Landroid/content/DialogInterface;)Lp4/k;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static synthetic y(Ldev/jahir/frames/ui/activities/ViewerActivity;Landroid/graphics/drawable/Drawable;)Lp4/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/frames/ui/activities/ViewerActivity;->loadWallpaper$lambda$17(Ldev/jahir/frames/ui/activities/ViewerActivity;Landroid/graphics/drawable/Drawable;)Lp4/k;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method

.method public static synthetic z(Ldev/jahir/frames/ui/activities/ViewerActivity;Ljava/lang/String;Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ldev/jahir/frames/ui/activities/ViewerActivity;->checkForDownload$lambda$25(Ldev/jahir/frames/ui/activities/ViewerActivity;Ljava/lang/String;Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method


# virtual methods
.method public canToggleSystemUIVisibility()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v2, "can_toggle_visibility"

    .line 9
    .line 10
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0

    .line 15
    :cond_0
    return v1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public finish()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/ViewerActivity;->getImageView()Lcom/ortiz/touchview/TouchImageView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/high16 v1, 0x3f800000    # 1.0f

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/ortiz/touchview/TouchImageView;->setZoom(F)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-boolean v0, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->favoritesModified:Z

    .line 13
    .line 14
    new-instance v1, Landroid/content/Intent;

    .line 15
    .line 16
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v2, "favorites_modified"

    .line 20
    .line 21
    iget-boolean v3, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->favoritesModified:Z

    .line 22
    .line 23
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 27
    .line 28
    .line 29
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    .line 30
    .line 31
    .line 32
    return-void
    .line 33
.end method

.method public getPreferences()Ldev/jahir/frames/data/Preferences;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->preferences$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/frames/data/Preferences;

    .line 8
    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public getShouldChangeNavigationBarLightStatus()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->shouldChangeNavigationBarLightStatus:Z

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public getShouldChangeStatusBarLightStatus()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->shouldChangeStatusBarLightStatus:Z

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public handleNavigationItemSelected(ILdev/jahir/frames/data/models/Wallpaper;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    sget v1, Ldev/jahir/frames/R$id;->details:I

    .line 6
    .line 7
    if-ne p1, v1, :cond_1

    .line 8
    .line 9
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/ViewerActivity;->getDetailsFragment()Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string p2, "DETAILS_FRAG"

    .line 14
    .line 15
    invoke-virtual {p1, p0, p2}, Ldev/jahir/frames/ui/fragments/base/BaseBottomSheet;->show(Landroidx/fragment/app/q0;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    sget v1, Ldev/jahir/frames/R$id;->download:I

    .line 20
    .line 21
    if-ne p1, v1, :cond_2

    .line 22
    .line 23
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/ViewerActivity;->checkForDownload()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_2
    sget v1, Ldev/jahir/frames/R$id;->apply:I

    .line 28
    .line 29
    if-ne p1, v1, :cond_3

    .line 30
    .line 31
    invoke-direct {p0, p2}, Ldev/jahir/frames/ui/activities/ViewerActivity;->applyWallpaper(Ldev/jahir/frames/data/models/Wallpaper;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_3
    sget v1, Ldev/jahir/frames/R$id;->favorites:I

    .line 36
    .line 37
    if-ne p1, v1, :cond_6

    .line 38
    .line 39
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;->canModifyFavorites()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_5

    .line 44
    .line 45
    const/4 p1, 0x1

    .line 46
    iput-boolean p1, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->favoritesModified:Z

    .line 47
    .line 48
    iget-boolean p1, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->isInFavorites:Z

    .line 49
    .line 50
    if-eqz p1, :cond_4

    .line 51
    .line 52
    invoke-virtual {p0, p2}, Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;->removeFromFavorites$library_release(Ldev/jahir/frames/data/models/Wallpaper;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_4
    invoke-virtual {p0, p2}, Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;->addToFavorites$library_release(Ldev/jahir/frames/data/models/Wallpaper;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_5
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;->onFavoritesLocked()V

    .line 61
    .line 62
    .line 63
    :cond_6
    :goto_0
    return v0
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method

.method public internalOnPermissionsGranted(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "permission"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;->internalOnPermissionsGranted(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseWallpaperFetcherActivity;->startDownload$library_release()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0xd

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/view/Window;->requestFeature(I)Z

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 20
    .line 21
    .line 22
    const v0, 0x1020002

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/u;->findViewById(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-string v3, "wallpaper_transition_container"

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Landroid/view/View;->setTransitionName(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    new-instance v2, Lcom/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback;

    .line 35
    .line 36
    invoke-direct {v2}, Lcom/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v2}, Landroid/app/Activity;->setEnterSharedElementCallback(Landroid/app/SharedElementCallback;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    new-instance v3, Lcom/google/android/material/transition/platform/MaterialContainerTransform;

    .line 47
    .line 48
    invoke-direct {v3}, Lcom/google/android/material/transition/platform/MaterialContainerTransform;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v0}, Landroid/transition/Transition;->addTarget(I)Landroid/transition/Transition;

    .line 52
    .line 53
    .line 54
    const-wide/16 v4, 0x12c

    .line 55
    .line 56
    invoke-virtual {v3, v4, v5}, Landroid/transition/Transition;->setDuration(J)Landroid/transition/Transition;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v3}, Landroid/view/Window;->setSharedElementEnterTransition(Landroid/transition/Transition;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    new-instance v3, Lcom/google/android/material/transition/platform/MaterialContainerTransform;

    .line 67
    .line 68
    invoke-direct {v3}, Lcom/google/android/material/transition/platform/MaterialContainerTransform;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3, v0}, Landroid/transition/Transition;->addTarget(I)Landroid/transition/Transition;

    .line 72
    .line 73
    .line 74
    const-wide/16 v4, 0xfa

    .line 75
    .line 76
    invoke-virtual {v3, v4, v5}, Landroid/transition/Transition;->setDuration(J)Landroid/transition/Transition;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v3}, Landroid/view/Window;->setSharedElementReturnTransition(Landroid/transition/Transition;)V

    .line 80
    .line 81
    .line 82
    invoke-super {p0, p1}, Ldev/jahir/frames/ui/activities/base/BaseWallpaperApplierActivity;->onCreate(Landroid/os/Bundle;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    and-int/lit16 v0, v0, -0x2001

    .line 106
    .line 107
    invoke-virtual {v2, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    const-string v2, "getWindow(...)"

    .line 115
    .line 116
    invoke-static {v0, v2}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-virtual {v2}, Landroid/view/View;->getSystemUiVisibility()I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    and-int/lit8 v2, v2, -0x11

    .line 132
    .line 133
    invoke-virtual {v0, v2}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    const/16 v2, 0x2000

    .line 141
    .line 142
    invoke-virtual {v0, v2, v2}, Landroid/view/Window;->setFlags(II)V

    .line 143
    .line 144
    .line 145
    sget v0, Ldev/jahir/frames/R$layout;->activity_viewer:I

    .line 146
    .line 147
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/u;->setContentView(I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseSystemUIVisibilityActivity;->getBottomNavigation()Ldev/jahir/frames/ui/widgets/FramesBottomNavigationView;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    const/4 v2, 0x1

    .line 155
    if-eqz v0, :cond_0

    .line 156
    .line 157
    invoke-virtual {v0, v2}, Lcom/google/android/material/navigation/NavigationBarView;->setLabelVisibilityMode(I)V

    .line 158
    .line 159
    .line 160
    :cond_0
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/ViewerActivity;->getToolbar()Landroidx/appcompat/widget/Toolbar;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/u;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->getSupportActionBar()Landroidx/appcompat/app/a;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    if-eqz v0, :cond_1

    .line 172
    .line 173
    invoke-virtual {v0}, Landroidx/appcompat/app/a;->r()V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, v2}, Landroidx/appcompat/app/a;->m(Z)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0}, Landroidx/appcompat/app/a;->n()V

    .line 180
    .line 181
    .line 182
    :cond_1
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/ViewerActivity;->initWindow()V

    .line 183
    .line 184
    .line 185
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/ViewerActivity;->getToolbar()Landroidx/appcompat/widget/Toolbar;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    const/4 v2, 0x0

    .line 190
    if-eqz v0, :cond_2

    .line 191
    .line 192
    sget v3, Ldev/jahir/frames/R$color;->white:I

    .line 193
    .line 194
    const/4 v4, 0x2

    .line 195
    invoke-static {p0, v3, v1, v4, v2}, Ldev/jahir/frames/extensions/context/ContextKt;->color$default(Landroid/content/Context;IIILjava/lang/Object;)I

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    invoke-static {v0, v3}, Ldev/jahir/frames/extensions/views/ToolbarKt;->tint(Landroidx/appcompat/widget/Toolbar;I)V

    .line 200
    .line 201
    .line 202
    :cond_2
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/ViewerActivity;->getImageView()Lcom/ortiz/touchview/TouchImageView;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    if-eqz v0, :cond_3

    .line 207
    .line 208
    new-instance v3, Ldev/jahir/frames/ui/activities/ViewerActivity$onCreate$4;

    .line 209
    .line 210
    invoke-direct {v3, p0}, Ldev/jahir/frames/ui/activities/ViewerActivity$onCreate$4;-><init>(Ldev/jahir/frames/ui/activities/ViewerActivity;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0, v3}, Lcom/ortiz/touchview/TouchImageView;->setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V

    .line 214
    .line 215
    .line 216
    :cond_3
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;->getWallpapersViewModel()Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    new-instance v3, Ldev/jahir/frames/ui/activities/l;

    .line 221
    .line 222
    const/4 v4, 0x0

    .line 223
    invoke-direct {v3, p0, v4}, Ldev/jahir/frames/ui/activities/l;-><init>(Ldev/jahir/frames/ui/activities/ViewerActivity;I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0, p0, v3}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->observeFavorites(Landroidx/lifecycle/w;Ld5/l;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    if-eqz v0, :cond_4

    .line 234
    .line 235
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    if-eqz v0, :cond_4

    .line 240
    .line 241
    const-string v3, "collection_name"

    .line 242
    .line 243
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    goto :goto_0

    .line 248
    :cond_4
    move-object v0, v2

    .line 249
    :goto_0
    iput-object v0, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->collectionName:Ljava/lang/String;

    .line 250
    .line 251
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    if-eqz v0, :cond_5

    .line 256
    .line 257
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    if-eqz v0, :cond_5

    .line 262
    .line 263
    const-string v3, "viewer_is_for_favs"

    .line 264
    .line 265
    invoke-virtual {v0, v3, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    :cond_5
    iput-boolean v1, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->isForFavs:Z

    .line 270
    .line 271
    if-eqz p1, :cond_6

    .line 272
    .line 273
    const-string v0, "wallpaper_download_url"

    .line 274
    .line 275
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    goto :goto_1

    .line 280
    :cond_6
    move-object p1, v2

    .line 281
    :goto_1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    if-eqz v0, :cond_7

    .line 286
    .line 287
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    if-eqz v0, :cond_7

    .line 292
    .line 293
    const-string v1, "wallpaper"

    .line 294
    .line 295
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    check-cast v0, Ldev/jahir/frames/data/models/Wallpaper;

    .line 300
    .line 301
    if-eqz v0, :cond_7

    .line 302
    .line 303
    invoke-virtual {v0}, Ldev/jahir/frames/data/models/Wallpaper;->getUrl()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    goto :goto_2

    .line 308
    :cond_7
    move-object v0, v2

    .line 309
    :goto_2
    invoke-static {p0}, Landroidx/lifecycle/t0;->e(Landroidx/fragment/app/q0;)Landroidx/lifecycle/r;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    new-instance v3, Ldev/jahir/frames/ui/activities/ViewerActivity$onCreate$6;

    .line 314
    .line 315
    invoke-direct {v3, p0, p1, v0, v2}, Ldev/jahir/frames/ui/activities/ViewerActivity$onCreate$6;-><init>(Ldev/jahir/frames/ui/activities/ViewerActivity;Ljava/lang/String;Ljava/lang/String;Lt4/c;)V

    .line 316
    .line 317
    .line 318
    const/4 p1, 0x3

    .line 319
    invoke-static {v1, v2, v2, v3, p1}, Ln5/x;->p(Ln5/v;Lt4/h;Ln5/w;Ld5/p;I)Ln5/a0;

    .line 320
    .line 321
    .line 322
    return-void
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
.end method

.method public onDestroy()V
    .locals 0

    .line 1
    invoke-super {p0}, Ldev/jahir/frames/ui/activities/base/BaseWallpaperFetcherActivity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/ViewerActivity;->dismissApplierDialog()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/ViewerActivity;->dismissDownloadBlockedDialog()V

    .line 8
    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const v1, 0x102002c

    .line 11
    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/fragment/app/q0;->supportFinishAfterTransition()V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    const-string v0, "savedInstanceState"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ldev/jahir/frames/ui/activities/base/BaseWallpaperFetcherActivity;->onRestoreInstanceState(Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    const-string v0, "closing"

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput-boolean v0, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->closing:Z

    .line 17
    .line 18
    const-string v0, "transitioned"

    .line 19
    .line 20
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iput-boolean v0, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->transitioned:Z

    .line 25
    .line 26
    const-string v0, "is_in_favorites"

    .line 27
    .line 28
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-direct {p0, v0}, Ldev/jahir/frames/ui/activities/ViewerActivity;->setInFavorites(Z)V

    .line 33
    .line 34
    .line 35
    const-string v0, "favorites_modified"

    .line 36
    .line 37
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    iput-boolean p1, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->favoritesModified:Z

    .line 42
    .line 43
    return-void
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    const-string v0, "outState"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ldev/jahir/frames/ui/activities/base/BaseWallpaperFetcherActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    const-string v0, "closing"

    .line 10
    .line 11
    iget-boolean v1, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->closing:Z

    .line 12
    .line 13
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 14
    .line 15
    .line 16
    const-string v0, "transitioned"

    .line 17
    .line 18
    iget-boolean v1, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->transitioned:Z

    .line 19
    .line 20
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "is_in_favorites"

    .line 24
    .line 25
    iget-boolean v1, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->isInFavorites:Z

    .line 26
    .line 27
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    const-string v0, "favorites_modified"

    .line 31
    .line 32
    iget-boolean v1, p0, Ldev/jahir/frames/ui/activities/ViewerActivity;->favoritesModified:Z

    .line 33
    .line 34
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public shouldLoadCollections()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public shouldShowDownloadOption()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method
