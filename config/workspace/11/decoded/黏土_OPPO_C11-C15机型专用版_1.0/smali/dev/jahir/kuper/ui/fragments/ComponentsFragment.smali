.class public final Ldev/jahir/kuper/ui/fragments/ComponentsFragment;
.super Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "MissingPermission"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldev/jahir/kuper/ui/fragments/ComponentsFragment$Companion;,
        Ldev/jahir/kuper/ui/fragments/ComponentsFragment$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment<",
        "Ldev/jahir/kuper/data/models/Component;",
        ">;"
    }
.end annotation


# static fields
.field public static final Companion:Ldev/jahir/kuper/ui/fragments/ComponentsFragment$Companion;

.field public static final TAG:Ljava/lang/String; = "components_fragment"


# instance fields
.field private final componentsAdapter$delegate:Lp4/c;

.field private final componentsViewModel$delegate:Lp4/c;

.field private final wallpaper$delegate:Lp4/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldev/jahir/kuper/ui/fragments/ComponentsFragment$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->Companion:Ldev/jahir/kuper/ui/fragments/ComponentsFragment$Companion;

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
    .locals 5

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldev/jahir/kuper/ui/fragments/ComponentsFragment$special$$inlined$lazyViewModel$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment$special$$inlined$lazyViewModel$default$1;-><init>(Landroidx/fragment/app/l0;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lp4/d;->h:[Lp4/d;

    .line 10
    .line 11
    new-instance v1, Ldev/jahir/kuper/ui/fragments/ComponentsFragment$special$$inlined$lazyViewModel$default$2;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment$special$$inlined$lazyViewModel$default$2;-><init>(Ld5/a;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Le6/d;->z(Ld5/a;)Lp4/c;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-class v1, Ldev/jahir/kuper/data/viewmodels/ComponentsViewModel;

    .line 21
    .line 22
    invoke-static {v1}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Ldev/jahir/kuper/ui/fragments/ComponentsFragment$special$$inlined$lazyViewModel$default$3;

    .line 27
    .line 28
    invoke-direct {v2, v0}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment$special$$inlined$lazyViewModel$default$3;-><init>(Lp4/c;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Ldev/jahir/kuper/ui/fragments/ComponentsFragment$special$$inlined$lazyViewModel$default$4;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-direct {v3, v4, v0}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment$special$$inlined$lazyViewModel$default$4;-><init>(Ld5/a;Lp4/c;)V

    .line 35
    .line 36
    .line 37
    new-instance v4, Ldev/jahir/kuper/ui/fragments/ComponentsFragment$special$$inlined$lazyViewModel$default$5;

    .line 38
    .line 39
    invoke-direct {v4, p0, v0}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment$special$$inlined$lazyViewModel$default$5;-><init>(Landroidx/fragment/app/l0;Lp4/c;)V

    .line 40
    .line 41
    .line 42
    new-instance v0, Landroidx/lifecycle/a1;

    .line 43
    .line 44
    invoke-direct {v0, v1, v2, v4, v3}, Landroidx/lifecycle/a1;-><init>(Lkotlin/jvm/internal/d;Ld5/a;Ld5/a;Ld5/a;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->componentsViewModel$delegate:Lp4/c;

    .line 48
    .line 49
    new-instance v0, Ldev/jahir/kuper/ui/fragments/d;

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    invoke-direct {v0, p0, v1}, Ldev/jahir/kuper/ui/fragments/d;-><init>(Ldev/jahir/kuper/ui/fragments/ComponentsFragment;I)V

    .line 53
    .line 54
    .line 55
    invoke-static {v0}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->componentsAdapter$delegate:Lp4/c;

    .line 60
    .line 61
    new-instance v0, Ldev/jahir/kuper/ui/fragments/d;

    .line 62
    .line 63
    const/4 v1, 0x1

    .line 64
    invoke-direct {v0, p0, v1}, Ldev/jahir/kuper/ui/fragments/d;-><init>(Ldev/jahir/kuper/ui/fragments/ComponentsFragment;I)V

    .line 65
    .line 66
    .line 67
    invoke-static {v0}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, p0, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->wallpaper$delegate:Lp4/c;

    .line 72
    .line 73
    return-void
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

.method public static final synthetic access$getComponentsAdapter(Ldev/jahir/kuper/ui/fragments/ComponentsFragment;)Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;
    .locals 0

    .line 1
    invoke-direct {p0}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->getComponentsAdapter()Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;

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

.method public static final synthetic access$getWallpaper(Ldev/jahir/kuper/ui/fragments/ComponentsFragment;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    invoke-direct {p0}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->getWallpaper()Landroid/graphics/drawable/Drawable;

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

.method public static final synthetic access$onClick(Ldev/jahir/kuper/ui/fragments/ComponentsFragment;Ldev/jahir/kuper/data/models/Component;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->onClick(Ldev/jahir/kuper/data/models/Component;)V

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

.method public static final synthetic access$showPermissionRationale(Ldev/jahir/kuper/ui/fragments/ComponentsFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->showPermissionRationale()V

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
.end method

.method private static final componentsAdapter_delegate$lambda$0(Ldev/jahir/kuper/ui/fragments/ComponentsFragment;)Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;
    .locals 2

    .line 1
    new-instance v0, Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;

    .line 2
    .line 3
    new-instance v1, Ldev/jahir/kuper/ui/fragments/ComponentsFragment$componentsAdapter$2$1;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment$componentsAdapter$2$1;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;-><init>(Ld5/l;)V

    .line 9
    .line 10
    .line 11
    return-object v0
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

.method private final getComponentsAdapter()Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->componentsAdapter$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;

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

.method private final getComponentsViewModel()Ldev/jahir/kuper/data/viewmodels/ComponentsViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->componentsViewModel$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/kuper/data/viewmodels/ComponentsViewModel;

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

.method private final getWallpaper()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->wallpaper$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/graphics/drawable/Drawable;

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

.method public static synthetic m(Ldev/jahir/kuper/ui/fragments/ComponentsFragment;Ldev/jahir/kuper/data/models/Component;Landroid/content/Context;Ljava/lang/String;Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->onClick$lambda$13$lambda$9$lambda$8(Ldev/jahir/kuper/ui/fragments/ComponentsFragment;Ldev/jahir/kuper/data/models/Component;Landroid/content/Context;Ljava/lang/String;Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

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

.method public static synthetic n(Ldev/jahir/kuper/ui/fragments/ComponentsFragment;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->wallpaper_delegate$lambda$1(Ldev/jahir/kuper/ui/fragments/ComponentsFragment;)Landroid/graphics/drawable/Drawable;

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

.method public static synthetic o(Landroid/content/Context;Ljava/lang/String;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->onClick$lambda$13$lambda$9$lambda$8$lambda$6(Landroid/content/Context;Ljava/lang/String;Landroid/content/DialogInterface;I)V

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

.method private final onClick(Ldev/jahir/kuper/data/models/Component;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Ldev/jahir/kuper/data/models/Component;->getIntent(Landroid/content/Context;)Landroid/content/Intent;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p0, v1}, Landroidx/fragment/app/l0;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    goto :goto_1

    .line 17
    :catch_0
    invoke-virtual {p1}, Ldev/jahir/kuper/data/models/Component;->getType()Ldev/jahir/kuper/data/models/Component$Type;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sget-object v2, Ldev/jahir/kuper/data/models/Component$Type;->UNKNOWN:Ldev/jahir/kuper/data/models/Component$Type;

    .line 22
    .line 23
    if-eq v1, v2, :cond_4

    .line 24
    .line 25
    invoke-virtual {p1}, Ldev/jahir/kuper/data/models/Component;->getType()Ldev/jahir/kuper/data/models/Component$Type;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    sget-object v2, Ldev/jahir/kuper/ui/fragments/ComponentsFragment$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    aget v1, v2, v1

    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    if-eq v1, v2, :cond_2

    .line 39
    .line 40
    const/4 v2, 0x2

    .line 41
    if-eq v1, v2, :cond_1

    .line 42
    .line 43
    const/4 v2, 0x3

    .line 44
    if-eq v1, v2, :cond_0

    .line 45
    .line 46
    const-string v1, ""

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const-string v1, "org.kustom.lockscreen"

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const-string v1, "org.kustom.widget"

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    const-string v1, "org.kustom.wallpaper"

    .line 56
    .line 57
    :goto_0
    invoke-static {v1}, Ldev/jahir/frames/extensions/resources/StringKt;->hasContent(Ljava/lang/String;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_4

    .line 62
    .line 63
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    if-eqz v2, :cond_4

    .line 68
    .line 69
    new-instance v3, Ldev/jahir/kuper/ui/fragments/e;

    .line 70
    .line 71
    invoke-direct {v3, p0, p1, v0, v1}, Ldev/jahir/kuper/ui/fragments/e;-><init>(Ldev/jahir/kuper/ui/fragments/ComponentsFragment;Ldev/jahir/kuper/data/models/Component;Landroid/content/Context;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v2, v3}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->mdDialog(Landroid/content/Context;Ld5/l;)Landroidx/appcompat/app/r;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    if-eqz p1, :cond_4

    .line 79
    .line 80
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    invoke-virtual {p1}, Ldev/jahir/kuper/data/models/Component;->getType()Ldev/jahir/kuper/data/models/Component$Type;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    sget-object v0, Ldev/jahir/kuper/data/models/Component$Type;->KOMPONENT:Ldev/jahir/kuper/data/models/Component$Type;

    .line 89
    .line 90
    if-ne p1, v0, :cond_4

    .line 91
    .line 92
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    if-eqz p1, :cond_4

    .line 97
    .line 98
    new-instance v0, Ldev/jahir/frames/ui/activities/c;

    .line 99
    .line 100
    const/16 v1, 0x9

    .line 101
    .line 102
    invoke-direct {v0, v1}, Ldev/jahir/frames/ui/activities/c;-><init>(I)V

    .line 103
    .line 104
    .line 105
    invoke-static {p1, v0}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->mdDialog(Landroid/content/Context;Ld5/l;)Landroidx/appcompat/app/r;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    if-eqz p1, :cond_4

    .line 110
    .line 111
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 112
    .line 113
    .line 114
    :cond_4
    :goto_1
    return-void
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

.method private static final onClick$lambda$13$lambda$12$lambda$11(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 4

    .line 1
    const-string v0, "$this$mdDialog"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Ldev/jahir/kuper/R$string;->komponents:I

    .line 7
    .line 8
    iget-object v1, p0, Lp3/z;->i:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Landroidx/appcompat/app/n;

    .line 11
    .line 12
    iget-object v2, v1, Landroidx/appcompat/app/n;->a:Landroid/view/ContextThemeWrapper;

    .line 13
    .line 14
    invoke-virtual {v2, v0}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, v1, Landroidx/appcompat/app/n;->d:Ljava/lang/CharSequence;

    .line 19
    .line 20
    sget v0, Ldev/jahir/kuper/R$string;->open_komponents:I

    .line 21
    .line 22
    iget-object v2, v1, Landroidx/appcompat/app/n;->a:Landroid/view/ContextThemeWrapper;

    .line 23
    .line 24
    invoke-virtual {v2, v0}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, v1, Landroidx/appcompat/app/n;->f:Ljava/lang/CharSequence;

    .line 29
    .line 30
    new-instance v0, Ldev/jahir/kuper/ui/fragments/b;

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    invoke-direct {v0, v2}, Ldev/jahir/kuper/ui/fragments/b;-><init>(I)V

    .line 34
    .line 35
    .line 36
    iget-object v2, v1, Landroidx/appcompat/app/n;->a:Landroid/view/ContextThemeWrapper;

    .line 37
    .line 38
    const v3, 0x104000a

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v3}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    iput-object v2, v1, Landroidx/appcompat/app/n;->g:Ljava/lang/CharSequence;

    .line 46
    .line 47
    iput-object v0, v1, Landroidx/appcompat/app/n;->h:Landroid/content/DialogInterface$OnClickListener;

    .line 48
    .line 49
    return-object p0
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

.method private static final onClick$lambda$13$lambda$12$lambda$11$lambda$10(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    return-void
    .line 2
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

.method private static final onClick$lambda$13$lambda$9$lambda$8(Ldev/jahir/kuper/ui/fragments/ComponentsFragment;Ldev/jahir/kuper/data/models/Component;Landroid/content/Context;Ljava/lang/String;Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 4

    .line 1
    const-string v0, "$this$mdDialog"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Ldev/jahir/kuper/R$string;->required_apps:I

    .line 7
    .line 8
    iget-object v1, p4, Lp3/z;->i:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Landroidx/appcompat/app/n;

    .line 11
    .line 12
    iget-object v2, v1, Landroidx/appcompat/app/n;->a:Landroid/view/ContextThemeWrapper;

    .line 13
    .line 14
    invoke-virtual {v2, v0}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, v1, Landroidx/appcompat/app/n;->d:Ljava/lang/CharSequence;

    .line 19
    .line 20
    sget v0, Ldev/jahir/kuper/R$string;->x_app_required:I

    .line 21
    .line 22
    invoke-virtual {p1}, Ldev/jahir/kuper/data/models/Component;->getType()Ldev/jahir/kuper/data/models/Component$Type;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    sget-object v2, Ldev/jahir/kuper/ui/fragments/ComponentsFragment$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    aget p1, v2, p1

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    if-eq p1, v2, :cond_2

    .line 36
    .line 37
    const/4 v3, 0x2

    .line 38
    if-eq p1, v3, :cond_1

    .line 39
    .line 40
    const/4 v3, 0x3

    .line 41
    if-eq p1, v3, :cond_0

    .line 42
    .line 43
    const-string p1, ""

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const-string p1, "KLCK"

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    const-string p1, "KWGT"

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    const-string p1, "KLWP"

    .line 53
    .line 54
    :goto_0
    new-array v2, v2, [Ljava/lang/Object;

    .line 55
    .line 56
    const/4 v3, 0x0

    .line 57
    aput-object p1, v2, v3

    .line 58
    .line 59
    invoke-static {p0, v0, v2}, Ldev/jahir/frames/extensions/fragments/FragmentKt;->string(Landroidx/fragment/app/l0;I[Ljava/lang/Object;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    iput-object p0, v1, Landroidx/appcompat/app/n;->f:Ljava/lang/CharSequence;

    .line 64
    .line 65
    sget p0, Ldev/jahir/kuper/R$string;->install:I

    .line 66
    .line 67
    new-instance p1, Ldev/jahir/kuper/ui/fragments/a;

    .line 68
    .line 69
    invoke-direct {p1, p2, p3}, Ldev/jahir/kuper/ui/fragments/a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iget-object p2, v1, Landroidx/appcompat/app/n;->a:Landroid/view/ContextThemeWrapper;

    .line 73
    .line 74
    invoke-virtual {p2, p0}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    iput-object p0, v1, Landroidx/appcompat/app/n;->g:Ljava/lang/CharSequence;

    .line 79
    .line 80
    iput-object p1, v1, Landroidx/appcompat/app/n;->h:Landroid/content/DialogInterface$OnClickListener;

    .line 81
    .line 82
    new-instance p0, Ldev/jahir/kuper/ui/fragments/b;

    .line 83
    .line 84
    invoke-direct {p0, v3}, Ldev/jahir/kuper/ui/fragments/b;-><init>(I)V

    .line 85
    .line 86
    .line 87
    iget-object p1, v1, Landroidx/appcompat/app/n;->a:Landroid/view/ContextThemeWrapper;

    .line 88
    .line 89
    const/high16 p2, 0x1040000

    .line 90
    .line 91
    invoke-virtual {p1, p2}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    iput-object p1, v1, Landroidx/appcompat/app/n;->i:Ljava/lang/CharSequence;

    .line 96
    .line 97
    iput-object p0, v1, Landroidx/appcompat/app/n;->j:Landroid/content/DialogInterface$OnClickListener;

    .line 98
    .line 99
    return-object p4
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

.method private static final onClick$lambda$13$lambda$9$lambda$8$lambda$6(Landroid/content/Context;Ljava/lang/String;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string p3, "https://play.google.com/store/apps/details?id="

    .line 4
    .line 5
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p0, p1}, Ldev/jahir/frames/extensions/context/ContextKt;->openLink(Landroid/content/Context;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
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

.method private static final onClick$lambda$13$lambda$9$lambda$8$lambda$7(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    return-void
    .line 2
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

.method private static final onCreate$lambda$5(Ldev/jahir/kuper/ui/fragments/ComponentsFragment;Ljava/util/ArrayList;)Lp4/k;
    .locals 3

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-static {p0, p1, v2, v0, v1}, Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;->updateItems$default(Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;Ljava/util/List;ZILjava/lang/Object;)V

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

.method public static synthetic p(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->onClick$lambda$13$lambda$12$lambda$11(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

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

.method public static synthetic q(Ldev/jahir/kuper/ui/fragments/ComponentsFragment;Lcom/google/android/material/snackbar/Snackbar;)Lp4/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->showPermissionRationale$lambda$4(Ldev/jahir/kuper/ui/fragments/ComponentsFragment;Lcom/google/android/material/snackbar/Snackbar;)Lp4/k;

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

.method public static synthetic r(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->onClick$lambda$13$lambda$9$lambda$8$lambda$7(Landroid/content/DialogInterface;I)V

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

.method private final requestStoragePermission()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/String;

    .line 3
    .line 4
    invoke-static {p0, v0}, Lu2/f;->A(Landroidx/fragment/app/l0;[Ljava/lang/String;)La1/w;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, La1/w;->p()Lw3/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Ldev/jahir/kuper/ui/fragments/ComponentsFragment$requestStoragePermission$1$1;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment$requestStoragePermission$1$1;-><init>(Ldev/jahir/kuper/ui/fragments/ComponentsFragment;)V

    .line 15
    .line 16
    .line 17
    iget-object v2, v0, Lw3/a;->a:Ljava/util/LinkedHashSet;

    .line 18
    .line 19
    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Lw3/c;->a()V

    .line 23
    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public static synthetic s(Ldev/jahir/kuper/ui/fragments/ComponentsFragment;Lcom/google/android/material/snackbar/Snackbar;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->showPermissionRationale$lambda$4$lambda$3(Ldev/jahir/kuper/ui/fragments/ComponentsFragment;Lcom/google/android/material/snackbar/Snackbar;Landroid/view/View;)V

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

.method private final showPermissionRationale()V
    .locals 5

    .line 1
    sget v0, Ldev/jahir/frames/R$string;->permission_request:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-static {v1}, Ldev/jahir/frames/extensions/context/ContextKt;->getAppName(Landroid/content/Context;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v1, v2

    .line 16
    :goto_0
    const/4 v3, 0x1

    .line 17
    new-array v3, v3, [Ljava/lang/Object;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    aput-object v1, v3, v4

    .line 21
    .line 22
    invoke-static {p0, v0, v3}, Ldev/jahir/frames/extensions/fragments/FragmentKt;->string(Landroidx/fragment/app/l0;I[Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    instance-of v3, v1, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;

    .line 31
    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    move-object v2, v1

    .line 35
    check-cast v2, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;

    .line 36
    .line 37
    :cond_1
    if-eqz v2, :cond_2

    .line 38
    .line 39
    invoke-virtual {v2}, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;->getSnackbarAnchorId()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    const/4 v1, 0x0

    .line 45
    :goto_1
    new-instance v2, Ldev/jahir/kuper/ui/fragments/c;

    .line 46
    .line 47
    invoke-direct {v2, p0, v4}, Ldev/jahir/kuper/ui/fragments/c;-><init>(Ldev/jahir/kuper/ui/fragments/ComponentsFragment;I)V

    .line 48
    .line 49
    .line 50
    const/4 v3, -0x2

    .line 51
    invoke-static {p0, v0, v3, v1, v2}, Ldev/jahir/frames/extensions/views/SnackbarKt;->snackbar(Landroidx/fragment/app/l0;Ljava/lang/CharSequence;IILd5/l;)Lcom/google/android/material/snackbar/Snackbar;

    .line 52
    .line 53
    .line 54
    return-void
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
.end method

.method private static final showPermissionRationale$lambda$4(Ldev/jahir/kuper/ui/fragments/ComponentsFragment;Lcom/google/android/material/snackbar/Snackbar;)Lp4/k;
    .locals 2

    .line 1
    const-string v0, "$this$snackbar"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/google/android/material/snackbar/a;

    .line 7
    .line 8
    const/16 v1, 0xa

    .line 9
    .line 10
    invoke-direct {v0, p0, p1, v1}, Lcom/google/android/material/snackbar/a;-><init>(Landroidx/fragment/app/l0;Lcom/google/android/material/snackbar/Snackbar;I)V

    .line 11
    .line 12
    .line 13
    const p0, 0x104000a

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p0, v0}, Lcom/google/android/material/snackbar/Snackbar;->j(ILandroid/view/View$OnClickListener;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 20
    .line 21
    return-object p0
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

.method private static final showPermissionRationale$lambda$4$lambda$3(Ldev/jahir/kuper/ui/fragments/ComponentsFragment;Lcom/google/android/material/snackbar/Snackbar;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->requestStoragePermission()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x3

    .line 5
    invoke-virtual {p1, p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->b(I)V

    .line 6
    .line 7
    .line 8
    return-void
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

.method public static synthetic t(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->onClick$lambda$13$lambda$12$lambda$11$lambda$10(Landroid/content/DialogInterface;I)V

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

.method public static synthetic u(Ldev/jahir/kuper/ui/fragments/ComponentsFragment;Ljava/util/ArrayList;)Lp4/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->onCreate$lambda$5(Ldev/jahir/kuper/ui/fragments/ComponentsFragment;Ljava/util/ArrayList;)Lp4/k;

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

.method public static synthetic v(Ldev/jahir/kuper/ui/fragments/ComponentsFragment;)Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->componentsAdapter_delegate$lambda$0(Ldev/jahir/kuper/ui/fragments/ComponentsFragment;)Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;

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

.method private static final wallpaper_delegate$lambda$1(Ldev/jahir/kuper/ui/fragments/ComponentsFragment;)Landroid/graphics/drawable/Drawable;
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget v3, Ldev/jahir/kuper/R$color;->kuper_preview_background:I

    .line 10
    .line 11
    const/4 v4, 0x2

    .line 12
    invoke-static {v0, v3, v2, v4, v1}, Ldev/jahir/frames/extensions/context/ContextKt;->color$default(Landroid/content/Context;IIILjava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    :cond_0
    if-eqz v2, :cond_1

    .line 17
    .line 18
    new-instance p0, Landroid/graphics/drawable/ColorDrawable;

    .line 19
    .line 20
    invoke-direct {p0, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 21
    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getActivity()Landroidx/fragment/app/q0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    if-eqz p0, :cond_2

    .line 29
    .line 30
    invoke-static {p0}, Ldev/jahir/kuper/extensions/ContextKt;->getUserWallpaper(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_2
    return-object v1
    .line 36
    .line 37
.end method


# virtual methods
.method public getFilteredItems(Ljava/util/ArrayList;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ldev/jahir/kuper/data/models/Component;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Ldev/jahir/kuper/data/models/Component;",
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
    if-ge v2, v1, :cond_1

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
    check-cast v4, Ldev/jahir/kuper/data/models/Component;

    .line 31
    .line 32
    invoke-virtual {v4}, Ldev/jahir/kuper/data/models/Component;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    const/4 v5, 0x0

    .line 37
    const/4 v6, 0x1

    .line 38
    invoke-static {v4, v5, v6, v5}, Ldev/jahir/frames/extensions/resources/StringKt;->lower$default(Ljava/lang/String;Ljava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-static {p2, v5, v6, v5}, Ldev/jahir/frames/extensions/resources/StringKt;->lower$default(Ljava/lang/String;Ljava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-static {v4, v5}, Ll5/e;->l0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_0

    .line 51
    .line 52
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 59
    .line 60
    .line 61
    return-object p1
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

.method public loadData()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->getComponentsViewModel()Ldev/jahir/kuper/data/viewmodels/ComponentsViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ldev/jahir/kuper/data/viewmodels/ComponentsViewModel;->loadComponents()V

    .line 6
    .line 7
    .line 8
    return-void
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

.method public onAttach(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;->onAttach(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->getComponentsAdapter()Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p1}, Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;->updateSectionTitles$library_release(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->requestStoragePermission()V

    .line 17
    .line 18
    .line 19
    return-void
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
    invoke-direct {p0}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->getComponentsViewModel()Ldev/jahir/kuper/data/viewmodels/ComponentsViewModel;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance v0, Ldev/jahir/kuper/ui/fragments/c;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, v1}, Ldev/jahir/kuper/ui/fragments/c;-><init>(Ldev/jahir/kuper/ui/fragments/ComponentsFragment;I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p0, v0}, Ldev/jahir/kuper/data/viewmodels/ComponentsViewModel;->observe(Landroidx/lifecycle/w;Ld5/l;)V

    .line 15
    .line 16
    .line 17
    return-void
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

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/l0;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->getComponentsViewModel()Ldev/jahir/kuper/data/viewmodels/ComponentsViewModel;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p0}, Ldev/jahir/kuper/data/viewmodels/ComponentsViewModel;->destroy(Landroidx/lifecycle/w;)V

    .line 9
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

.method public onResume()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/l0;->onResume()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->updateDeviceWallpaper$library_release()V

    .line 5
    .line 6
    .line 7
    return-void
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
    invoke-virtual {p0}, Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;->getRecyclerView()Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 p2, 0x0

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollRecyclerView;->setFastScrollEnabled(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v0, 0x2

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    sget v1, Ldev/jahir/frames/R$integer;->wallpapers_columns_count:I

    .line 27
    .line 28
    invoke-static {p1, v1, v0}, Ldev/jahir/frames/extensions/context/ContextKt;->integer(Landroid/content/Context;II)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    :cond_1
    new-instance p1, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    invoke-direct {p1, v0, p2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(II)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;->getRecyclerView()Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    if-eqz p2, :cond_2

    .line 45
    .line 46
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/p1;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    invoke-virtual {p0}, Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;->getRecyclerView()Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    if-eqz p2, :cond_4

    .line 54
    .line 55
    new-instance v1, Ldev/jahir/kuper/ui/decorations/SectionedGridSpacingDecoration;

    .line 56
    .line 57
    invoke-virtual {p0}, Landroidx/fragment/app/l0;->getContext()Landroid/content/Context;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    const/16 v3, 0x8

    .line 62
    .line 63
    if-eqz v2, :cond_3

    .line 64
    .line 65
    sget v4, Ldev/jahir/frames/R$dimen;->grids_spacing:I

    .line 66
    .line 67
    int-to-float v3, v3

    .line 68
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    .line 77
    .line 78
    mul-float v3, v3, v5

    .line 79
    .line 80
    float-to-int v3, v3

    .line 81
    invoke-static {v2, v4, v3}, Ldev/jahir/frames/extensions/context/ContextKt;->dimenPixelSize(Landroid/content/Context;II)I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    goto :goto_0

    .line 86
    :cond_3
    int-to-float v2, v3

    .line 87
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 96
    .line 97
    mul-float v2, v2, v3

    .line 98
    .line 99
    float-to-int v2, v2

    .line 100
    :goto_0
    invoke-direct {v1, v0, v2}, Ldev/jahir/kuper/ui/decorations/SectionedGridSpacingDecoration;-><init>(II)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p2, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/l1;)V

    .line 104
    .line 105
    .line 106
    :cond_4
    invoke-direct {p0}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->getComponentsAdapter()Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    invoke-virtual {p2, p1}, Lcom/afollestad/sectionedrecyclerview/d;->setLayoutManager(Landroidx/recyclerview/widget/GridLayoutManager;)V

    .line 111
    .line 112
    .line 113
    invoke-direct {p0}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->getComponentsAdapter()Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-direct {p0}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->getWallpaper()Landroid/graphics/drawable/Drawable;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    invoke-virtual {p1, p2}, Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;->setWallpaper$library_release(Landroid/graphics/drawable/Drawable;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0}, Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;->getRecyclerView()Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    if-eqz p1, :cond_5

    .line 129
    .line 130
    invoke-direct {p0}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->getComponentsAdapter()Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    invoke-virtual {p1, p2}, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;->setAdapter(Landroidx/recyclerview/widget/c1;)V

    .line 135
    .line 136
    .line 137
    :cond_5
    invoke-virtual {p0}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->loadData()V

    .line 138
    .line 139
    .line 140
    return-void
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

.method public final updateDeviceWallpaper$library_release()V
    .locals 2

    .line 1
    :try_start_0
    invoke-direct {p0}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->getComponentsAdapter()Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->getWallpaper()Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;->setWallpaper$library_release(Landroid/graphics/drawable/Drawable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    :catch_0
    return-void
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

.method public updateItemsInAdapter(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldev/jahir/kuper/data/models/Component;",
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
    invoke-direct {p0}, Ldev/jahir/kuper/ui/fragments/ComponentsFragment;->getComponentsAdapter()Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;->setComponents(Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;->getRecyclerView()Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p1, v0}, Ldev/jahir/frames/ui/widgets/StatefulRecyclerView;->setLoading(Z)V

    .line 21
    .line 22
    .line 23
    :cond_0
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
