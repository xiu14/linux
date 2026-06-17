.class public abstract Landroidx/appcompat/app/u;
.super Landroidx/fragment/app/q0;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroidx/appcompat/app/v;
.implements Lb0/i0;
.implements Landroidx/appcompat/app/e;


# static fields
.field private static final DELEGATE_TAG:Ljava/lang/String; = "androidx:appcompat"


# instance fields
.field private mDelegate:Landroidx/appcompat/app/b0;

.field private mResources:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/q0;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lb/q;->getSavedStateRegistry()Lw1/f;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, Landroidx/appcompat/app/s;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Landroidx/appcompat/app/s;-><init>(Landroidx/appcompat/app/u;)V

    .line 11
    .line 12
    .line 13
    const-string v2, "androidx:appcompat"

    .line 14
    .line 15
    invoke-virtual {v0, v2, v1}, Lw1/f;->c(Ljava/lang/String;Lw1/e;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Landroidx/appcompat/app/t;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Landroidx/appcompat/app/t;-><init>(Landroidx/appcompat/app/u;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lb/q;->addOnContextAvailableListener(Lc/b;)V

    .line 24
    .line 25
    .line 26
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method


# virtual methods
.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lb/q;->initializeViewTreeOwners()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->getDelegate()Landroidx/appcompat/app/b0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Landroidx/appcompat/app/q0;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/appcompat/app/q0;->B()V

    .line 11
    .line 12
    .line 13
    iget-object v1, v0, Landroidx/appcompat/app/q0;->H:Landroid/view/ViewGroup;

    .line 14
    .line 15
    const v2, 0x1020002

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Landroid/view/ViewGroup;

    .line 23
    .line 24
    invoke-virtual {v1, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, v0, Landroidx/appcompat/app/q0;->t:Landroidx/appcompat/app/k0;

    .line 28
    .line 29
    iget-object p2, v0, Landroidx/appcompat/app/q0;->s:Landroid/view/Window;

    .line 30
    .line 31
    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p1, p2}, Landroidx/appcompat/app/k0;->a(Landroid/view/Window$Callback;)V

    .line 36
    .line 37
    .line 38
    return-void
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

.method public attachBaseContext(Landroid/content/Context;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->getDelegate()Landroidx/appcompat/app/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroidx/appcompat/app/q0;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, v0, Landroidx/appcompat/app/q0;->V:Z

    .line 9
    .line 10
    iget v2, v0, Landroidx/appcompat/app/q0;->Z:I

    .line 11
    .line 12
    const/16 v3, -0x64

    .line 13
    .line 14
    if-eq v2, v3, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget v2, Landroidx/appcompat/app/b0;->i:I

    .line 18
    .line 19
    :goto_0
    invoke-virtual {v0, p1, v2}, Landroidx/appcompat/app/q0;->J(Landroid/content/Context;I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {p1}, Landroidx/appcompat/app/b0;->g(Landroid/content/Context;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-static {p1}, Landroidx/appcompat/app/b0;->r(Landroid/content/Context;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-static {p1}, Landroidx/appcompat/app/q0;->u(Landroid/content/Context;)Li0/j;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    instance-of v3, p1, Landroid/view/ContextThemeWrapper;

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    const/4 v5, 0x0

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    invoke-static {p1, v0, v2, v5, v4}, Landroidx/appcompat/app/q0;->y(Landroid/content/Context;ILi0/j;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    :try_start_0
    move-object v6, p1

    .line 47
    check-cast v6, Landroid/view/ContextThemeWrapper;

    .line 48
    .line 49
    invoke-virtual {v6, v3}, Landroid/view/ContextThemeWrapper;->applyOverrideConfiguration(Landroid/content/res/Configuration;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    .line 52
    goto/16 :goto_8

    .line 53
    .line 54
    :catch_0
    nop

    .line 55
    :cond_2
    instance-of v3, p1, Lk/d;

    .line 56
    .line 57
    if-eqz v3, :cond_3

    .line 58
    .line 59
    invoke-static {p1, v0, v2, v5, v4}, Landroidx/appcompat/app/q0;->y(Landroid/content/Context;ILi0/j;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    :try_start_1
    move-object v4, p1

    .line 64
    check-cast v4, Lk/d;

    .line 65
    .line 66
    invoke-virtual {v4, v3}, Lk/d;->a(Landroid/content/res/Configuration;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 67
    .line 68
    .line 69
    goto/16 :goto_8

    .line 70
    .line 71
    :catch_1
    nop

    .line 72
    :cond_3
    sget-boolean v3, Landroidx/appcompat/app/q0;->q0:Z

    .line 73
    .line 74
    if-nez v3, :cond_4

    .line 75
    .line 76
    goto/16 :goto_8

    .line 77
    .line 78
    :cond_4
    new-instance v3, Landroid/content/res/Configuration;

    .line 79
    .line 80
    invoke-direct {v3}, Landroid/content/res/Configuration;-><init>()V

    .line 81
    .line 82
    .line 83
    const/4 v4, -0x1

    .line 84
    iput v4, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 85
    .line 86
    const/4 v4, 0x0

    .line 87
    iput v4, v3, Landroid/content/res/Configuration;->fontScale:F

    .line 88
    .line 89
    invoke-virtual {p1, v3}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    iget v7, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 110
    .line 111
    iput v7, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 112
    .line 113
    invoke-virtual {v3, v6}, Landroid/content/res/Configuration;->equals(Landroid/content/res/Configuration;)Z

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    if-nez v7, :cond_1c

    .line 118
    .line 119
    new-instance v7, Landroid/content/res/Configuration;

    .line 120
    .line 121
    invoke-direct {v7}, Landroid/content/res/Configuration;-><init>()V

    .line 122
    .line 123
    .line 124
    iput v4, v7, Landroid/content/res/Configuration;->fontScale:F

    .line 125
    .line 126
    invoke-virtual {v3, v6}, Landroid/content/res/Configuration;->diff(Landroid/content/res/Configuration;)I

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-nez v4, :cond_5

    .line 131
    .line 132
    goto/16 :goto_2

    .line 133
    .line 134
    :cond_5
    iget v4, v3, Landroid/content/res/Configuration;->fontScale:F

    .line 135
    .line 136
    iget v8, v6, Landroid/content/res/Configuration;->fontScale:F

    .line 137
    .line 138
    cmpl-float v4, v4, v8

    .line 139
    .line 140
    if-eqz v4, :cond_6

    .line 141
    .line 142
    iput v8, v7, Landroid/content/res/Configuration;->fontScale:F

    .line 143
    .line 144
    :cond_6
    iget v4, v3, Landroid/content/res/Configuration;->mcc:I

    .line 145
    .line 146
    iget v8, v6, Landroid/content/res/Configuration;->mcc:I

    .line 147
    .line 148
    if-eq v4, v8, :cond_7

    .line 149
    .line 150
    iput v8, v7, Landroid/content/res/Configuration;->mcc:I

    .line 151
    .line 152
    :cond_7
    iget v4, v3, Landroid/content/res/Configuration;->mnc:I

    .line 153
    .line 154
    iget v8, v6, Landroid/content/res/Configuration;->mnc:I

    .line 155
    .line 156
    if-eq v4, v8, :cond_8

    .line 157
    .line 158
    iput v8, v7, Landroid/content/res/Configuration;->mnc:I

    .line 159
    .line 160
    :cond_8
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 161
    .line 162
    const/16 v8, 0x18

    .line 163
    .line 164
    if-lt v4, v8, :cond_9

    .line 165
    .line 166
    invoke-static {v3, v6, v7}, Landroidx/appcompat/app/g0;->a(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    .line 167
    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_9
    iget-object v8, v3, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 171
    .line 172
    iget-object v9, v6, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 173
    .line 174
    invoke-static {v8, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    if-nez v8, :cond_a

    .line 179
    .line 180
    iget-object v8, v6, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 181
    .line 182
    iput-object v8, v7, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 183
    .line 184
    :cond_a
    :goto_1
    iget v8, v3, Landroid/content/res/Configuration;->touchscreen:I

    .line 185
    .line 186
    iget v9, v6, Landroid/content/res/Configuration;->touchscreen:I

    .line 187
    .line 188
    if-eq v8, v9, :cond_b

    .line 189
    .line 190
    iput v9, v7, Landroid/content/res/Configuration;->touchscreen:I

    .line 191
    .line 192
    :cond_b
    iget v8, v3, Landroid/content/res/Configuration;->keyboard:I

    .line 193
    .line 194
    iget v9, v6, Landroid/content/res/Configuration;->keyboard:I

    .line 195
    .line 196
    if-eq v8, v9, :cond_c

    .line 197
    .line 198
    iput v9, v7, Landroid/content/res/Configuration;->keyboard:I

    .line 199
    .line 200
    :cond_c
    iget v8, v3, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 201
    .line 202
    iget v9, v6, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 203
    .line 204
    if-eq v8, v9, :cond_d

    .line 205
    .line 206
    iput v9, v7, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 207
    .line 208
    :cond_d
    iget v8, v3, Landroid/content/res/Configuration;->navigation:I

    .line 209
    .line 210
    iget v9, v6, Landroid/content/res/Configuration;->navigation:I

    .line 211
    .line 212
    if-eq v8, v9, :cond_e

    .line 213
    .line 214
    iput v9, v7, Landroid/content/res/Configuration;->navigation:I

    .line 215
    .line 216
    :cond_e
    iget v8, v3, Landroid/content/res/Configuration;->navigationHidden:I

    .line 217
    .line 218
    iget v9, v6, Landroid/content/res/Configuration;->navigationHidden:I

    .line 219
    .line 220
    if-eq v8, v9, :cond_f

    .line 221
    .line 222
    iput v9, v7, Landroid/content/res/Configuration;->navigationHidden:I

    .line 223
    .line 224
    :cond_f
    iget v8, v3, Landroid/content/res/Configuration;->orientation:I

    .line 225
    .line 226
    iget v9, v6, Landroid/content/res/Configuration;->orientation:I

    .line 227
    .line 228
    if-eq v8, v9, :cond_10

    .line 229
    .line 230
    iput v9, v7, Landroid/content/res/Configuration;->orientation:I

    .line 231
    .line 232
    :cond_10
    iget v8, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 233
    .line 234
    and-int/lit8 v8, v8, 0xf

    .line 235
    .line 236
    iget v9, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 237
    .line 238
    and-int/lit8 v9, v9, 0xf

    .line 239
    .line 240
    if-eq v8, v9, :cond_11

    .line 241
    .line 242
    iget v8, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 243
    .line 244
    or-int/2addr v8, v9

    .line 245
    iput v8, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 246
    .line 247
    :cond_11
    iget v8, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 248
    .line 249
    and-int/lit16 v8, v8, 0xc0

    .line 250
    .line 251
    iget v9, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 252
    .line 253
    and-int/lit16 v9, v9, 0xc0

    .line 254
    .line 255
    if-eq v8, v9, :cond_12

    .line 256
    .line 257
    iget v8, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 258
    .line 259
    or-int/2addr v8, v9

    .line 260
    iput v8, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 261
    .line 262
    :cond_12
    iget v8, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 263
    .line 264
    and-int/lit8 v8, v8, 0x30

    .line 265
    .line 266
    iget v9, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 267
    .line 268
    and-int/lit8 v9, v9, 0x30

    .line 269
    .line 270
    if-eq v8, v9, :cond_13

    .line 271
    .line 272
    iget v8, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 273
    .line 274
    or-int/2addr v8, v9

    .line 275
    iput v8, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 276
    .line 277
    :cond_13
    iget v8, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 278
    .line 279
    and-int/lit16 v8, v8, 0x300

    .line 280
    .line 281
    iget v9, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 282
    .line 283
    and-int/lit16 v9, v9, 0x300

    .line 284
    .line 285
    if-eq v8, v9, :cond_14

    .line 286
    .line 287
    iget v8, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 288
    .line 289
    or-int/2addr v8, v9

    .line 290
    iput v8, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 291
    .line 292
    :cond_14
    const/16 v8, 0x1a

    .line 293
    .line 294
    if-lt v4, v8, :cond_16

    .line 295
    .line 296
    invoke-static {v3}, La3/b;->a(Landroid/content/res/Configuration;)I

    .line 297
    .line 298
    .line 299
    move-result v4

    .line 300
    and-int/lit8 v4, v4, 0x3

    .line 301
    .line 302
    invoke-static {v6}, La3/b;->a(Landroid/content/res/Configuration;)I

    .line 303
    .line 304
    .line 305
    move-result v8

    .line 306
    and-int/lit8 v8, v8, 0x3

    .line 307
    .line 308
    if-eq v4, v8, :cond_15

    .line 309
    .line 310
    invoke-static {v7}, La3/b;->a(Landroid/content/res/Configuration;)I

    .line 311
    .line 312
    .line 313
    move-result v4

    .line 314
    invoke-static {v6}, La3/b;->a(Landroid/content/res/Configuration;)I

    .line 315
    .line 316
    .line 317
    move-result v8

    .line 318
    and-int/lit8 v8, v8, 0x3

    .line 319
    .line 320
    or-int/2addr v4, v8

    .line 321
    invoke-static {v7, v4}, La3/b;->u(Landroid/content/res/Configuration;I)V

    .line 322
    .line 323
    .line 324
    :cond_15
    invoke-static {v3}, La3/b;->a(Landroid/content/res/Configuration;)I

    .line 325
    .line 326
    .line 327
    move-result v4

    .line 328
    and-int/lit8 v4, v4, 0xc

    .line 329
    .line 330
    invoke-static {v6}, La3/b;->a(Landroid/content/res/Configuration;)I

    .line 331
    .line 332
    .line 333
    move-result v8

    .line 334
    and-int/lit8 v8, v8, 0xc

    .line 335
    .line 336
    if-eq v4, v8, :cond_16

    .line 337
    .line 338
    invoke-static {v7}, La3/b;->a(Landroid/content/res/Configuration;)I

    .line 339
    .line 340
    .line 341
    move-result v4

    .line 342
    invoke-static {v6}, La3/b;->a(Landroid/content/res/Configuration;)I

    .line 343
    .line 344
    .line 345
    move-result v8

    .line 346
    and-int/lit8 v8, v8, 0xc

    .line 347
    .line 348
    or-int/2addr v4, v8

    .line 349
    invoke-static {v7, v4}, La3/b;->u(Landroid/content/res/Configuration;I)V

    .line 350
    .line 351
    .line 352
    :cond_16
    iget v4, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 353
    .line 354
    and-int/lit8 v4, v4, 0xf

    .line 355
    .line 356
    iget v8, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 357
    .line 358
    and-int/lit8 v8, v8, 0xf

    .line 359
    .line 360
    if-eq v4, v8, :cond_17

    .line 361
    .line 362
    iget v4, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 363
    .line 364
    or-int/2addr v4, v8

    .line 365
    iput v4, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 366
    .line 367
    :cond_17
    iget v4, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 368
    .line 369
    and-int/lit8 v4, v4, 0x30

    .line 370
    .line 371
    iget v8, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 372
    .line 373
    and-int/lit8 v8, v8, 0x30

    .line 374
    .line 375
    if-eq v4, v8, :cond_18

    .line 376
    .line 377
    iget v4, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 378
    .line 379
    or-int/2addr v4, v8

    .line 380
    iput v4, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 381
    .line 382
    :cond_18
    iget v4, v3, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 383
    .line 384
    iget v8, v6, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 385
    .line 386
    if-eq v4, v8, :cond_19

    .line 387
    .line 388
    iput v8, v7, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 389
    .line 390
    :cond_19
    iget v4, v3, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 391
    .line 392
    iget v8, v6, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 393
    .line 394
    if-eq v4, v8, :cond_1a

    .line 395
    .line 396
    iput v8, v7, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 397
    .line 398
    :cond_1a
    iget v4, v3, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 399
    .line 400
    iget v8, v6, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 401
    .line 402
    if-eq v4, v8, :cond_1b

    .line 403
    .line 404
    iput v8, v7, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 405
    .line 406
    :cond_1b
    iget v3, v3, Landroid/content/res/Configuration;->densityDpi:I

    .line 407
    .line 408
    iget v4, v6, Landroid/content/res/Configuration;->densityDpi:I

    .line 409
    .line 410
    if-eq v3, v4, :cond_1d

    .line 411
    .line 412
    iput v4, v7, Landroid/content/res/Configuration;->densityDpi:I

    .line 413
    .line 414
    goto :goto_2

    .line 415
    :cond_1c
    move-object v7, v5

    .line 416
    :cond_1d
    :goto_2
    invoke-static {p1, v0, v2, v7, v1}, Landroidx/appcompat/app/q0;->y(Landroid/content/Context;ILi0/j;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    new-instance v2, Lk/d;

    .line 421
    .line 422
    sget v3, Lf/i;->Theme_AppCompat_Empty:I

    .line 423
    .line 424
    invoke-direct {v2, p1, v3}, Lk/d;-><init>(Landroid/content/Context;I)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v2, v0}, Lk/d;->a(Landroid/content/res/Configuration;)V

    .line 428
    .line 429
    .line 430
    :try_start_2
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 431
    .line 432
    .line 433
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_5

    .line 434
    if-eqz p1, :cond_21

    .line 435
    .line 436
    invoke-virtual {v2}, Lk/d;->getTheme()Landroid/content/res/Resources$Theme;

    .line 437
    .line 438
    .line 439
    move-result-object p1

    .line 440
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 441
    .line 442
    const/16 v3, 0x1d

    .line 443
    .line 444
    if-lt v0, v3, :cond_1e

    .line 445
    .line 446
    invoke-static {p1}, Ld0/m;->a(Landroid/content/res/Resources$Theme;)V

    .line 447
    .line 448
    .line 449
    goto :goto_7

    .line 450
    :cond_1e
    const/16 v3, 0x17

    .line 451
    .line 452
    if-lt v0, v3, :cond_21

    .line 453
    .line 454
    sget-object v0, Ld0/b;->e:Ljava/lang/Object;

    .line 455
    .line 456
    monitor-enter v0

    .line 457
    :try_start_3
    sget-boolean v3, Ld0/b;->g:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 458
    .line 459
    if-nez v3, :cond_1f

    .line 460
    .line 461
    :try_start_4
    const-class v3, Landroid/content/res/Resources$Theme;

    .line 462
    .line 463
    const-string v4, "rebase"

    .line 464
    .line 465
    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 466
    .line 467
    .line 468
    move-result-object v3

    .line 469
    sput-object v3, Ld0/b;->f:Ljava/lang/reflect/Method;

    .line 470
    .line 471
    invoke-virtual {v3, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 472
    .line 473
    .line 474
    goto :goto_3

    .line 475
    :catchall_0
    move-exception p1

    .line 476
    goto :goto_6

    .line 477
    :catch_2
    move-exception v3

    .line 478
    :try_start_5
    const-string v4, "ResourcesCompat"

    .line 479
    .line 480
    const-string v6, "Failed to retrieve rebase() method"

    .line 481
    .line 482
    invoke-static {v4, v6, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 483
    .line 484
    .line 485
    :goto_3
    sput-boolean v1, Ld0/b;->g:Z

    .line 486
    .line 487
    :cond_1f
    sget-object v1, Ld0/b;->f:Ljava/lang/reflect/Method;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 488
    .line 489
    if-eqz v1, :cond_20

    .line 490
    .line 491
    :try_start_6
    invoke-virtual {v1, p1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catch Ljava/lang/IllegalAccessException; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 492
    .line 493
    .line 494
    goto :goto_5

    .line 495
    :catch_3
    move-exception p1

    .line 496
    goto :goto_4

    .line 497
    :catch_4
    move-exception p1

    .line 498
    :goto_4
    :try_start_7
    const-string v1, "ResourcesCompat"

    .line 499
    .line 500
    const-string v3, "Failed to invoke rebase() method via reflection"

    .line 501
    .line 502
    invoke-static {v1, v3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 503
    .line 504
    .line 505
    sput-object v5, Ld0/b;->f:Ljava/lang/reflect/Method;

    .line 506
    .line 507
    :cond_20
    :goto_5
    monitor-exit v0

    .line 508
    goto :goto_7

    .line 509
    :goto_6
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 510
    throw p1

    .line 511
    :catch_5
    :cond_21
    :goto_7
    move-object p1, v2

    .line 512
    :goto_8
    invoke-super {p0, p1}, Landroid/app/Activity;->attachBaseContext(Landroid/content/Context;)V

    .line 513
    .line 514
    .line 515
    return-void
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

.method public closeOptionsMenu()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->getSupportActionBar()Landroidx/appcompat/app/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/appcompat/app/a;->a()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->closeOptionsMenu()V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->getSupportActionBar()Landroidx/appcompat/app/a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/16 v2, 0x52

    .line 10
    .line 11
    if-ne v0, v2, :cond_0

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Landroidx/appcompat/app/a;->j(Landroid/view/KeyEvent;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    return p1

    .line 23
    :cond_0
    invoke-super {p0, p1}, Lb0/q;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1
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

.method public findViewById(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->getDelegate()Landroidx/appcompat/app/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroidx/appcompat/app/q0;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/appcompat/app/q0;->B()V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Landroidx/appcompat/app/q0;->s:Landroid/view/Window;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
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

.method public getDelegate()Landroidx/appcompat/app/b0;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/u;->mDelegate:Landroidx/appcompat/app/b0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Landroidx/appcompat/app/b0;->h:Landroidx/room/c1;

    .line 6
    .line 7
    new-instance v0, Landroidx/appcompat/app/q0;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1, p0, p0}, Landroidx/appcompat/app/q0;-><init>(Landroid/content/Context;Landroid/view/Window;Landroidx/appcompat/app/v;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Landroidx/appcompat/app/u;->mDelegate:Landroidx/appcompat/app/b0;

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/u;->mDelegate:Landroidx/appcompat/app/b0;

    .line 16
    .line 17
    return-object v0
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

.method public getDrawerToggleDelegate()Landroidx/appcompat/app/d;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->getDelegate()Landroidx/appcompat/app/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroidx/appcompat/app/q0;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroidx/appcompat/app/d0;

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    invoke-direct {v1, v0, v2}, Landroidx/appcompat/app/d0;-><init>(Landroidx/appcompat/app/q0;I)V

    .line 14
    .line 15
    .line 16
    return-object v1
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

.method public getMenuInflater()Landroid/view/MenuInflater;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->getDelegate()Landroidx/appcompat/app/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroidx/appcompat/app/q0;

    .line 6
    .line 7
    iget-object v1, v0, Landroidx/appcompat/app/q0;->w:Lk/i;

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/appcompat/app/q0;->H()V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lk/i;

    .line 15
    .line 16
    iget-object v2, v0, Landroidx/appcompat/app/q0;->v:Landroidx/appcompat/app/a;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v2}, Landroidx/appcompat/app/a;->e()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v2, v0, Landroidx/appcompat/app/q0;->r:Landroid/content/Context;

    .line 26
    .line 27
    :goto_0
    invoke-direct {v1, v2}, Lk/i;-><init>(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, v0, Landroidx/appcompat/app/q0;->w:Lk/i;

    .line 31
    .line 32
    :cond_1
    iget-object v0, v0, Landroidx/appcompat/app/q0;->w:Lk/i;

    .line 33
    .line 34
    return-object v0
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
.end method

.method public getResources()Landroid/content/res/Resources;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/u;->mResources:Landroid/content/res/Resources;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget v1, Landroidx/appcompat/widget/p4;->a:I

    .line 6
    .line 7
    :cond_0
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-super {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_1
    return-object v0
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

.method public getSupportActionBar()Landroidx/appcompat/app/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->getDelegate()Landroidx/appcompat/app/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroidx/appcompat/app/q0;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/appcompat/app/q0;->H()V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Landroidx/appcompat/app/q0;->v:Landroidx/appcompat/app/a;

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

.method public getSupportParentActivityIntent()Landroid/content/Intent;
    .locals 1

    .line 1
    invoke-static {p0}, Lb0/m;->a(Landroidx/appcompat/app/u;)Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public invalidateOptionsMenu()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->getDelegate()Landroidx/appcompat/app/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/appcompat/app/b0;->f()V

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

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lb/q;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->getDelegate()Landroidx/appcompat/app/b0;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Landroidx/appcompat/app/q0;

    .line 9
    .line 10
    iget-boolean v0, p1, Landroidx/appcompat/app/q0;->M:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-boolean v0, p1, Landroidx/appcompat/app/q0;->G:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/appcompat/app/q0;->H()V

    .line 19
    .line 20
    .line 21
    iget-object v0, p1, Landroidx/appcompat/app/q0;->v:Landroidx/appcompat/app/a;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/appcompat/app/a;->g()V

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-static {}, Landroidx/appcompat/widget/b0;->a()Landroidx/appcompat/widget/b0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v1, p1, Landroidx/appcompat/app/q0;->r:Landroid/content/Context;

    .line 33
    .line 34
    monitor-enter v0

    .line 35
    :try_start_0
    iget-object v2, v0, Landroidx/appcompat/widget/b0;->a:Landroidx/appcompat/widget/z2;

    .line 36
    .line 37
    invoke-virtual {v2, v1}, Landroidx/appcompat/widget/z2;->l(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    monitor-exit v0

    .line 41
    new-instance v0, Landroid/content/res/Configuration;

    .line 42
    .line 43
    iget-object v1, p1, Landroidx/appcompat/app/q0;->r:Landroid/content/Context;

    .line 44
    .line 45
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-direct {v0, v1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p1, Landroidx/appcompat/app/q0;->Y:Landroid/content/res/Configuration;

    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    invoke-virtual {p1, v0, v0}, Landroidx/appcompat/app/q0;->s(ZZ)Z

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Landroidx/appcompat/app/u;->mResources:Landroid/content/res/Resources;

    .line 63
    .line 64
    if-eqz p1, :cond_1

    .line 65
    .line 66
    invoke-super {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-super {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iget-object v1, p0, Landroidx/appcompat/app/u;->mResources:Landroid/content/res/Resources;

    .line 83
    .line 84
    invoke-virtual {v1, p1, v0}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    .line 85
    .line 86
    .line 87
    :cond_1
    return-void

    .line 88
    :catchall_0
    move-exception p1

    .line 89
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 90
    throw p1
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

.method public onContentChanged()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->onSupportContentChanged()V

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
.end method

.method public onCreateSupportNavigateUpTaskStack(Lb0/j0;)V
    .locals 4

    .line 1
    iget-object v0, p1, Lb0/j0;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object p1, p1, Lb0/j0;->i:Landroidx/appcompat/app/u;

    .line 4
    .line 5
    invoke-interface {p0}, Lb0/i0;->getSupportParentActivityIntent()Landroid/content/Intent;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-static {p0}, Lb0/m;->a(Landroidx/appcompat/app/u;)Landroid/content/Intent;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :cond_0
    if-eqz v1, :cond_3

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v1, v2}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    :try_start_0
    invoke-static {p1, v2}, Lb0/m;->b(Landroidx/appcompat/app/u;Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    :goto_0
    if-eqz v2, :cond_2

    .line 40
    .line 41
    invoke-virtual {v0, v3, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-static {p1, v2}, Lb0/m;->b(Landroidx/appcompat/app/u;Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 49
    .line 50
    .line 51
    move-result-object v2
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    goto :goto_0

    .line 53
    :catch_0
    move-exception p1

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :goto_1
    const-string v0, "TaskStackBuilder"

    .line 60
    .line 61
    const-string v1, "Bad ComponentName while traversing activity parent metadata"

    .line 62
    .line 63
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 67
    .line 68
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    throw v0

    .line 72
    :cond_3
    return-void
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

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/q0;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->getDelegate()Landroidx/appcompat/app/b0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroidx/appcompat/app/b0;->i()V

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

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getMetaState()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {v0}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {v0}, Landroid/view/KeyEvent;->isModifierKey(I)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0, p2}, Landroid/view/View;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_0

    .line 60
    .line 61
    const/4 p1, 0x1

    .line 62
    return p1

    .line 63
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    return p1
    .line 68
    .line 69
    .line 70
    .line 71
.end method

.method public onLocalesChanged(Li0/j;)V
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
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/q0;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->getSupportActionBar()Landroidx/appcompat/app/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    const v0, 0x102002c

    .line 18
    .line 19
    .line 20
    if-ne p2, v0, :cond_1

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p1}, Landroidx/appcompat/app/a;->d()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    and-int/lit8 p1, p1, 0x4

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->onSupportNavigateUp()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    return p1

    .line 37
    :cond_1
    const/4 p1, 0x0

    .line 38
    return p1
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

.method public onMenuOpened(ILandroid/view/Menu;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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

.method public onNightModeChanged(I)V
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
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lb/q;->onPanelClosed(ILandroid/view/Menu;)V

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

.method public onPostCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onPostCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->getDelegate()Landroidx/appcompat/app/b0;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Landroidx/appcompat/app/q0;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroidx/appcompat/app/q0;->B()V

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

.method public onPostResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/q0;->onPostResume()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->getDelegate()Landroidx/appcompat/app/b0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Landroidx/appcompat/app/q0;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/appcompat/app/q0;->H()V

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, Landroidx/appcompat/app/q0;->v:Landroidx/appcompat/app/a;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {v0, v1}, Landroidx/appcompat/app/a;->t(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
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

.method public onPrepareSupportNavigateUpTaskStack(Lb0/j0;)V
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
.end method

.method public onStart()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/q0;->onStart()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->getDelegate()Landroidx/appcompat/app/b0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Landroidx/appcompat/app/q0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/q0;->s(ZZ)Z

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
.end method

.method public onStop()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/q0;->onStop()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->getDelegate()Landroidx/appcompat/app/b0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Landroidx/appcompat/app/q0;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/appcompat/app/q0;->H()V

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, Landroidx/appcompat/app/q0;->v:Landroidx/appcompat/app/a;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {v0, v1}, Landroidx/appcompat/app/a;->t(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
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

.method public onSupportActionModeFinished(Lk/b;)V
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
.end method

.method public onSupportActionModeStarted(Lk/b;)V
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
.end method

.method public onSupportContentChanged()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

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
.end method

.method public onSupportNavigateUp()Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->getSupportParentActivityIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/u;->supportShouldUpRecreateTask(Landroid/content/Intent;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    new-instance v0, Lb0/j0;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lb0/j0;-><init>(Landroidx/appcompat/app/u;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/u;->onCreateSupportNavigateUpTaskStack(Lb0/j0;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/u;->onPrepareSupportNavigateUpTaskStack(Lb0/j0;)V

    .line 23
    .line 24
    .line 25
    iget-object v2, v0, Lb0/j0;->h:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-nez v3, :cond_0

    .line 32
    .line 33
    new-array v3, v1, [Landroid/content/Intent;

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, [Landroid/content/Intent;

    .line 40
    .line 41
    new-instance v3, Landroid/content/Intent;

    .line 42
    .line 43
    aget-object v4, v2, v1

    .line 44
    .line 45
    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 46
    .line 47
    .line 48
    const v4, 0x1000c000

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    aput-object v3, v2, v1

    .line 56
    .line 57
    iget-object v0, v0, Lb0/j0;->i:Landroidx/appcompat/app/u;

    .line 58
    .line 59
    const/4 v1, 0x0

    .line 60
    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->startActivities([Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 61
    .line 62
    .line 63
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->finishAffinity()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :catch_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 72
    .line 73
    const-string v1, "No intents added to TaskStackBuilder; cannot startActivities"

    .line 74
    .line 75
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v0

    .line 79
    :cond_1
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/u;->supportNavigateUpTo(Landroid/content/Intent;)V

    .line 80
    .line 81
    .line 82
    :goto_0
    const/4 v0, 0x1

    .line 83
    return v0

    .line 84
    :cond_2
    return v1
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

.method public onTitleChanged(Ljava/lang/CharSequence;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onTitleChanged(Ljava/lang/CharSequence;I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->getDelegate()Landroidx/appcompat/app/b0;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p2, p1}, Landroidx/appcompat/app/b0;->p(Ljava/lang/CharSequence;)V

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

.method public onWindowStartingSupportActionMode(Lk/a;)Lk/b;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
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
.end method

.method public openOptionsMenu()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->getSupportActionBar()Landroidx/appcompat/app/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/appcompat/app/a;->k()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->openOptionsMenu()V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public setContentView(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lb/q;->initializeViewTreeOwners()V

    .line 2
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->getDelegate()Landroidx/appcompat/app/b0;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/b0;->l(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Lb/q;->initializeViewTreeOwners()V

    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->getDelegate()Landroidx/appcompat/app/b0;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/b0;->m(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 5
    invoke-virtual {p0}, Lb/q;->initializeViewTreeOwners()V

    .line 6
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->getDelegate()Landroidx/appcompat/app/b0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroidx/appcompat/app/b0;->n(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->getDelegate()Landroidx/appcompat/app/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroidx/appcompat/app/q0;

    .line 6
    .line 7
    iget-object v1, v0, Landroidx/appcompat/app/q0;->q:Ljava/lang/Object;

    .line 8
    .line 9
    instance-of v1, v1, Landroid/app/Activity;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {v0}, Landroidx/appcompat/app/q0;->H()V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Landroidx/appcompat/app/q0;->v:Landroidx/appcompat/app/a;

    .line 18
    .line 19
    instance-of v2, v1, Landroidx/appcompat/app/e1;

    .line 20
    .line 21
    if-nez v2, :cond_4

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    iput-object v2, v0, Landroidx/appcompat/app/q0;->w:Lk/i;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1}, Landroidx/appcompat/app/a;->h()V

    .line 29
    .line 30
    .line 31
    :cond_1
    iput-object v2, v0, Landroidx/appcompat/app/q0;->v:Landroidx/appcompat/app/a;

    .line 32
    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    new-instance v1, Landroidx/appcompat/app/z0;

    .line 36
    .line 37
    iget-object v2, v0, Landroidx/appcompat/app/q0;->q:Ljava/lang/Object;

    .line 38
    .line 39
    instance-of v3, v2, Landroid/app/Activity;

    .line 40
    .line 41
    if-eqz v3, :cond_2

    .line 42
    .line 43
    check-cast v2, Landroid/app/Activity;

    .line 44
    .line 45
    invoke-virtual {v2}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    iget-object v2, v0, Landroidx/appcompat/app/q0;->x:Ljava/lang/CharSequence;

    .line 51
    .line 52
    :goto_0
    iget-object v3, v0, Landroidx/appcompat/app/q0;->t:Landroidx/appcompat/app/k0;

    .line 53
    .line 54
    invoke-direct {v1, p1, v2, v3}, Landroidx/appcompat/app/z0;-><init>(Landroidx/appcompat/widget/Toolbar;Ljava/lang/CharSequence;Landroidx/appcompat/app/k0;)V

    .line 55
    .line 56
    .line 57
    iput-object v1, v0, Landroidx/appcompat/app/q0;->v:Landroidx/appcompat/app/a;

    .line 58
    .line 59
    iget-object v2, v0, Landroidx/appcompat/app/q0;->t:Landroidx/appcompat/app/k0;

    .line 60
    .line 61
    iget-object v1, v1, Landroidx/appcompat/app/z0;->c:Landroidx/appcompat/app/x0;

    .line 62
    .line 63
    iput-object v1, v2, Landroidx/appcompat/app/k0;->i:Landroidx/appcompat/app/x0;

    .line 64
    .line 65
    const/4 v1, 0x1

    .line 66
    invoke-virtual {p1, v1}, Landroidx/appcompat/widget/Toolbar;->setBackInvokedCallbackEnabled(Z)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    iget-object p1, v0, Landroidx/appcompat/app/q0;->t:Landroidx/appcompat/app/k0;

    .line 71
    .line 72
    iput-object v2, p1, Landroidx/appcompat/app/k0;->i:Landroidx/appcompat/app/x0;

    .line 73
    .line 74
    :goto_1
    invoke-virtual {v0}, Landroidx/appcompat/app/q0;->f()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 79
    .line 80
    const-string v0, "This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead."

    .line 81
    .line 82
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw p1
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

.method public setSupportProgress(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

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
.end method

.method public setSupportProgressBarIndeterminate(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

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
.end method

.method public setSupportProgressBarIndeterminateVisibility(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

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
.end method

.method public setSupportProgressBarVisibility(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

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
.end method

.method public setTheme(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setTheme(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->getDelegate()Landroidx/appcompat/app/b0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Landroidx/appcompat/app/q0;

    .line 9
    .line 10
    iput p1, v0, Landroidx/appcompat/app/q0;->a0:I

    .line 11
    .line 12
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public startSupportActionMode(Lk/a;)Lk/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->getDelegate()Landroidx/appcompat/app/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroidx/appcompat/app/b0;->q(Lk/a;)Lk/b;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
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

.method public supportInvalidateOptionsMenu()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->getDelegate()Landroidx/appcompat/app/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/appcompat/app/b0;->f()V

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

.method public supportNavigateUpTo(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/app/Activity;->navigateUpTo(Landroid/content/Intent;)Z

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

.method public supportRequestWindowFeature(I)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->getDelegate()Landroidx/appcompat/app/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroidx/appcompat/app/b0;->k(I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
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

.method public supportShouldUpRecreateTask(Landroid/content/Intent;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/app/Activity;->shouldUpRecreateTask(Landroid/content/Intent;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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
