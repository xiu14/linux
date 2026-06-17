.class public Ldev/jahir/frames/ui/fragments/WallpapersFragment;
.super Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldev/jahir/frames/ui/fragments/WallpapersFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment<",
        "Ldev/jahir/frames/data/models/Wallpaper;",
        ">;"
    }
.end annotation


# static fields
.field public static final Companion:Ldev/jahir/frames/ui/fragments/WallpapersFragment$Companion;

.field public static final FAVS_TAG:Ljava/lang/String; = "favorites_fragment"

.field public static final IN_COLLECTION_TAG:Ljava/lang/String; = "wallpapers_in_collection_fragment"

.field public static final TAG:Ljava/lang/String; = "wallpapers_fragment"

.field public static final WALLPAPER_EXTRA:Ljava/lang/String; = "wallpaper"

.field public static final WALLPAPER_IN_FAVS_EXTRA:Ljava/lang/String; = "wallpaper_in_favs"


# instance fields
.field private final canShowFavoritesButton:Z

.field private collectionName:Ljava/lang/String;

.field private isForFavs:Z

.field private openActivityLauncher:Ld/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld/c;"
        }
    .end annotation
.end field

.field private final wallsAdapter$delegate:Lp4/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldev/jahir/frames/ui/fragments/WallpapersFragment$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ldev/jahir/frames/ui/fragments/WallpapersFragment$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->Companion:Ldev/jahir/frames/ui/fragments/WallpapersFragment$Companion;

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
    .locals 2

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->canShowFavoritesButton:Z

    .line 6
    .line 7
    new-instance v0, La2/e;

    .line 8
    .line 9
    const/16 v1, 0x13

    .line 10
    .line 11
    invoke-direct {v0, v1, p0}, La2/e;-><init>(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->wallsAdapter$delegate:Lp4/c;

    .line 19
    .line 20
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
.end method

.method public static final create(Ljava/util/ArrayList;Z)Ldev/jahir/frames/ui/fragments/WallpapersFragment;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;Z)",
            "Ldev/jahir/frames/ui/fragments/WallpapersFragment;"
        }
    .end annotation

    .line 1
    sget-object v0, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->Companion:Ldev/jahir/frames/ui/fragments/WallpapersFragment$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Ldev/jahir/frames/ui/fragments/WallpapersFragment$Companion;->create(Ljava/util/ArrayList;Z)Ldev/jahir/frames/ui/fragments/WallpapersFragment;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
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

.method public static final createForFavs(Ljava/util/ArrayList;Z)Ldev/jahir/frames/ui/fragments/WallpapersFragment;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;Z)",
            "Ldev/jahir/frames/ui/fragments/WallpapersFragment;"
        }
    .end annotation

    .line 1
    sget-object v0, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->Companion:Ldev/jahir/frames/ui/fragments/WallpapersFragment$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Ldev/jahir/frames/ui/fragments/WallpapersFragment$Companion;->createForFavs(Ljava/util/ArrayList;Z)Ldev/jahir/frames/ui/fragments/WallpapersFragment;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
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

.method private final getWallsAdapter()Ldev/jahir/frames/ui/adapters/WallpapersAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->wallsAdapter$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/frames/ui/adapters/WallpapersAdapter;

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

