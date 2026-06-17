.class public final Landroidx/room/n1;
.super Lv4/h;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ld5/p;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lt4/c;I)V
    .locals 0

    .line 1
    iput p4, p0, Landroidx/room/n1;->h:I

    iput-object p1, p0, Landroidx/room/n1;->j:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/room/n1;->k:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lv4/h;-><init>(ILt4/c;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lt4/c;I)V
    .locals 0

    .line 2
    iput p3, p0, Landroidx/room/n1;->h:I

    iput-object p1, p0, Landroidx/room/n1;->k:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lv4/h;-><init>(ILt4/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lt4/c;)Lt4/c;
    .locals 3

    .line 1
    iget v0, p0, Landroidx/room/n1;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Landroidx/room/n1;

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/room/n1;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ly2/j;

    .line 11
    .line 12
    iget-object v1, p0, Landroidx/room/n1;->k:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lj3/j;

    .line 15
    .line 16
    const/16 v2, 0x9

    .line 17
    .line 18
    invoke-direct {p1, v0, v1, p2, v2}, Landroidx/room/n1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt4/c;I)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_0
    new-instance v0, Landroidx/room/n1;

    .line 23
    .line 24
    iget-object v1, p0, Landroidx/room/n1;->k:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Lq5/h;

    .line 27
    .line 28
    const/16 v2, 0x8

    .line 29
    .line 30
    invoke-direct {v0, v1, p2, v2}, Landroidx/room/n1;-><init>(Ljava/lang/Object;Lt4/c;I)V

    .line 31
    .line 32
    .line 33
    iput-object p1, v0, Landroidx/room/n1;->j:Ljava/lang/Object;

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_1
    new-instance p1, Landroidx/room/n1;

    .line 37
    .line 38
    iget-object v0, p0, Landroidx/room/n1;->j:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Lq5/g;

    .line 41
    .line 42
    iget-object v1, p0, Landroidx/room/n1;->k:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Lr5/s;

    .line 45
    .line 46
    const/4 v2, 0x7

    .line 47
    invoke-direct {p1, v0, v1, p2, v2}, Landroidx/room/n1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt4/c;I)V

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_2
    new-instance v0, Landroidx/room/n1;

    .line 52
    .line 53
    iget-object v1, p0, Landroidx/room/n1;->k:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Lr5/f;

    .line 56
    .line 57
    const/4 v2, 0x6

    .line 58
    invoke-direct {v0, v1, p2, v2}, Landroidx/room/n1;-><init>(Ljava/lang/Object;Lt4/c;I)V

    .line 59
    .line 60
    .line 61
    iput-object p1, v0, Landroidx/room/n1;->j:Ljava/lang/Object;

    .line 62
    .line 63
    return-object v0

    .line 64
    :pswitch_3
    new-instance v0, Landroidx/room/n1;

    .line 65
    .line 66
    iget-object v1, p0, Landroidx/room/n1;->k:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v1, Lr5/e;

    .line 69
    .line 70
    const/4 v2, 0x5

    .line 71
    invoke-direct {v0, v1, p2, v2}, Landroidx/room/n1;-><init>(Ljava/lang/Object;Lt4/c;I)V

    .line 72
    .line 73
    .line 74
    iput-object p1, v0, Landroidx/room/n1;->j:Ljava/lang/Object;

    .line 75
    .line 76
    return-object v0

    .line 77
    :pswitch_4
    new-instance v0, Landroidx/room/n1;

    .line 78
    .line 79
    iget-object v1, p0, Landroidx/room/n1;->k:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v1, Lr2/c;

    .line 82
    .line 83
    const/4 v2, 0x4

    .line 84
    invoke-direct {v0, v1, p2, v2}, Landroidx/room/n1;-><init>(Ljava/lang/Object;Lt4/c;I)V

    .line 85
    .line 86
    .line 87
    iput-object p1, v0, Landroidx/room/n1;->j:Ljava/lang/Object;

    .line 88
    .line 89
    return-object v0

    .line 90
    :pswitch_5
    new-instance p1, Landroidx/room/n1;

    .line 91
    .line 92
    iget-object v0, p0, Landroidx/room/n1;->j:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v0, Ld5/p;

    .line 95
    .line 96
    iget-object v1, p0, Landroidx/room/n1;->k:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v1, Lkotlin/jvm/internal/o;

    .line 99
    .line 100
    const/4 v2, 0x3

    .line 101
    invoke-direct {p1, v0, v1, p2, v2}, Landroidx/room/n1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt4/c;I)V

    .line 102
    .line 103
    .line 104
    return-object p1

    .line 105
    :pswitch_6
    new-instance p1, Landroidx/room/n1;

    .line 106
    .line 107
    iget-object v0, p0, Landroidx/room/n1;->j:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v0, Ld5/p;

    .line 110
    .line 111
    iget-object v1, p0, Landroidx/room/n1;->k:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v1, Lr1/u;

    .line 114
    .line 115
    const/4 v2, 0x2

    .line 116
    invoke-direct {p1, v0, v1, p2, v2}, Landroidx/room/n1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt4/c;I)V

    .line 117
    .line 118
    .line 119
    return-object p1

    .line 120
    :pswitch_7
    new-instance p1, Landroidx/room/n1;

    .line 121
    .line 122
    iget-object v0, p0, Landroidx/room/n1;->j:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v0, Lq2/e;

    .line 125
    .line 126
    iget-object v1, p0, Landroidx/room/n1;->k:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v1, Lp5/s;

    .line 129
    .line 130
    const/4 v2, 0x1

    .line 131
    invoke-direct {p1, v0, v1, p2, v2}, Landroidx/room/n1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt4/c;I)V

    .line 132
    .line 133
    .line 134
    return-object p1

    .line 135
    :pswitch_8
    new-instance p1, Landroidx/room/n1;

    .line 136
    .line 137
    iget-object v0, p0, Landroidx/room/n1;->j:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v0, Landroidx/room/s1;

    .line 140
    .line 141
    iget-object v1, p0, Landroidx/room/n1;->k:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v1, Ld5/a;

    .line 144
    .line 145
    const/4 v2, 0x0

    .line 146
    invoke-direct {p1, v0, v1, p2, v2}, Landroidx/room/n1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt4/c;I)V

    .line 147
    .line 148
    .line 149
    return-object p1

    .line 150
    nop

    .line 151
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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Landroidx/room/n1;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ln5/v;

    .line 7
    .line 8
    check-cast p2, Lt4/c;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Landroidx/room/n1;->create(Ljava/lang/Object;Lt4/c;)Lt4/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Landroidx/room/n1;

    .line 15
    .line 16
    sget-object p2, Lp4/k;->a:Lp4/k;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroidx/room/n1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    check-cast p2, Lt4/c;

    .line 24
    .line 25
    invoke-virtual {p0, p1, p2}, Landroidx/room/n1;->create(Ljava/lang/Object;Lt4/c;)Lt4/c;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Landroidx/room/n1;

    .line 30
    .line 31
    sget-object p2, Lp4/k;->a:Lp4/k;

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Landroidx/room/n1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :pswitch_1
    check-cast p1, Ln5/v;

    .line 39
    .line 40
    check-cast p2, Lt4/c;

    .line 41
    .line 42
    invoke-virtual {p0, p1, p2}, Landroidx/room/n1;->create(Ljava/lang/Object;Lt4/c;)Lt4/c;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, Landroidx/room/n1;

    .line 47
    .line 48
    sget-object p2, Lp4/k;->a:Lp4/k;

    .line 49
    .line 50
    invoke-virtual {p1, p2}, Landroidx/room/n1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1

    .line 55
    :pswitch_2
    check-cast p1, Lq5/h;

    .line 56
    .line 57
    check-cast p2, Lt4/c;

    .line 58
    .line 59
    invoke-virtual {p0, p1, p2}, Landroidx/room/n1;->create(Ljava/lang/Object;Lt4/c;)Lt4/c;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Landroidx/room/n1;

    .line 64
    .line 65
    sget-object p2, Lp4/k;->a:Lp4/k;

    .line 66
    .line 67
    invoke-virtual {p1, p2}, Landroidx/room/n1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    return-object p1

    .line 72
    :pswitch_3
    check-cast p1, Lp5/s;

    .line 73
    .line 74
    check-cast p2, Lt4/c;

    .line 75
    .line 76
    invoke-virtual {p0, p1, p2}, Landroidx/room/n1;->create(Ljava/lang/Object;Lt4/c;)Lt4/c;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    check-cast p1, Landroidx/room/n1;

    .line 81
    .line 82
    sget-object p2, Lp4/k;->a:Lp4/k;

    .line 83
    .line 84
    invoke-virtual {p1, p2}, Landroidx/room/n1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    return-object p1

    .line 89
    :pswitch_4
    check-cast p1, Lp5/s;

    .line 90
    .line 91
    check-cast p2, Lt4/c;

    .line 92
    .line 93
    invoke-virtual {p0, p1, p2}, Landroidx/room/n1;->create(Ljava/lang/Object;Lt4/c;)Lt4/c;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    check-cast p1, Landroidx/room/n1;

    .line 98
    .line 99
    sget-object p2, Lp4/k;->a:Lp4/k;

    .line 100
    .line 101
    invoke-virtual {p1, p2}, Landroidx/room/n1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    return-object p1

    .line 106
    :pswitch_5
    check-cast p1, Ln5/v;

    .line 107
    .line 108
    check-cast p2, Lt4/c;

    .line 109
    .line 110
    invoke-virtual {p0, p1, p2}, Landroidx/room/n1;->create(Ljava/lang/Object;Lt4/c;)Lt4/c;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    check-cast p1, Landroidx/room/n1;

    .line 115
    .line 116
    sget-object p2, Lp4/k;->a:Lp4/k;

    .line 117
    .line 118
    invoke-virtual {p1, p2}, Landroidx/room/n1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    return-object p1

    .line 123
    :pswitch_6
    check-cast p1, Ln5/v;

    .line 124
    .line 125
    check-cast p2, Lt4/c;

    .line 126
    .line 127
    invoke-virtual {p0, p1, p2}, Landroidx/room/n1;->create(Ljava/lang/Object;Lt4/c;)Lt4/c;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    check-cast p1, Landroidx/room/n1;

    .line 132
    .line 133
    sget-object p2, Lp4/k;->a:Lp4/k;

    .line 134
    .line 135
    invoke-virtual {p1, p2}, Landroidx/room/n1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    return-object p1

    .line 140
    :pswitch_7
    check-cast p1, Ln5/v;

    .line 141
    .line 142
    check-cast p2, Lt4/c;

    .line 143
    .line 144
    invoke-virtual {p0, p1, p2}, Landroidx/room/n1;->create(Ljava/lang/Object;Lt4/c;)Lt4/c;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    check-cast p1, Landroidx/room/n1;

    .line 149
    .line 150
    sget-object p2, Lp4/k;->a:Lp4/k;

    .line 151
    .line 152
    invoke-virtual {p1, p2}, Landroidx/room/n1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    return-object p1

    .line 157
    :pswitch_8
    check-cast p1, Ln5/v;

    .line 158
    .line 159
    check-cast p2, Lt4/c;

    .line 160
    .line 161
    invoke-virtual {p0, p1, p2}, Landroidx/room/n1;->create(Ljava/lang/Object;Lt4/c;)Lt4/c;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    check-cast p1, Landroidx/room/n1;

    .line 166
    .line 167
    sget-object p2, Lp4/k;->a:Lp4/k;

    .line 168
    .line 169
    invoke-virtual {p1, p2}, Landroidx/room/n1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    return-object p1

    .line 174
    nop

    .line 175
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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Landroidx/room/n1;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/room/n1;->j:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ly2/j;

    .line 9
    .line 10
    sget-object v1, Lu4/a;->h:Lu4/a;

    .line 11
    .line 12
    iget v2, p0, Landroidx/room/n1;->i:I

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    if-ne v2, v3, :cond_0

    .line 18
    .line 19
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Landroidx/room/n1;->k:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, Lj3/j;

    .line 37
    .line 38
    iput v3, p0, Landroidx/room/n1;->i:I

    .line 39
    .line 40
    invoke-static {v0, p1, p0}, Ly2/j;->a(Ly2/j;Lj3/j;Lv4/c;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-ne p1, v1, :cond_2

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    :goto_0
    move-object v0, p1

    .line 48
    check-cast v0, Lj3/k;

    .line 49
    .line 50
    move-object v1, p1

    .line 51
    :goto_1
    return-object v1

    .line 52
    :pswitch_0
    sget-object v0, Lu4/a;->h:Lu4/a;

    .line 53
    .line 54
    iget v1, p0, Landroidx/room/n1;->i:I

    .line 55
    .line 56
    const/4 v2, 0x1

    .line 57
    if-eqz v1, :cond_4

    .line 58
    .line 59
    if-ne v1, v2, :cond_3

    .line 60
    .line 61
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 68
    .line 69
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p1

    .line 73
    :cond_4
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, Landroidx/room/n1;->j:Ljava/lang/Object;

    .line 77
    .line 78
    iget-object v1, p0, Landroidx/room/n1;->k:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v1, Lq5/h;

    .line 81
    .line 82
    iput v2, p0, Landroidx/room/n1;->i:I

    .line 83
    .line 84
    invoke-interface {v1, p1, p0}, Lq5/h;->c(Ljava/lang/Object;Lt4/c;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-ne p1, v0, :cond_5

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_5
    :goto_2
    sget-object v0, Lp4/k;->a:Lp4/k;

    .line 92
    .line 93
    :goto_3
    return-object v0

    .line 94
    :pswitch_1
    sget-object v0, Lu4/a;->h:Lu4/a;

    .line 95
    .line 96
    iget v1, p0, Landroidx/room/n1;->i:I

    .line 97
    .line 98
    const/4 v2, 0x1

    .line 99
    if-eqz v1, :cond_7

    .line 100
    .line 101
    if-ne v1, v2, :cond_6

    .line 102
    .line 103
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 108
    .line 109
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 110
    .line 111
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw p1

    .line 115
    :cond_7
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    iget-object p1, p0, Landroidx/room/n1;->j:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast p1, Lq5/g;

    .line 121
    .line 122
    iget-object v1, p0, Landroidx/room/n1;->k:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v1, Lr5/s;

    .line 125
    .line 126
    iput v2, p0, Landroidx/room/n1;->i:I

    .line 127
    .line 128
    invoke-interface {p1, v1, p0}, Lq5/g;->b(Lq5/h;Lt4/c;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    if-ne p1, v0, :cond_8

    .line 133
    .line 134
    goto :goto_5

    .line 135
    :cond_8
    :goto_4
    sget-object v0, Lp4/k;->a:Lp4/k;

    .line 136
    .line 137
    :goto_5
    return-object v0

    .line 138
    :pswitch_2
    sget-object v0, Lp4/k;->a:Lp4/k;

    .line 139
    .line 140
    sget-object v1, Lu4/a;->h:Lu4/a;

    .line 141
    .line 142
    iget v2, p0, Landroidx/room/n1;->i:I

    .line 143
    .line 144
    const/4 v3, 0x1

    .line 145
    if-eqz v2, :cond_a

    .line 146
    .line 147
    if-ne v2, v3, :cond_9

    .line 148
    .line 149
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    goto :goto_7

    .line 153
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 154
    .line 155
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 156
    .line 157
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    throw p1

    .line 161
    :cond_a
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    iget-object p1, p0, Landroidx/room/n1;->j:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast p1, Lq5/h;

    .line 167
    .line 168
    iget-object v2, p0, Landroidx/room/n1;->k:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v2, Lr5/f;

    .line 171
    .line 172
    iput v3, p0, Landroidx/room/n1;->i:I

    .line 173
    .line 174
    iget-object v2, v2, Lr5/f;->l:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v2, Lq5/g;

    .line 177
    .line 178
    invoke-interface {v2, p1, p0}, Lq5/g;->b(Lq5/h;Lt4/c;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    if-ne p1, v1, :cond_b

    .line 183
    .line 184
    goto :goto_6

    .line 185
    :cond_b
    move-object p1, v0

    .line 186
    :goto_6
    if-ne p1, v1, :cond_c

    .line 187
    .line 188
    move-object v0, v1

    .line 189
    :cond_c
    :goto_7
    return-object v0

    .line 190
    :pswitch_3
    sget-object v0, Lu4/a;->h:Lu4/a;

    .line 191
    .line 192
    iget v1, p0, Landroidx/room/n1;->i:I

    .line 193
    .line 194
    const/4 v2, 0x1

    .line 195
    if-eqz v1, :cond_e

    .line 196
    .line 197
    if-ne v1, v2, :cond_d

    .line 198
    .line 199
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    goto :goto_8

    .line 203
    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 204
    .line 205
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 206
    .line 207
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    throw p1

    .line 211
    :cond_e
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    iget-object p1, p0, Landroidx/room/n1;->j:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast p1, Lp5/s;

    .line 217
    .line 218
    iget-object v1, p0, Landroidx/room/n1;->k:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v1, Lr5/e;

    .line 221
    .line 222
    iput v2, p0, Landroidx/room/n1;->i:I

    .line 223
    .line 224
    invoke-virtual {v1, p1, p0}, Lr5/e;->c(Lp5/s;Lt4/c;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    if-ne p1, v0, :cond_f

    .line 229
    .line 230
    goto :goto_9

    .line 231
    :cond_f
    :goto_8
    sget-object v0, Lp4/k;->a:Lp4/k;

    .line 232
    .line 233
    :goto_9
    return-object v0

    .line 234
    :pswitch_4
    sget-object v0, Lu4/a;->h:Lu4/a;

    .line 235
    .line 236
    iget v1, p0, Landroidx/room/n1;->i:I

    .line 237
    .line 238
    const/4 v2, 0x1

    .line 239
    if-eqz v1, :cond_11

    .line 240
    .line 241
    if-ne v1, v2, :cond_10

    .line 242
    .line 243
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    goto/16 :goto_b

    .line 247
    .line 248
    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 249
    .line 250
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 251
    .line 252
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    throw p1

    .line 256
    :cond_11
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    iget-object p1, p0, Landroidx/room/n1;->j:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast p1, Lp5/s;

    .line 262
    .line 263
    new-instance v1, Lr2/b;

    .line 264
    .line 265
    iget-object v3, p0, Landroidx/room/n1;->k:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v3, Lr2/c;

    .line 268
    .line 269
    invoke-direct {v1, v3, p1}, Lr2/b;-><init>(Lr2/c;Lp5/s;)V

    .line 270
    .line 271
    .line 272
    iget-object v3, v3, Lr2/c;->a:Ls2/f;

    .line 273
    .line 274
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    iget-object v4, v3, Ls2/f;->c:Ljava/lang/Object;

    .line 278
    .line 279
    monitor-enter v4

    .line 280
    :try_start_0
    iget-object v5, v3, Ls2/f;->d:Ljava/util/LinkedHashSet;

    .line 281
    .line 282
    invoke-virtual {v5, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v5

    .line 286
    if-eqz v5, :cond_13

    .line 287
    .line 288
    iget-object v5, v3, Ls2/f;->d:Ljava/util/LinkedHashSet;

    .line 289
    .line 290
    invoke-virtual {v5}, Ljava/util/AbstractCollection;->size()I

    .line 291
    .line 292
    .line 293
    move-result v5

    .line 294
    if-ne v5, v2, :cond_12

    .line 295
    .line 296
    invoke-virtual {v3}, Ls2/f;->a()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v5

    .line 300
    iput-object v5, v3, Ls2/f;->e:Ljava/lang/Object;

    .line 301
    .line 302
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 303
    .line 304
    .line 305
    move-result-object v5

    .line 306
    sget-object v6, Ls2/g;->a:Ljava/lang/String;

    .line 307
    .line 308
    new-instance v7, Ljava/lang/StringBuilder;

    .line 309
    .line 310
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    move-result-object v8

    .line 317
    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v8

    .line 321
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    const-string v8, ": initial state = "

    .line 325
    .line 326
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    iget-object v8, v3, Ls2/f;->e:Ljava/lang/Object;

    .line 330
    .line 331
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v7

    .line 338
    invoke-virtual {v5, v6, v7}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v3}, Ls2/f;->c()V

    .line 342
    .line 343
    .line 344
    goto :goto_a

    .line 345
    :catchall_0
    move-exception p1

    .line 346
    goto :goto_d

    .line 347
    :cond_12
    :goto_a
    iget-object v3, v3, Ls2/f;->e:Ljava/lang/Object;

    .line 348
    .line 349
    invoke-virtual {v1, v3}, Lr2/b;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 350
    .line 351
    .line 352
    :cond_13
    monitor-exit v4

    .line 353
    new-instance v3, Lr2/a;

    .line 354
    .line 355
    iget-object v4, p0, Landroidx/room/n1;->k:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v4, Lr2/c;

    .line 358
    .line 359
    const/4 v5, 0x0

    .line 360
    invoke-direct {v3, v5, v4, v1}, Lr2/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    iput v2, p0, Landroidx/room/n1;->i:I

    .line 364
    .line 365
    invoke-static {p1, v3, p0}, Lu2/f;->b(Lp5/s;Ld5/a;Lv4/c;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object p1

    .line 369
    if-ne p1, v0, :cond_14

    .line 370
    .line 371
    goto :goto_c

    .line 372
    :cond_14
    :goto_b
    sget-object v0, Lp4/k;->a:Lp4/k;

    .line 373
    .line 374
    :goto_c
    return-object v0

    .line 375
    :goto_d
    monitor-exit v4

    .line 376
    throw p1

    .line 377
    :pswitch_5
    sget-object v0, Lu4/a;->h:Lu4/a;

    .line 378
    .line 379
    iget v1, p0, Landroidx/room/n1;->i:I

    .line 380
    .line 381
    const/4 v2, 0x1

    .line 382
    if-eqz v1, :cond_16

    .line 383
    .line 384
    if-ne v1, v2, :cond_15

    .line 385
    .line 386
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    goto :goto_e

    .line 390
    :cond_15
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 391
    .line 392
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 393
    .line 394
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    throw p1

    .line 398
    :cond_16
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 399
    .line 400
    .line 401
    iget-object p1, p0, Landroidx/room/n1;->j:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast p1, Ld5/p;

    .line 404
    .line 405
    iget-object v1, p0, Landroidx/room/n1;->k:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast v1, Lkotlin/jvm/internal/o;

    .line 408
    .line 409
    iget-object v1, v1, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 410
    .line 411
    iput v2, p0, Landroidx/room/n1;->i:I

    .line 412
    .line 413
    invoke-interface {p1, v1, p0}, Ld5/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object p1

    .line 417
    if-ne p1, v0, :cond_17

    .line 418
    .line 419
    move-object p1, v0

    .line 420
    :cond_17
    :goto_e
    return-object p1

    .line 421
    :pswitch_6
    sget-object v0, Lu4/a;->h:Lu4/a;

    .line 422
    .line 423
    iget v1, p0, Landroidx/room/n1;->i:I

    .line 424
    .line 425
    const/4 v2, 0x1

    .line 426
    if-eqz v1, :cond_19

    .line 427
    .line 428
    if-ne v1, v2, :cond_18

    .line 429
    .line 430
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 431
    .line 432
    .line 433
    goto :goto_f

    .line 434
    :cond_18
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 435
    .line 436
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 437
    .line 438
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    throw p1

    .line 442
    :cond_19
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    iget-object p1, p0, Landroidx/room/n1;->j:Ljava/lang/Object;

    .line 446
    .line 447
    check-cast p1, Ld5/p;

    .line 448
    .line 449
    iget-object v1, p0, Landroidx/room/n1;->k:Ljava/lang/Object;

    .line 450
    .line 451
    check-cast v1, Lr1/u;

    .line 452
    .line 453
    iput v2, p0, Landroidx/room/n1;->i:I

    .line 454
    .line 455
    invoke-interface {p1, v1, p0}, Ld5/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object p1

    .line 459
    if-ne p1, v0, :cond_1a

    .line 460
    .line 461
    move-object p1, v0

    .line 462
    :cond_1a
    :goto_f
    return-object p1

    .line 463
    :pswitch_7
    sget-object v0, Lu4/a;->h:Lu4/a;

    .line 464
    .line 465
    iget v1, p0, Landroidx/room/n1;->i:I

    .line 466
    .line 467
    const/4 v2, 0x1

    .line 468
    if-eqz v1, :cond_1c

    .line 469
    .line 470
    if-ne v1, v2, :cond_1b

    .line 471
    .line 472
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    goto :goto_10

    .line 476
    :cond_1b
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 477
    .line 478
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 479
    .line 480
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    throw p1

    .line 484
    :cond_1c
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 485
    .line 486
    .line 487
    iput v2, p0, Landroidx/room/n1;->i:I

    .line 488
    .line 489
    const-wide/16 v1, 0x3e8

    .line 490
    .line 491
    invoke-static {v1, v2, p0}, Ln5/x;->f(JLt4/c;)Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object p1

    .line 495
    if-ne p1, v0, :cond_1d

    .line 496
    .line 497
    goto :goto_11

    .line 498
    :cond_1d
    :goto_10
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 499
    .line 500
    .line 501
    move-result-object p1

    .line 502
    sget-object v0, Lq2/l;->a:Ljava/lang/String;

    .line 503
    .line 504
    const-string v1, "NetworkRequestConstraintController didn\'t receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after 1000 ms"

    .line 505
    .line 506
    invoke-virtual {p1, v0, v1}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 507
    .line 508
    .line 509
    iget-object p1, p0, Landroidx/room/n1;->k:Ljava/lang/Object;

    .line 510
    .line 511
    check-cast p1, Lp5/s;

    .line 512
    .line 513
    new-instance v0, Lq2/b;

    .line 514
    .line 515
    const/4 v1, 0x7

    .line 516
    invoke-direct {v0, v1}, Lq2/b;-><init>(I)V

    .line 517
    .line 518
    .line 519
    check-cast p1, Lp5/r;

    .line 520
    .line 521
    invoke-virtual {p1, v0}, Lp5/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    sget-object v0, Lp4/k;->a:Lp4/k;

    .line 525
    .line 526
    :goto_11
    return-object v0

    .line 527
    :pswitch_8
    iget-object v0, p0, Landroidx/room/n1;->k:Ljava/lang/Object;

    .line 528
    .line 529
    check-cast v0, Ld5/a;

    .line 530
    .line 531
    sget-object v1, Lu4/a;->h:Lu4/a;

    .line 532
    .line 533
    iget v2, p0, Landroidx/room/n1;->i:I

    .line 534
    .line 535
    const/4 v3, 0x1

    .line 536
    if-eqz v2, :cond_1f

    .line 537
    .line 538
    if-ne v2, v3, :cond_1e

    .line 539
    .line 540
    :try_start_1
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 541
    .line 542
    .line 543
    goto :goto_12

    .line 544
    :catchall_1
    move-exception p1

    .line 545
    goto :goto_14

    .line 546
    :cond_1e
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 547
    .line 548
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 549
    .line 550
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 551
    .line 552
    .line 553
    throw p1

    .line 554
    :cond_1f
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 555
    .line 556
    .line 557
    :try_start_2
    iget-object p1, p0, Landroidx/room/n1;->j:Ljava/lang/Object;

    .line 558
    .line 559
    check-cast p1, Landroidx/room/s1;

    .line 560
    .line 561
    iput v3, p0, Landroidx/room/n1;->i:I

    .line 562
    .line 563
    invoke-static {p1, p0}, Landroidx/room/s1;->b(Landroidx/room/s1;Lv4/c;)Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object p1

    .line 567
    if-ne p1, v1, :cond_20

    .line 568
    .line 569
    goto :goto_13

    .line 570
    :cond_20
    :goto_12
    check-cast p1, Ljava/util/Set;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 571
    .line 572
    invoke-interface {v0}, Ld5/a;->invoke()Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    sget-object v1, Lp4/k;->a:Lp4/k;

    .line 576
    .line 577
    :goto_13
    return-object v1

    .line 578
    :goto_14
    invoke-interface {v0}, Ld5/a;->invoke()Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    throw p1

    .line 582
    nop

    .line 583
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
