.class public final Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;
.super Ldev/jahir/frames/ui/viewholders/PaletteGeneratorViewHolder;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder$Companion;
    }
.end annotation


# static fields
.field public static final COLORED_TILES_ALPHA:F = 0.9f

.field public static final Companion:Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder$Companion;

.field private static final FAV_DELAY:J = 0x64L

.field private static final GRADIENT_CENTER_ALPHA:F = 0.9f

.field private static final GRADIENT_END_ALPHA:F = 0.9f

.field private static final GRADIENT_START_ALPHA:F = 0.9f

.field private static final OVERLAY_ALPHA:F = 0.15f


# instance fields
.field private final author$delegate:Lp4/c;

.field private final card$delegate:Lp4/c;

.field private final detailsBackground$delegate:Lp4/c;

.field private final favorite$delegate:Lp4/c;

.field private final image$delegate:Lp4/c;

.field private final title$delegate:Lp4/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->Companion:Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder$Companion;

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

.method public constructor <init>(Landroid/view/View;)V
    .locals 3

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Ldev/jahir/frames/ui/viewholders/PaletteGeneratorViewHolder;-><init>(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    sget v0, Ldev/jahir/frames/R$id;->card:I

    .line 10
    .line 11
    new-instance v1, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder$special$$inlined$findView$default$1;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v1, p1, v0, v2}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder$special$$inlined$findView$default$1;-><init>(Landroid/view/View;IZ)V

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->card$delegate:Lp4/c;

    .line 22
    .line 23
    sget v0, Ldev/jahir/frames/R$id;->wallpaper_image:I

    .line 24
    .line 25
    new-instance v1, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder$special$$inlined$findView$default$2;

    .line 26
    .line 27
    invoke-direct {v1, p1, v0, v2}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder$special$$inlined$findView$default$2;-><init>(Landroid/view/View;IZ)V

    .line 28
    .line 29
    .line 30
    invoke-static {v1}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->image$delegate:Lp4/c;

    .line 35
    .line 36
    sget v0, Ldev/jahir/frames/R$id;->wallpaper_name:I

    .line 37
    .line 38
    new-instance v1, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder$special$$inlined$findView$default$3;

    .line 39
    .line 40
    invoke-direct {v1, p1, v0, v2}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder$special$$inlined$findView$default$3;-><init>(Landroid/view/View;IZ)V

    .line 41
    .line 42
    .line 43
    invoke-static {v1}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->title$delegate:Lp4/c;

    .line 48
    .line 49
    sget v0, Ldev/jahir/frames/R$id;->wallpaper_author:I

    .line 50
    .line 51
    new-instance v1, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder$special$$inlined$findView$default$4;

    .line 52
    .line 53
    invoke-direct {v1, p1, v0, v2}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder$special$$inlined$findView$default$4;-><init>(Landroid/view/View;IZ)V

    .line 54
    .line 55
    .line 56
    invoke-static {v1}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iput-object v0, p0, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->author$delegate:Lp4/c;

    .line 61
    .line 62
    sget v0, Ldev/jahir/frames/R$id;->fav_button:I

    .line 63
    .line 64
    new-instance v1, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder$special$$inlined$findView$default$5;

    .line 65
    .line 66
    invoke-direct {v1, p1, v0, v2}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder$special$$inlined$findView$default$5;-><init>(Landroid/view/View;IZ)V

    .line 67
    .line 68
    .line 69
    invoke-static {v1}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->favorite$delegate:Lp4/c;

    .line 74
    .line 75
    sget v0, Ldev/jahir/frames/R$id;->wallpaper_details_background:I

    .line 76
    .line 77
    new-instance v1, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder$special$$inlined$findView$default$6;

    .line 78
    .line 79
    invoke-direct {v1, p1, v0, v2}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder$special$$inlined$findView$default$6;-><init>(Landroid/view/View;IZ)V

    .line 80
    .line 81
    .line 82
    invoke-static {v1}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iput-object p1, p0, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->detailsBackground$delegate:Lp4/c;

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
.end method

