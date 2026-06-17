.class public final Landroidx/recyclerview/widget/s;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/recyclerview/widget/s;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
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


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 6

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/s;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, -0x1

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Landroid/view/View;

    .line 10
    .line 11
    check-cast p2, Landroid/view/View;

    .line 12
    .line 13
    sget-object v0, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 14
    .line 15
    invoke-static {p1}, Lm0/k0;->m(Landroid/view/View;)F

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-static {p2}, Lm0/k0;->m(Landroid/view/View;)F

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    cmpl-float v0, p1, p2

    .line 24
    .line 25
    if-lez v0, :cond_0

    .line 26
    .line 27
    const/4 v1, -0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    cmpg-float p1, p1, p2

    .line 30
    .line 31
    if-gez p1, :cond_1

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    :cond_1
    :goto_0
    return v1

    .line 35
    :pswitch_0
    check-cast p1, Lv1/i;

    .line 36
    .line 37
    iget-object p1, p1, Lv1/i;->a:Ljava/lang/String;

    .line 38
    .line 39
    check-cast p2, Lv1/i;

    .line 40
    .line 41
    iget-object p2, p2, Lv1/i;->a:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {p1, p2}, La/a;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    return p1

    .line 48
    :pswitch_1
    check-cast p1, Lv1/g;

    .line 49
    .line 50
    iget-object p1, p1, Lv1/g;->a:Ljava/lang/String;

    .line 51
    .line 52
    check-cast p2, Lv1/g;

    .line 53
    .line 54
    iget-object p2, p2, Lv1/g;->a:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {p1, p2}, La/a;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    return p1

    .line 61
    :pswitch_2
    check-cast p1, Ljava/util/Map$Entry;

    .line 62
    .line 63
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    check-cast p1, Ljava/lang/Integer;

    .line 68
    .line 69
    check-cast p2, Ljava/util/Map$Entry;

    .line 70
    .line 71
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    check-cast p2, Ljava/lang/Integer;

    .line 76
    .line 77
    invoke-static {p1, p2}, La/a;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    return p1

    .line 82
    :pswitch_3
    check-cast p1, Ljava/util/Map$Entry;

    .line 83
    .line 84
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    check-cast p1, Ljava/lang/Integer;

    .line 89
    .line 90
    check-cast p2, Ljava/util/Map$Entry;

    .line 91
    .line 92
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    check-cast p2, Ljava/lang/Integer;

    .line 97
    .line 98
    invoke-static {p1, p2}, La/a;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    return p1

    .line 103
    :pswitch_4
    check-cast p1, Lu/i;

    .line 104
    .line 105
    check-cast p2, Lu/i;

    .line 106
    .line 107
    iget p1, p1, Lu/i;->b:I

    .line 108
    .line 109
    iget p2, p2, Lu/i;->b:I

    .line 110
    .line 111
    sub-int/2addr p1, p2

    .line 112
    return p1

    .line 113
    :pswitch_5
    check-cast p1, Ln1/a;

    .line 114
    .line 115
    check-cast p2, Ln1/a;

    .line 116
    .line 117
    invoke-virtual {p2}, Ln1/a;->b()I

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    invoke-virtual {p1}, Ln1/a;->b()I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    sub-int/2addr p2, p1

    .line 126
    return p2

    .line 127
    :pswitch_6
    check-cast p1, Lk6/h;

    .line 128
    .line 129
    iget-object p1, p1, Lk6/h;->a:Lj6/z;

    .line 130
    .line 131
    check-cast p2, Lk6/h;

    .line 132
    .line 133
    iget-object p2, p2, Lk6/h;->a:Lj6/z;

    .line 134
    .line 135
    invoke-static {p1, p2}, La/a;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    return p1

    .line 140
    :pswitch_7
    check-cast p1, Landroidx/recyclerview/widget/g0;

    .line 141
    .line 142
    check-cast p2, Landroidx/recyclerview/widget/g0;

    .line 143
    .line 144
    iget-object v0, p1, Landroidx/recyclerview/widget/g0;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 145
    .line 146
    if-nez v0, :cond_2

    .line 147
    .line 148
    const/4 v4, 0x1

    .line 149
    goto :goto_1

    .line 150
    :cond_2
    const/4 v4, 0x0

    .line 151
    :goto_1
    iget-object v5, p2, Landroidx/recyclerview/widget/g0;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 152
    .line 153
    if-nez v5, :cond_3

    .line 154
    .line 155
    const/4 v5, 0x1

    .line 156
    goto :goto_2

    .line 157
    :cond_3
    const/4 v5, 0x0

    .line 158
    :goto_2
    if-eq v4, v5, :cond_4

    .line 159
    .line 160
    if-nez v0, :cond_5

    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_4
    iget-boolean v0, p1, Landroidx/recyclerview/widget/g0;->a:Z

    .line 164
    .line 165
    iget-boolean v4, p2, Landroidx/recyclerview/widget/g0;->a:Z

    .line 166
    .line 167
    if-eq v0, v4, :cond_7

    .line 168
    .line 169
    if-eqz v0, :cond_6

    .line 170
    .line 171
    :cond_5
    const/4 v1, -0x1

    .line 172
    goto :goto_4

    .line 173
    :cond_6
    :goto_3
    const/4 v1, 0x1

    .line 174
    goto :goto_4

    .line 175
    :cond_7
    iget v0, p2, Landroidx/recyclerview/widget/g0;->b:I

    .line 176
    .line 177
    iget v2, p1, Landroidx/recyclerview/widget/g0;->b:I

    .line 178
    .line 179
    sub-int/2addr v0, v2

    .line 180
    if-eqz v0, :cond_8

    .line 181
    .line 182
    move v1, v0

    .line 183
    goto :goto_4

    .line 184
    :cond_8
    iget p1, p1, Landroidx/recyclerview/widget/g0;->c:I

    .line 185
    .line 186
    iget p2, p2, Landroidx/recyclerview/widget/g0;->c:I

    .line 187
    .line 188
    sub-int/2addr p1, p2

    .line 189
    if-eqz p1, :cond_9

    .line 190
    .line 191
    move v1, p1

    .line 192
    :cond_9
    :goto_4
    return v1

    .line 193
    :pswitch_8
    check-cast p1, Landroidx/recyclerview/widget/t;

    .line 194
    .line 195
    check-cast p2, Landroidx/recyclerview/widget/t;

    .line 196
    .line 197
    iget p1, p1, Landroidx/recyclerview/widget/t;->a:I

    .line 198
    .line 199
    iget p2, p2, Landroidx/recyclerview/widget/t;->a:I

    .line 200
    .line 201
    sub-int/2addr p1, p2

    .line 202
    return p1

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
