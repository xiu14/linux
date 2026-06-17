.class public Landroidx/preference/SeekBarPreference;
.super Landroidx/preference/Preference;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public U:I

.field public V:I

.field public W:I

.field public X:I

.field public Y:Z

.field public Z:Landroid/widget/SeekBar;

.field public a0:Landroid/widget/TextView;

.field public final b0:Z

.field public final c0:Z

.field public final d0:Z

.field public final e0:Landroidx/preference/l0;

.field public final f0:Landroidx/preference/m0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 1
    sget v0, Landroidx/preference/e0;->seekBarPreferenceStyle:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {p0, p1, p2, v0, v1}, Landroidx/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 5
    .line 6
    .line 7
    new-instance v2, Landroidx/preference/l0;

    .line 8
    .line 9
    invoke-direct {v2, p0}, Landroidx/preference/l0;-><init>(Landroidx/preference/SeekBarPreference;)V

    .line 10
    .line 11
    .line 12
    iput-object v2, p0, Landroidx/preference/SeekBarPreference;->e0:Landroidx/preference/l0;

    .line 13
    .line 14
    new-instance v2, Landroidx/preference/m0;

    .line 15
    .line 16
    invoke-direct {v2, p0}, Landroidx/preference/m0;-><init>(Landroidx/preference/SeekBarPreference;)V

    .line 17
    .line 18
    .line 19
    iput-object v2, p0, Landroidx/preference/SeekBarPreference;->f0:Landroidx/preference/m0;

    .line 20
    .line 21
    sget-object v2, Landroidx/preference/k0;->SeekBarPreference:[I

    .line 22
    .line 23
    invoke-virtual {p1, p2, v2, v0, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    sget p2, Landroidx/preference/k0;->SeekBarPreference_min:I

    .line 28
    .line 29
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    iput p2, p0, Landroidx/preference/SeekBarPreference;->V:I

    .line 34
    .line 35
    sget p2, Landroidx/preference/k0;->SeekBarPreference_android_max:I

    .line 36
    .line 37
    const/16 v0, 0x64

    .line 38
    .line 39
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    iget v0, p0, Landroidx/preference/SeekBarPreference;->V:I

    .line 44
    .line 45
    if-ge p2, v0, :cond_0

    .line 46
    .line 47
    move p2, v0

    .line 48
    :cond_0
    iget v0, p0, Landroidx/preference/SeekBarPreference;->W:I

    .line 49
    .line 50
    if-eq p2, v0, :cond_1

    .line 51
    .line 52
    iput p2, p0, Landroidx/preference/SeekBarPreference;->W:I

    .line 53
    .line 54
    invoke-virtual {p0}, Landroidx/preference/Preference;->k()V

    .line 55
    .line 56
    .line 57
    :cond_1
    sget p2, Landroidx/preference/k0;->SeekBarPreference_seekBarIncrement:I

    .line 58
    .line 59
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    iget v0, p0, Landroidx/preference/SeekBarPreference;->X:I

    .line 64
    .line 65
    if-eq p2, v0, :cond_2

    .line 66
    .line 67
    iget v0, p0, Landroidx/preference/SeekBarPreference;->W:I

    .line 68
    .line 69
    iget v2, p0, Landroidx/preference/SeekBarPreference;->V:I

    .line 70
    .line 71
    sub-int/2addr v0, v2

    .line 72
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    iput p2, p0, Landroidx/preference/SeekBarPreference;->X:I

    .line 81
    .line 82
    invoke-virtual {p0}, Landroidx/preference/Preference;->k()V

    .line 83
    .line 84
    .line 85
    :cond_2
    sget p2, Landroidx/preference/k0;->SeekBarPreference_adjustable:I

    .line 86
    .line 87
    const/4 v0, 0x1

    .line 88
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    iput-boolean p2, p0, Landroidx/preference/SeekBarPreference;->b0:Z

    .line 93
    .line 94
    sget p2, Landroidx/preference/k0;->SeekBarPreference_showSeekBarValue:I

    .line 95
    .line 96
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    iput-boolean p2, p0, Landroidx/preference/SeekBarPreference;->c0:Z

    .line 101
    .line 102
    sget p2, Landroidx/preference/k0;->SeekBarPreference_updatesContinuously:I

    .line 103
    .line 104
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    iput-boolean p2, p0, Landroidx/preference/SeekBarPreference;->d0:Z

    .line 109
    .line 110
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 111
    .line 112
    .line 113
    return-void
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


# virtual methods
.method public final C(IZ)V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/preference/SeekBarPreference;->V:I

    .line 2
    .line 3
    if-ge p1, v0, :cond_0

    .line 4
    .line 5
    move p1, v0

    .line 6
    :cond_0
    iget v0, p0, Landroidx/preference/SeekBarPreference;->W:I

    .line 7
    .line 8
    if-le p1, v0, :cond_1

    .line 9
    .line 10
    move p1, v0

    .line 11
    :cond_1
    iget v0, p0, Landroidx/preference/SeekBarPreference;->U:I

    .line 12
    .line 13
    if-eq p1, v0, :cond_7

    .line 14
    .line 15
    iput p1, p0, Landroidx/preference/SeekBarPreference;->U:I

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/preference/SeekBarPreference;->a0:Landroid/widget/TextView;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    :cond_2
    invoke-virtual {p0}, Landroidx/preference/Preference;->A()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_3
    not-int v0, p1

    .line 36
    invoke-virtual {p0}, Landroidx/preference/Preference;->A()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    iget-object v2, p0, Landroidx/preference/Preference;->s:Ljava/lang/String;

    .line 41
    .line 42
    if-nez v1, :cond_4

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_4
    iget-object v1, p0, Landroidx/preference/Preference;->i:Landroidx/preference/a0;

    .line 46
    .line 47
    invoke-virtual {v1}, Landroidx/preference/a0;->d()Landroid/content/SharedPreferences;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    :goto_0
    if-ne p1, v0, :cond_5

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_5
    iget-object v0, p0, Landroidx/preference/Preference;->i:Landroidx/preference/a0;

    .line 59
    .line 60
    invoke-virtual {v0}, Landroidx/preference/a0;->b()Landroid/content/SharedPreferences$Editor;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Landroidx/preference/Preference;->i:Landroidx/preference/a0;

    .line 68
    .line 69
    iget-boolean p1, p1, Landroidx/preference/a0;->e:Z

    .line 70
    .line 71
    if-nez p1, :cond_6

    .line 72
    .line 73
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 74
    .line 75
    .line 76
    :cond_6
    :goto_1
    if-eqz p2, :cond_7

    .line 77
    .line 78
    invoke-virtual {p0}, Landroidx/preference/Preference;->k()V

    .line 79
    .line 80
    .line 81
    :cond_7
    return-void
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
.end method

.method public final D(Landroid/widget/SeekBar;)V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/preference/SeekBarPreference;->V:I

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/widget/ProgressBar;->getProgress()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/2addr v1, v0

    .line 8
    iget v0, p0, Landroidx/preference/SeekBarPreference;->U:I

    .line 9
    .line 10
    if-eq v1, v0, :cond_1

    .line 11
    .line 12
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0, v0}, Landroidx/preference/Preference;->a(Ljava/io/Serializable;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-virtual {p0, v1, p1}, Landroidx/preference/SeekBarPreference;->C(IZ)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    iget v0, p0, Landroidx/preference/SeekBarPreference;->U:I

    .line 28
    .line 29
    iget v1, p0, Landroidx/preference/SeekBarPreference;->V:I

    .line 30
    .line 31
    sub-int/2addr v0, v1

    .line 32
    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 33
    .line 34
    .line 35
    iget p1, p0, Landroidx/preference/SeekBarPreference;->U:I

    .line 36
    .line 37
    iget-object v0, p0, Landroidx/preference/SeekBarPreference;->a0:Landroid/widget/TextView;

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 46
    .line 47
    .line 48
    :cond_1
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

.method public final o(Landroidx/preference/d0;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/preference/Preference;->o(Landroidx/preference/d0;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Landroidx/recyclerview/widget/i2;->itemView:Landroid/view/View;

    .line 5
    .line 6
    iget-object v1, p0, Landroidx/preference/SeekBarPreference;->f0:Landroidx/preference/m0;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 9
    .line 10
    .line 11
    sget v0, Landroidx/preference/g0;->seekbar:I

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroidx/preference/d0;->a(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroid/widget/SeekBar;

    .line 18
    .line 19
    iput-object v0, p0, Landroidx/preference/SeekBarPreference;->Z:Landroid/widget/SeekBar;

    .line 20
    .line 21
    sget v0, Landroidx/preference/g0;->seekbar_value:I

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroidx/preference/d0;->a(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Landroid/widget/TextView;

    .line 28
    .line 29
    iput-object p1, p0, Landroidx/preference/SeekBarPreference;->a0:Landroid/widget/TextView;

    .line 30
    .line 31
    iget-boolean v0, p0, Landroidx/preference/SeekBarPreference;->c0:Z

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/16 v0, 0x8

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    iput-object p1, p0, Landroidx/preference/SeekBarPreference;->a0:Landroid/widget/TextView;

    .line 47
    .line 48
    :goto_0
    iget-object p1, p0, Landroidx/preference/SeekBarPreference;->Z:Landroid/widget/SeekBar;

    .line 49
    .line 50
    if-nez p1, :cond_1

    .line 51
    .line 52
    const-string p1, "SeekBarPreference"

    .line 53
    .line 54
    const-string v0, "SeekBar view is null in onBindViewHolder."

    .line 55
    .line 56
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_1
    iget-object v0, p0, Landroidx/preference/SeekBarPreference;->e0:Landroidx/preference/l0;

    .line 61
    .line 62
    invoke-virtual {p1, v0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, Landroidx/preference/SeekBarPreference;->Z:Landroid/widget/SeekBar;

    .line 66
    .line 67
    iget v0, p0, Landroidx/preference/SeekBarPreference;->W:I

    .line 68
    .line 69
    iget v1, p0, Landroidx/preference/SeekBarPreference;->V:I

    .line 70
    .line 71
    sub-int/2addr v0, v1

    .line 72
    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 73
    .line 74
    .line 75
    iget p1, p0, Landroidx/preference/SeekBarPreference;->X:I

    .line 76
    .line 77
    if-eqz p1, :cond_2

    .line 78
    .line 79
    iget-object v0, p0, Landroidx/preference/SeekBarPreference;->Z:Landroid/widget/SeekBar;

    .line 80
    .line 81
    invoke-virtual {v0, p1}, Landroid/widget/AbsSeekBar;->setKeyProgressIncrement(I)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    iget-object p1, p0, Landroidx/preference/SeekBarPreference;->Z:Landroid/widget/SeekBar;

    .line 86
    .line 87
    invoke-virtual {p1}, Landroid/widget/AbsSeekBar;->getKeyProgressIncrement()I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    iput p1, p0, Landroidx/preference/SeekBarPreference;->X:I

    .line 92
    .line 93
    :goto_1
    iget-object p1, p0, Landroidx/preference/SeekBarPreference;->Z:Landroid/widget/SeekBar;

    .line 94
    .line 95
    iget v0, p0, Landroidx/preference/SeekBarPreference;->U:I

    .line 96
    .line 97
    iget v1, p0, Landroidx/preference/SeekBarPreference;->V:I

    .line 98
    .line 99
    sub-int/2addr v0, v1

    .line 100
    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 101
    .line 102
    .line 103
    iget p1, p0, Landroidx/preference/SeekBarPreference;->U:I

    .line 104
    .line 105
    iget-object v0, p0, Landroidx/preference/SeekBarPreference;->a0:Landroid/widget/TextView;

    .line 106
    .line 107
    if-eqz v0, :cond_3

    .line 108
    .line 109
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 114
    .line 115
    .line 116
    :cond_3
    iget-object p1, p0, Landroidx/preference/SeekBarPreference;->Z:Landroid/widget/SeekBar;

    .line 117
    .line 118
    invoke-virtual {p0}, Landroidx/preference/Preference;->j()Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 123
    .line 124
    .line 125
    return-void
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

.method public final r(Landroid/content/res/TypedArray;I)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
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

.method public final s(Landroid/os/Parcelable;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Landroidx/preference/n0;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-super {p0, p1}, Landroidx/preference/Preference;->s(Landroid/os/Parcelable;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    check-cast p1, Landroidx/preference/n0;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-super {p0, v0}, Landroidx/preference/Preference;->s(Landroid/os/Parcelable;)V

    .line 24
    .line 25
    .line 26
    iget v0, p1, Landroidx/preference/n0;->h:I

    .line 27
    .line 28
    iput v0, p0, Landroidx/preference/SeekBarPreference;->U:I

    .line 29
    .line 30
    iget v0, p1, Landroidx/preference/n0;->i:I

    .line 31
    .line 32
    iput v0, p0, Landroidx/preference/SeekBarPreference;->V:I

    .line 33
    .line 34
    iget p1, p1, Landroidx/preference/n0;->j:I

    .line 35
    .line 36
    iput p1, p0, Landroidx/preference/SeekBarPreference;->W:I

    .line 37
    .line 38
    invoke-virtual {p0}, Landroidx/preference/Preference;->k()V

    .line 39
    .line 40
    .line 41
    return-void
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
.end method

.method public final t()Landroid/os/Parcelable;
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/preference/Preference;->t()Landroid/os/Parcelable;

    .line 2
    .line 3
    .line 4
    sget-object v0, Landroid/view/AbsSavedState;->EMPTY_STATE:Landroid/view/AbsSavedState;

    .line 5
    .line 6
    iget-boolean v1, p0, Landroidx/preference/Preference;->y:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    new-instance v0, Landroidx/preference/n0;

    .line 12
    .line 13
    invoke-direct {v0}, Landroidx/preference/n0;-><init>()V

    .line 14
    .line 15
    .line 16
    iget v1, p0, Landroidx/preference/SeekBarPreference;->U:I

    .line 17
    .line 18
    iput v1, v0, Landroidx/preference/n0;->h:I

    .line 19
    .line 20
    iget v1, p0, Landroidx/preference/SeekBarPreference;->V:I

    .line 21
    .line 22
    iput v1, v0, Landroidx/preference/n0;->i:I

    .line 23
    .line 24
    iget v1, p0, Landroidx/preference/SeekBarPreference;->W:I

    .line 25
    .line 26
    iput v1, v0, Landroidx/preference/n0;->j:I

    .line 27
    .line 28
    return-object v0
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final u(Ljava/lang/Object;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    :cond_0
    check-cast p1, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-virtual {p0}, Landroidx/preference/Preference;->A()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iget-object v0, p0, Landroidx/preference/Preference;->i:Landroidx/preference/a0;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroidx/preference/a0;->d()Landroid/content/SharedPreferences;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v1, p0, Landroidx/preference/Preference;->s:Ljava/lang/String;

    .line 28
    .line 29
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    :goto_0
    const/4 v0, 0x1

    .line 34
    invoke-virtual {p0, p1, v0}, Landroidx/preference/SeekBarPreference;->C(IZ)V

    .line 35
    .line 36
    .line 37
    return-void
.end method