.method public static final synthetic access$updateImageColors(Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->updateImageColors(I)V

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

.method private static final bind$lambda$1(Ld5/p;Ldev/jahir/frames/data/models/Wallpaper;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-static {p2}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder$bind$lambda$1$$inlined$postDelayed$1;

    .line 5
    .line 6
    invoke-direct {v0, p0, p2, p1}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder$bind$lambda$1$$inlined$postDelayed$1;-><init>(Ld5/p;Landroid/view/View;Ldev/jahir/frames/data/models/Wallpaper;)V

    .line 7
    .line 8
    .line 9
    const-wide/16 p0, 0x64

    .line 10
    .line 11
    invoke-virtual {p2, v0, p0, p1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 12
    .line 13
    .line 14
    return-void
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

.method private static final bind$lambda$2(Ld5/p;Ldev/jahir/frames/data/models/Wallpaper;)Lp4/k;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ldev/jahir/frames/data/models/Wallpaper;->isInFavorites()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {p0, v0, p1}, Ld5/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 13
    .line 14
    return-object p0
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

.method private static final bind$lambda$3(Ld5/p;Ldev/jahir/frames/data/models/Wallpaper;Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1, p2}, Ld5/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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

.method public static synthetic d(Ld5/p;Ldev/jahir/frames/data/models/Wallpaper;Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->bind$lambda$3(Ld5/p;Ldev/jahir/frames/data/models/Wallpaper;Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;Landroid/view/View;)V

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

.method private static final doWithColors$lambda$5(Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->getDetailsBackground()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/16 v1, 0x60

    .line 8
    .line 9
    int-to-float v1, v1

    .line 10
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 19
    .line 20
    mul-float v1, v1, v2

    .line 21
    .line 22
    float-to-int v1, v1

    .line 23
    invoke-static {v0, v1}, Ldev/jahir/frames/extensions/views/ViewKt;->setPaddingTop(Landroid/view/View;I)V

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p0}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->getImage$library_release()Ldev/jahir/frames/ui/widgets/PortraitImageView;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    new-instance v1, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder$doWithColors$lambda$5$$inlined$postDelayed$1;

    .line 33
    .line 34
    invoke-direct {v1, p0, p1}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder$doWithColors$lambda$5$$inlined$postDelayed$1;-><init>(Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;I)V

    .line 35
    .line 36
    .line 37
    const-wide/16 p0, 0x2

    .line 38
    .line 39
    invoke-virtual {v0, v1, p0, p1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
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

.method public static synthetic e(Ld5/p;Ldev/jahir/frames/data/models/Wallpaper;)Lp4/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->bind$lambda$2(Ld5/p;Ldev/jahir/frames/data/models/Wallpaper;)Lp4/k;

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

.method public static synthetic f(Ld5/p;Ldev/jahir/frames/data/models/Wallpaper;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->bind$lambda$1(Ld5/p;Ldev/jahir/frames/data/models/Wallpaper;Landroid/view/View;)V

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

.method private final getDetailsBackground()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->detailsBackground$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/view/View;

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

.method private final updateImageColors(I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->getImage$library_release()Ldev/jahir/frames/ui/widgets/PortraitImageView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const v1, 0x3e19999a    # 0.15f

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v1}, Ldev/jahir/frames/extensions/resources/ColorKt;->withAlpha(IF)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {v0, v1}, Ldev/jahir/frames/ui/widgets/PortraitImageView;->setOverlayColor(I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->getImage$library_release()Ldev/jahir/frames/ui/widgets/PortraitImageView;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    const v1, 0x3f666666    # 0.9f

    .line 24
    .line 25
    .line 26
    invoke-static {p1, v1}, Ldev/jahir/frames/extensions/resources/ColorKt;->withAlpha(IF)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-static {p1, v1}, Ldev/jahir/frames/extensions/resources/ColorKt;->withAlpha(IF)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-static {p1, v1}, Ldev/jahir/frames/extensions/resources/ColorKt;->withAlpha(IF)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    filled-new-array {v2, v3, p1}, [I

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {v0, p1}, Ldev/jahir/frames/ui/widgets/PortraitImageView;->setGradientColors([I)V

    .line 43
    .line 44
    .line 45
    :cond_1
    return-void
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


# virtual methods
.method public final bind(Ldev/jahir/frames/data/models/Wallpaper;ZZLd5/p;Ld5/p;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            "ZZ",
            "Ld5/p;",
            "Ld5/p;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    move-object/from16 v3, p5

    .line 8
    .line 9
    const-string v4, "wallpaper"

    .line 10
    .line 11
    invoke-static {v1, v4}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v4, "onClick"

    .line 15
    .line 16
    invoke-static {v2, v4}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v4, "onFavClick"

    .line 20
    .line 21
    invoke-static {v3, v4}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    if-eqz p2, :cond_6

    .line 26
    .line 27
    invoke-virtual {v0}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->getFavorite$library_release()Ldev/jahir/frames/ui/widgets/FavoriteCheckbox;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    if-eqz v5, :cond_0

    .line 32
    .line 33
    invoke-virtual {v5, v4}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-virtual {v0}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->getFavorite$library_release()Ldev/jahir/frames/ui/widgets/FavoriteCheckbox;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    if-eqz v5, :cond_1

    .line 41
    .line 42
    invoke-virtual {v1}, Ldev/jahir/frames/data/models/Wallpaper;->isInFavorites()Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    invoke-virtual {v5, v6}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-virtual {v0}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->getFavorite$library_release()Ldev/jahir/frames/ui/widgets/FavoriteCheckbox;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    if-eqz v5, :cond_2

    .line 54
    .line 55
    invoke-virtual {v5}, Landroid/view/View;->invalidate()V

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-virtual {v0}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->getFavorite$library_release()Ldev/jahir/frames/ui/widgets/FavoriteCheckbox;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    if-eqz v5, :cond_3

    .line 63
    .line 64
    move/from16 v6, p3

    .line 65
    .line 66
    invoke-virtual {v5, v6}, Ldev/jahir/frames/ui/widgets/FavoriteCheckbox;->setCanCheck$library_release(Z)V

    .line 67
    .line 68
    .line 69
    :cond_3
    invoke-virtual {v0}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->getFavorite$library_release()Ldev/jahir/frames/ui/widgets/FavoriteCheckbox;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    if-eqz v5, :cond_4

    .line 74
    .line 75
    new-instance v6, Lcom/google/android/material/snackbar/a;

    .line 76
    .line 77
    const/16 v7, 0x8

    .line 78
    .line 79
    invoke-direct {v6, v7, v3, v1}, Lcom/google/android/material/snackbar/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 83
    .line 84
    .line 85
    :cond_4
    invoke-virtual {v0}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->getFavorite$library_release()Ldev/jahir/frames/ui/widgets/FavoriteCheckbox;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    if-eqz v5, :cond_5

    .line 90
    .line 91
    new-instance v6, Ldev/jahir/blueprint/extensions/b;

    .line 92
    .line 93
    const/4 v7, 0x6

    .line 94
    invoke-direct {v6, v7, v3, v1}, Ldev/jahir/blueprint/extensions/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v5, v6}, Ldev/jahir/frames/ui/widgets/FavoriteCheckbox;->setOnDisabledClickListener$library_release(Ld5/a;)V

    .line 98
    .line 99
    .line 100
    :cond_5
    invoke-virtual {v0}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->getFavorite$library_release()Ldev/jahir/frames/ui/widgets/FavoriteCheckbox;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    if-eqz v3, :cond_7

    .line 105
    .line 106
    const/4 v5, 0x0

    .line 107
    const/4 v6, 0x1

    .line 108
    invoke-static {v3, v5, v6, v4}, Ldev/jahir/frames/extensions/views/ViewKt;->visible$default(Landroid/view/View;ZILjava/lang/Object;)Landroid/view/View;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    check-cast v3, Ldev/jahir/frames/ui/widgets/FavoriteCheckbox;

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_6
    invoke-virtual {v0}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->getFavorite$library_release()Ldev/jahir/frames/ui/widgets/FavoriteCheckbox;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    if-eqz v3, :cond_7

    .line 120
    .line 121
    invoke-static {v3}, Ldev/jahir/frames/extensions/views/ViewKt;->gone(Landroid/view/View;)Landroid/view/View;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    check-cast v3, Ldev/jahir/frames/ui/widgets/FavoriteCheckbox;

    .line 126
    .line 127
    :cond_7
    :goto_0
    invoke-virtual {v0}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->getCard$library_release()Lcom/google/android/material/card/MaterialCardView;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    if-eqz v3, :cond_8

    .line 132
    .line 133
    const-string v5, "wallpaper_transition_container"

    .line 134
    .line 135
    invoke-virtual {v3, v5}, Landroid/view/View;->setTransitionName(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    :cond_8
    invoke-virtual {v0}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->getTitle$library_release()Landroid/widget/TextView;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    if-eqz v3, :cond_9

    .line 143
    .line 144
    invoke-virtual {v1}, Ldev/jahir/frames/data/models/Wallpaper;->getName()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 149
    .line 150
    .line 151
    :cond_9
    invoke-virtual {v0}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->getAuthor$library_release()Landroid/widget/TextView;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    if-eqz v3, :cond_a

    .line 156
    .line 157
    invoke-virtual {v1}, Ldev/jahir/frames/data/models/Wallpaper;->getAuthor()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 162
    .line 163
    .line 164
    :cond_a
    invoke-virtual {v0}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->getAuthor$library_release()Landroid/widget/TextView;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    if-eqz v3, :cond_b

    .line 169
    .line 170
    invoke-virtual {v1}, Ldev/jahir/frames/data/models/Wallpaper;->getAuthor()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    invoke-static {v5}, Ldev/jahir/frames/extensions/resources/StringKt;->hasContent(Ljava/lang/String;)Z

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    invoke-static {v3, v5}, Ldev/jahir/frames/extensions/views/ViewKt;->visibleIf(Landroid/view/View;Z)Landroid/view/View;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    check-cast v3, Landroid/widget/TextView;

    .line 183
    .line 184
    :cond_b
    iget-object v3, v0, Landroidx/recyclerview/widget/i2;->itemView:Landroid/view/View;

    .line 185
    .line 186
    new-instance v5, Ldev/jahir/blueprint/ui/viewholders/b;

    .line 187
    .line 188
    const/4 v6, 0x3

    .line 189
    invoke-direct {v5, v2, v1, v0, v6}, Ldev/jahir/blueprint/ui/viewholders/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v3, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->getImage$library_release()Ldev/jahir/frames/ui/widgets/PortraitImageView;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    if-eqz v7, :cond_c

    .line 200
    .line 201
    invoke-virtual {v1}, Ldev/jahir/frames/data/models/Wallpaper;->getUrl()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v8

    .line 205
    invoke-virtual {v1}, Ldev/jahir/frames/data/models/Wallpaper;->getThumbnail()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v9

    .line 209
    invoke-static {v0}, Ldev/jahir/frames/extensions/views/ViewHolderKt;->getContext(Landroidx/recyclerview/widget/i2;)Landroid/content/Context;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    sget v2, Ldev/jahir/frames/R$string;->wallpapers_placeholder:I

    .line 214
    .line 215
    const/4 v3, 0x2

    .line 216
    invoke-static {v1, v2, v4, v3, v4}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v10

    .line 220
    invoke-virtual {v0}, Ldev/jahir/frames/ui/viewholders/PaletteGeneratorViewHolder;->getGeneratePalette$library_release()Ld5/l;

    .line 221
    .line 222
    .line 223
    move-result-object v14

    .line 224
    const/16 v15, 0x38

    .line 225
    .line 226
    const/16 v16, 0x0

    .line 227
    .line 228
    const/4 v11, 0x0

    .line 229
    const/4 v12, 0x0

    .line 230
    const/4 v13, 0x0

    .line 231
    invoke-static/range {v7 .. v16}, Ldev/jahir/frames/extensions/views/ImageViewKt;->loadFramesPicResPlaceholder$default(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLd5/l;ILjava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    :cond_c
    return-void
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
.end method

.method public doWithColors(II)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->updateImageColors(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->getTitle$library_release()Landroid/widget/TextView;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->getAuthor$library_release()Landroid/widget/TextView;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-virtual {p0}, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->getFavorite$library_release()Ldev/jahir/frames/ui/widgets/FavoriteCheckbox;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_3

    .line 27
    .line 28
    invoke-static {p1}, Le6/d;->m(Landroid/widget/CompoundButton;)Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-static {v0, p2}, Ldev/jahir/frames/extensions/resources/DrawableKt;->tint(Landroid/graphics/drawable/Drawable;I)Landroid/graphics/drawable/Drawable;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    goto :goto_0

    .line 39
    :cond_2
    const/4 p2, 0x0

    .line 40
    :goto_0
    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/w;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 41
    .line 42
    .line 43
    :cond_3
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
.end method

.method public final getAuthor$library_release()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->author$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/widget/TextView;

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

.method public final getCard$library_release()Lcom/google/android/material/card/MaterialCardView;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->card$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/material/card/MaterialCardView;

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

.method public final getFavorite$library_release()Ldev/jahir/frames/ui/widgets/FavoriteCheckbox;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->favorite$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/frames/ui/widgets/FavoriteCheckbox;

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

.method public final getImage$library_release()Ldev/jahir/frames/ui/widgets/PortraitImageView;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->image$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/frames/ui/widgets/PortraitImageView;

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

.method public final getTitle$library_release()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;->title$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/widget/TextView;

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