.method private final launchViewer(Ldev/jahir/frames/data/models/Wallpaper;Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->getTargetActivityIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "can_toggle_visibility"

    .line 6
    .line 7
    invoke-virtual {p0}, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->canToggleSystemUIVisibility()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 12
    .line 13
    .line 14
    const-string v1, "wallpaper"

    .line 15
    .line 16
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 17
    .line 18
    .line 19
    const-string v1, "wallpaper_in_favs"

    .line 20
    .line 21
    invoke-virtual {p1}, Ldev/jahir/frames/data/models/Wallpaper;->isInFavorites()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    instance-of v1, p1, Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity;

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    check-cast p1, Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move-object p1, v2

    .line 41
    :goto_0
    const/4 v1, 0x0

    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    invoke-virtual {p1}, Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity;->getLicenseCheckEnabled()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const/4 p1, 0x0

    .line 50
    :goto_1
    const-string v3, "license_check_enabled"

    .line 51
    .line 52
    invoke-virtual {v0, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 53
    .line 54
    .line 55
    const-string p1, "collection_name"

    .line 56
    .line 57
    iget-object v3, p0, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->collectionName:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v0, p1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 60
    .line 61
    .line 62
    const-string p1, "viewer_is_for_favs"

    .line 63
    .line 64
    iget-boolean v3, p0, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->isForFavs:Z

    .line 65
    .line 66
    invoke-virtual {v0, p1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->getCard$library_release()Lcom/google/android/material/card/MaterialCardView;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    new-instance v4, Ldev/jahir/blueprint/ui/activities/g;

    .line 78
    .line 79
    const/16 v5, 0x8

    .line 80
    .line 81
    invoke-direct {v4, v5}, Ldev/jahir/blueprint/ui/activities/g;-><init>(I)V

    .line 82
    .line 83
    .line 84
    invoke-static {p1, v3, v4}, Ldev/jahir/frames/extensions/utils/GlobalKt;->ifNotNull(Ljava/lang/Object;Ljava/lang/Object;Ld5/p;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    move-object v3, p1

    .line 89
    check-cast v3, Lb0/j;

    .line 90
    .line 91
    invoke-static {p0}, Ldev/jahir/frames/extensions/fragments/FragmentKt;->getPreferences(Landroidx/fragment/app/l0;)Ldev/jahir/frames/data/Preferences;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-virtual {v3}, Ldev/jahir/frames/data/Preferences;->getAnimationsEnabled()Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-eqz v3, :cond_2

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_2
    move-object p1, v2

    .line 103
    :goto_2
    check-cast p1, Lb0/j;

    .line 104
    .line 105
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    if-eqz v3, :cond_3

    .line 110
    .line 111
    const-string v4, "thumb.jpg"

    .line 112
    .line 113
    invoke-virtual {v3, v4, v1}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    goto :goto_3

    .line 118
    :catchall_0
    move-exception p1

    .line 119
    goto :goto_4

    .line 120
    :cond_3
    :goto_3
    if-eqz v2, :cond_4

    .line 121
    .line 122
    invoke-virtual {p2}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->getImage$library_release()Ldev/jahir/frames/ui/widgets/PortraitImageView;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    if-eqz p2, :cond_4

    .line 127
    .line 128
    invoke-virtual {p2}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    if-eqz p2, :cond_4

    .line 133
    .line 134
    invoke-static {p2}, Le6/l;->I(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    if-eqz p2, :cond_4

    .line 139
    .line 140
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 141
    .line 142
    const/16 v3, 0x1e

    .line 143
    .line 144
    invoke-virtual {p2, v1, v3, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    .line 146
    .line 147
    :cond_4
    if-eqz v2, :cond_5

    .line 148
    .line 149
    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V

    .line 150
    .line 151
    .line 152
    :cond_5
    if-eqz v2, :cond_6

    .line 153
    .line 154
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V

    .line 155
    .line 156
    .line 157
    :cond_6
    iget-object p2, p0, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->openActivityLauncher:Ld/c;

    .line 158
    .line 159
    if-eqz p2, :cond_7

    .line 160
    .line 161
    invoke-virtual {p2, v0, p1}, Ld/c;->a(Ljava/lang/Object;Lb0/j;)V

    .line 162
    .line 163
    .line 164
    :cond_7
    return-void

    .line 165
    :goto_4
    if-eqz v2, :cond_8

    .line 166
    .line 167
    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V

    .line 168
    .line 169
    .line 170
    :cond_8
    if-eqz v2, :cond_9

    .line 171
    .line 172
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V

    .line 173
    .line 174
    .line 175
    :cond_9
    throw p1
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
.end method

.method private static final launchViewer$lambda$8(Lcom/google/android/material/card/MaterialCardView;Landroidx/fragment/app/q0;)Lb0/j;
    .locals 2

    .line 1
    const-string v0, "materialCardView"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "activity"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lb0/h;

    .line 12
    .line 13
    const-string v1, "wallpaper_transition_container"

    .line 14
    .line 15
    invoke-static {p1, p0, v1}, Lb0/i;->a(Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;)Landroid/app/ActivityOptions;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {v0, p0}, Lb0/h;-><init>(Landroid/app/ActivityOptions;)V

    .line 20
    .line 21
    .line 22
    return-object v0
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

.method public static synthetic m(Ldev/jahir/frames/ui/fragments/WallpapersFragment;Ldev/jahir/frames/ui/adapters/WallpapersAdapter;)Lp4/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->wallsAdapter_delegate$lambda$3$lambda$2(Ldev/jahir/frames/ui/fragments/WallpapersFragment;Ldev/jahir/frames/ui/adapters/WallpapersAdapter;)Lp4/k;

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

.method public static synthetic n(Ldev/jahir/frames/ui/fragments/WallpapersFragment;)Ldev/jahir/frames/ui/adapters/WallpapersAdapter;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->wallsAdapter_delegate$lambda$3(Ldev/jahir/frames/ui/fragments/WallpapersFragment;)Ldev/jahir/frames/ui/adapters/WallpapersAdapter;

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

.method public static synthetic notifyCanModifyFavorites$default(Ldev/jahir/frames/ui/fragments/WallpapersFragment;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    const/4 p3, 0x1

    .line 4
    and-int/2addr p2, p3

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    :cond_0
    invoke-virtual {p0, p1}, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->notifyCanModifyFavorites(Z)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 13
    .line 14
    const-string p1, "Super calls with default arguments not supported in this target, function: notifyCanModifyFavorites"

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

.method public static synthetic o(Lcom/google/android/material/card/MaterialCardView;Landroidx/fragment/app/q0;)Lb0/j;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->launchViewer$lambda$8(Lcom/google/android/material/card/MaterialCardView;Landroidx/fragment/app/q0;)Lb0/j;

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

.method private static final onCreate$lambda$4(Ldev/jahir/frames/ui/fragments/WallpapersFragment;Ld/a;)V
    .locals 3

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget p1, p1, Ld/a;->h:I

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    if-ne p1, v0, :cond_3

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    instance-of v1, p1, Ldev/jahir/frames/ui/activities/CollectionActivity;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    check-cast p1, Ldev/jahir/frames/ui/activities/CollectionActivity;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object p1, v2

    .line 24
    :goto_0
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p1}, Ldev/jahir/frames/ui/activities/CollectionActivity;->setFavoritesModified$library_release()V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    instance-of p1, p0, Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;

    .line 34
    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    check-cast p0, Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move-object p0, v2

    .line 41
    :goto_1
    if-eqz p0, :cond_3

    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    const/4 v1, 0x2

    .line 45
    invoke-static {p0, v0, p1, v1, v2}, Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;->loadWallpapersData$library_release$default(Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;ZZILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :cond_3
    return-void
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

.method private final onFavClick(ZLdev/jahir/frames/data/models/Wallpaper;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v2

    .line 14
    :goto_0
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    invoke-virtual {v0}, Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;->canModifyFavorites()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_2

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0, p2}, Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;->addToFavorites$library_release(Ldev/jahir/frames/data/models/Wallpaper;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    :goto_1
    move v1, p1

    .line 30
    goto :goto_2

    .line 31
    :cond_1
    invoke-virtual {v0, p2}, Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;->removeFromFavorites$library_release(Ldev/jahir/frames/data/models/Wallpaper;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    invoke-virtual {v0}, Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;->onFavoritesLocked()V

    .line 37
    .line 38
    .line 39
    :cond_3
    :goto_2
    if-eqz v1, :cond_5

    .line 40
    .line 41
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    instance-of p2, p1, Ldev/jahir/frames/ui/activities/CollectionActivity;

    .line 46
    .line 47
    if-eqz p2, :cond_4

    .line 48
    .line 49
    move-object v2, p1

    .line 50
    check-cast v2, Ldev/jahir/frames/ui/activities/CollectionActivity;

    .line 51
    .line 52
    :cond_4
    if-eqz v2, :cond_5

    .line 53
    .line 54
    invoke-virtual {v2}, Ldev/jahir/frames/ui/activities/CollectionActivity;->setFavoritesModified$library_release()V

    .line 55
    .line 56
    .line 57
    :cond_5
    return-void
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

.method public static synthetic p(Ldev/jahir/frames/ui/fragments/WallpapersFragment;Ld/a;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->onCreate$lambda$4(Ldev/jahir/frames/ui/fragments/WallpapersFragment;Ld/a;)V

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

.method public static synthetic q(Ldev/jahir/frames/ui/fragments/WallpapersFragment;Ldev/jahir/frames/data/models/Wallpaper;Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;)Lp4/k;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->wallsAdapter_delegate$lambda$3$lambda$2$lambda$0(Ldev/jahir/frames/ui/fragments/WallpapersFragment;Ldev/jahir/frames/data/models/Wallpaper;Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;)Lp4/k;

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

.method public static synthetic r(Ldev/jahir/frames/ui/fragments/WallpapersFragment;ZLdev/jahir/frames/data/models/Wallpaper;)Lp4/k;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->wallsAdapter_delegate$lambda$3$lambda$2$lambda$1(Ldev/jahir/frames/ui/fragments/WallpapersFragment;ZLdev/jahir/frames/data/models/Wallpaper;)Lp4/k;

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

.method private static final wallsAdapter_delegate$lambda$3(Ldev/jahir/frames/ui/fragments/WallpapersFragment;)Ldev/jahir/frames/ui/adapters/WallpapersAdapter;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->getCanShowFavoritesButton()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    instance-of v2, v1, Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    check-cast v1, Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    :goto_0
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {v1}, Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;->canModifyFavorites()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const/4 v1, 0x1

    .line 25
    :goto_1
    new-instance v2, Landroidx/room/a;

    .line 26
    .line 27
    const/16 v3, 0xb

    .line 28
    .line 29
    invoke-direct {v2, v3, p0}, Landroidx/room/a;-><init>(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1, v2}, Ldev/jahir/frames/extensions/frames/WallpapersAdapterDSLKt;->wallpapersAdapter(ZZLd5/l;)Ldev/jahir/frames/ui/adapters/WallpapersAdapter;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
    .line 37
.end method

.method private static final wallsAdapter_delegate$lambda$3$lambda$2(Ldev/jahir/frames/ui/fragments/WallpapersFragment;Ldev/jahir/frames/ui/adapters/WallpapersAdapter;)Lp4/k;
    .locals 2

    .line 1
    const-string v0, "$this$wallpapersAdapter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ldev/jahir/frames/ui/fragments/c;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, v1}, Ldev/jahir/frames/ui/fragments/c;-><init>(Ldev/jahir/frames/ui/fragments/WallpapersFragment;I)V

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v0}, Ldev/jahir/frames/extensions/frames/WallpapersAdapterDSLKt;->onClick(Ldev/jahir/frames/ui/adapters/WallpapersAdapter;Ld5/p;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Ldev/jahir/frames/ui/fragments/c;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-direct {v0, p0, v1}, Ldev/jahir/frames/ui/fragments/c;-><init>(Ldev/jahir/frames/ui/fragments/WallpapersFragment;I)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1, v0}, Ldev/jahir/frames/extensions/frames/WallpapersAdapterDSLKt;->onFavClick(Ldev/jahir/frames/ui/adapters/WallpapersAdapter;Ld5/p;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 25
    .line 26
    return-object p0
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

.method private static final wallsAdapter_delegate$lambda$3$lambda$2$lambda$0(Ldev/jahir/frames/ui/fragments/WallpapersFragment;Ldev/jahir/frames/data/models/Wallpaper;Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;)Lp4/k;
    .locals 1

    .line 1
    const-string v0, "wall"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "holder"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->launchViewer(Ldev/jahir/frames/data/models/Wallpaper;Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 15
    .line 16
    return-object p0
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

.method private static final wallsAdapter_delegate$lambda$3$lambda$2$lambda$1(Ldev/jahir/frames/ui/fragments/WallpapersFragment;ZLdev/jahir/frames/data/models/Wallpaper;)Lp4/k;
    .locals 1

    .line 1
    const-string v0, "wallpaper"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->onFavClick(ZLdev/jahir/frames/data/models/Wallpaper;)V

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
.method public allowCheckingFirstRun()Z
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

.method public canToggleSystemUIVisibility()Z
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

.method public getCanShowFavoritesButton()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->canShowFavoritesButton:Z

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

.method public getEmptyDrawable()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->isForFavs:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget v0, Ldev/jahir/frames/R$drawable;->ic_empty_favorites:I

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    invoke-super {p0}, Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;->getEmptyDrawable()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
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

.method public getEmptyText()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->isForFavs:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget v0, Ldev/jahir/frames/R$string;->no_favorites_found:I

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    sget v0, Ldev/jahir/frames/R$string;->no_wallpapers_found:I

    .line 9
    .line 10
    return v0
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

.method public getFilteredItems(Ljava/util/ArrayList;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "originalItems"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "filter"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    :cond_0
    :goto_0
    if-ge v2, v1, :cond_3

    .line 22
    .line 23
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    move-object v4, v3

    .line 30
    check-cast v4, Ldev/jahir/frames/data/models/Wallpaper;

    .line 31
    .line 32
    invoke-virtual {v4}, Ldev/jahir/frames/data/models/Wallpaper;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v7, 0x1

    .line 38
    invoke-static {v5, v6, v7, v6}, Ldev/jahir/frames/extensions/resources/StringKt;->lower$default(Ljava/lang/String;Ljava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-static {p2, v6, v7, v6}, Ldev/jahir/frames/extensions/resources/StringKt;->lower$default(Ljava/lang/String;Ljava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    invoke-static {v5, v8}, Ll5/e;->l0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-nez v5, :cond_2

    .line 51
    .line 52
    invoke-virtual {v4}, Ldev/jahir/frames/data/models/Wallpaper;->getCollections()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    if-nez v5, :cond_1

    .line 57
    .line 58
    const-string v5, ""

    .line 59
    .line 60
    :cond_1
    invoke-static {v5, v6, v7, v6}, Ldev/jahir/frames/extensions/resources/StringKt;->lower$default(Ljava/lang/String;Ljava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-static {p2, v6, v7, v6}, Ldev/jahir/frames/extensions/resources/StringKt;->lower$default(Ljava/lang/String;Ljava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    invoke-static {v5, v8}, Ll5/e;->l0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-nez v5, :cond_2

    .line 73
    .line 74
    invoke-virtual {v4}, Ldev/jahir/frames/data/models/Wallpaper;->getAuthor()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-static {v4, v6, v7, v6}, Ldev/jahir/frames/extensions/resources/StringKt;->lower$default(Ljava/lang/String;Ljava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-static {p2, v6, v7, v6}, Ldev/jahir/frames/extensions/resources/StringKt;->lower$default(Ljava/lang/String;Ljava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-static {v4, v5}, Ll5/e;->l0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-eqz v4, :cond_0

    .line 91
    .line 92
    :cond_2
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_3
    new-instance p1, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 99
    .line 100
    .line 101
    return-object p1
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
.end method

.method public getTargetActivityIntent()Landroid/content/Intent;
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-class v2, Ldev/jahir/frames/ui/activities/ViewerActivity;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 10
    .line 11
    .line 12
    return-object v0
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

.method public final isForFavs()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->isForFavs:Z

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

.method public loadData()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v2

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v3, 0x2

    .line 18
    const/4 v4, 0x1

    .line 19
    invoke-static {v0, v4, v1, v3, v2}, Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;->loadWallpapersData$library_release$default(Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;ZZILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
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

.method public notifyCanModifyFavorites(Z)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->getWallsAdapter()Ldev/jahir/frames/ui/adapters/WallpapersAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Ldev/jahir/frames/ui/adapters/WallpapersAdapter;->setCanModifyFavorites(Z)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->getWallsAdapter()Ldev/jahir/frames/ui/adapters/WallpapersAdapter;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Landroidx/recyclerview/widget/c1;->notifyDataSetChanged()V

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
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/l0;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroidx/fragment/app/e1;

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    invoke-direct {p1, v0}, Landroidx/fragment/app/e1;-><init>(I)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Ldev/jahir/blueprint/ui/fragments/a;

    .line 11
    .line 12
    const/4 v1, 0x3

    .line 13
    invoke-direct {v0, v1, p0}, Ldev/jahir/blueprint/ui/fragments/a;-><init>(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/l0;->registerForActivityResult(Le/a;Ld/b;)Ld/c;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->openActivityLauncher:Ld/c;

    .line 21
    .line 22
    return-void
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

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 6

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 p2, 0x2

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    sget v0, Ldev/jahir/frames/R$integer;->wallpapers_columns_count:I

    .line 17
    .line 18
    invoke-static {p1, v0, p2}, Ldev/jahir/frames/extensions/context/ContextKt;->integer(Landroid/content/Context;II)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    move v1, p2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v1, 0x2

    .line 25
    :goto_0
    invoke-virtual {p0}, Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;->getRecyclerView()Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const/4 p2, 0x0

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    invoke-direct {v0, v1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(II)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/p1;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-virtual {p0}, Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;->getRecyclerView()Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-eqz p1, :cond_3

    .line 48
    .line 49
    new-instance v0, Ldev/jahir/frames/ui/decorations/GridSpacingItemDecoration;

    .line 50
    .line 51
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getContext()Landroid/content/Context;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    const/16 v3, 0x8

    .line 56
    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    sget v4, Ldev/jahir/frames/R$dimen;->grids_spacing:I

    .line 60
    .line 61
    int-to-float v3, v3

    .line 62
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    .line 71
    .line 72
    mul-float v3, v3, v5

    .line 73
    .line 74
    float-to-int v3, v3

    .line 75
    invoke-static {v2, v4, v3}, Ldev/jahir/frames/extensions/context/ContextKt;->dimenPixelSize(Landroid/content/Context;II)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    goto :goto_1

    .line 80
    :cond_2
    int-to-float v2, v3

    .line 81
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 90
    .line 91
    mul-float v2, v2, v3

    .line 92
    .line 93
    float-to-int v2, v2

    .line 94
    :goto_1
    const/4 v4, 0x4

    .line 95
    const/4 v5, 0x0

    .line 96
    const/4 v3, 0x0

    .line 97
    invoke-direct/range {v0 .. v5}, Ldev/jahir/frames/ui/decorations/GridSpacingItemDecoration;-><init>(IIZILkotlin/jvm/internal/e;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/l1;)V

    .line 101
    .line 102
    .line 103
    :cond_3
    invoke-virtual {p0}, Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;->getRecyclerView()Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-eqz p1, :cond_4

    .line 108
    .line 109
    invoke-direct {p0}, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->getWallsAdapter()Ldev/jahir/frames/ui/adapters/WallpapersAdapter;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {p1, v0}, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;->setAdapter(Landroidx/recyclerview/widget/c1;)V

    .line 114
    .line 115
    .line 116
    :cond_4
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    instance-of v0, p1, Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;

    .line 121
    .line 122
    const/4 v1, 0x0

    .line 123
    if-eqz v0, :cond_5

    .line 124
    .line 125
    check-cast p1, Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_5
    move-object p1, v1

    .line 129
    :goto_2
    if-eqz p1, :cond_6

    .line 130
    .line 131
    iget-boolean v0, p0, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->isForFavs:Z

    .line 132
    .line 133
    const/4 v2, 0x1

    .line 134
    xor-int/2addr v0, v2

    .line 135
    invoke-static {p1, p2, v0, v2, v1}, Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;->loadWallpapersData$library_release$default(Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;ZZILjava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_6
    return-void
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
.end method

.method public final setCollectionName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->collectionName:Ljava/lang/String;

    .line 2
    .line 3
    return-void
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

.method public final setForFavs(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->isForFavs:Z

    .line 2
    .line 3
    return-void
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

.method public updateItemsInAdapter(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "items"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->getWallsAdapter()Ldev/jahir/frames/ui/adapters/WallpapersAdapter;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Ldev/jahir/frames/ui/adapters/WallpapersAdapter;->setWallpapers(Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    return-void
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
