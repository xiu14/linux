.class public Landroidx/appcompat/widget/ActionBarContextView;
.super Landroid/view/ViewGroup;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final A:I

.field public final h:Landroidx/appcompat/widget/a;

.field public final i:Landroid/content/Context;

.field public j:Landroidx/appcompat/widget/ActionMenuView;

.field public k:Landroidx/appcompat/widget/p;

.field public l:I

.field public m:Lm0/e1;

.field public n:Z

.field public o:Z

.field public p:Ljava/lang/CharSequence;

.field public q:Ljava/lang/CharSequence;

.field public r:Landroid/view/View;

.field public s:Landroid/view/View;

.field public t:Landroid/view/View;

.field public u:Landroid/widget/LinearLayout;

.field public v:Landroid/widget/TextView;

.field public w:Landroid/widget/TextView;

.field public final x:I

.field public final y:I

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    .line 1
    sget v0, Lf/a;->actionModeStyle:I

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, v0}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroidx/appcompat/widget/a;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Landroidx/appcompat/widget/a;-><init>(Landroidx/appcompat/widget/ActionBarContextView;)V

    .line 9
    .line 10
    .line 11
    iput-object v1, p0, Landroidx/appcompat/widget/ActionBarContextView;->h:Landroidx/appcompat/widget/a;

    .line 12
    .line 13
    new-instance v1, Landroid/util/TypedValue;

    .line 14
    .line 15
    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    sget v3, Lf/a;->actionBarPopupTheme:I

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    invoke-virtual {v2, v3, v1, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    iget v2, v1, Landroid/util/TypedValue;->resourceId:I

    .line 32
    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    new-instance v2, Landroid/view/ContextThemeWrapper;

    .line 36
    .line 37
    iget v1, v1, Landroid/util/TypedValue;->resourceId:I

    .line 38
    .line 39
    invoke-direct {v2, p1, v1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 40
    .line 41
    .line 42
    iput-object v2, p0, Landroidx/appcompat/widget/ActionBarContextView;->i:Landroid/content/Context;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    iput-object p1, p0, Landroidx/appcompat/widget/ActionBarContextView;->i:Landroid/content/Context;

    .line 46
    .line 47
    :goto_0
    sget-object v1, Lf/j;->ActionMode:[I

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-virtual {p1, p2, v1, v0, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    sget v0, Lf/j;->ActionMode_background:I

    .line 55
    .line 56
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_1

    .line 67
    .line 68
    invoke-static {p1, v1}, La/a;->D(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    goto :goto_1

    .line 73
    :cond_1
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    :goto_1
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 78
    .line 79
    .line 80
    sget p1, Lf/j;->ActionMode_titleTextStyle:I

    .line 81
    .line 82
    invoke-virtual {p2, p1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    iput p1, p0, Landroidx/appcompat/widget/ActionBarContextView;->x:I

    .line 87
    .line 88
    sget p1, Lf/j;->ActionMode_subtitleTextStyle:I

    .line 89
    .line 90
    invoke-virtual {p2, p1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    iput p1, p0, Landroidx/appcompat/widget/ActionBarContextView;->y:I

    .line 95
    .line 96
    sget p1, Lf/j;->ActionMode_height:I

    .line 97
    .line 98
    invoke-virtual {p2, p1, v2}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    iput p1, p0, Landroidx/appcompat/widget/ActionBarContextView;->l:I

    .line 103
    .line 104
    sget p1, Lf/j;->ActionMode_closeItemLayout:I

    .line 105
    .line 106
    sget v0, Lf/g;->abc_action_mode_close_item_material:I

    .line 107
    .line 108
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    iput p1, p0, Landroidx/appcompat/widget/ActionBarContextView;->A:I

    .line 113
    .line 114
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 115
    .line 116
    .line 117
    return-void
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

.method public static synthetic a(Landroidx/appcompat/widget/ActionBarContextView;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-super {p0, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 3
    .line 4
    .line 5
    return-void
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

.method public static synthetic b(Landroidx/appcompat/widget/ActionBarContextView;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V

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

.method public static f(Landroid/view/View;II)I
    .locals 1

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p0, v0, p2}, Landroid/view/View;->measure(II)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    sub-int/2addr p1, p0

    .line 15
    const/4 p0, 0x0

    .line 16
    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
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

.method public static g(Landroid/view/View;IIIZ)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int/2addr p3, v1

    .line 10
    div-int/lit8 p3, p3, 0x2

    .line 11
    .line 12
    add-int/2addr p3, p2

    .line 13
    if-eqz p4, :cond_0

    .line 14
    .line 15
    sub-int p2, p1, v0

    .line 16
    .line 17
    add-int/2addr v1, p3

    .line 18
    invoke-virtual {p0, p2, p3, p1, v1}, Landroid/view/View;->layout(IIII)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    add-int p2, p1, v0

    .line 23
    .line 24
    add-int/2addr v1, p3

    .line 25
    invoke-virtual {p0, p1, p3, p2, v1}, Landroid/view/View;->layout(IIII)V

    .line 26
    .line 27
    .line 28
    :goto_0
    if-eqz p4, :cond_1

    .line 29
    .line 30
    neg-int p0, v0

    .line 31
    return p0

    .line 32
    :cond_1
    return v0
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


# virtual methods
.method public final c(Lk/b;)V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->r:Landroid/view/View;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget v2, p0, Landroidx/appcompat/widget/ActionBarContextView;->A:I

    .line 15
    .line 16
    invoke-virtual {v0, v2, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->r:Landroid/view/View;

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->r:Landroid/view/View;

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->r:Landroid/view/View;

    .line 38
    .line 39
    sget v2, Lf/f;->action_mode_close_button:I

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->s:Landroid/view/View;

    .line 46
    .line 47
    new-instance v2, Landroidx/appcompat/widget/h3;

    .line 48
    .line 49
    const/4 v3, 0x1

    .line 50
    invoke-direct {v2, v3, p1}, Landroidx/appcompat/widget/h3;-><init>(ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Lk/b;->e()Ll/m;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->k:Landroidx/appcompat/widget/p;

    .line 61
    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    invoke-virtual {v0}, Landroidx/appcompat/widget/p;->b()Z

    .line 65
    .line 66
    .line 67
    iget-object v0, v0, Landroidx/appcompat/widget/p;->B:Landroidx/appcompat/widget/h;

    .line 68
    .line 69
    if-eqz v0, :cond_2

    .line 70
    .line 71
    invoke-virtual {v0}, Ll/w;->b()Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-eqz v2, :cond_2

    .line 76
    .line 77
    iget-object v0, v0, Ll/w;->i:Ll/u;

    .line 78
    .line 79
    invoke-interface {v0}, Ll/c0;->dismiss()V

    .line 80
    .line 81
    .line 82
    :cond_2
    new-instance v0, Landroidx/appcompat/widget/p;

    .line 83
    .line 84
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-direct {v0, v2}, Landroidx/appcompat/widget/p;-><init>(Landroid/content/Context;)V

    .line 89
    .line 90
    .line 91
    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->k:Landroidx/appcompat/widget/p;

    .line 92
    .line 93
    const/4 v2, 0x1

    .line 94
    iput-boolean v2, v0, Landroidx/appcompat/widget/p;->t:Z

    .line 95
    .line 96
    iput-boolean v2, v0, Landroidx/appcompat/widget/p;->u:Z

    .line 97
    .line 98
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 99
    .line 100
    const/4 v3, -0x2

    .line 101
    const/4 v4, -0x1

    .line 102
    invoke-direct {v0, v3, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 103
    .line 104
    .line 105
    iget-object v3, p0, Landroidx/appcompat/widget/ActionBarContextView;->k:Landroidx/appcompat/widget/p;

    .line 106
    .line 107
    iget-object v4, p0, Landroidx/appcompat/widget/ActionBarContextView;->i:Landroid/content/Context;

    .line 108
    .line 109
    invoke-virtual {p1, v3, v4}, Ll/m;->b(Ll/y;Landroid/content/Context;)V

    .line 110
    .line 111
    .line 112
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarContextView;->k:Landroidx/appcompat/widget/p;

    .line 113
    .line 114
    iget-object v3, p1, Landroidx/appcompat/widget/p;->o:Ll/a0;

    .line 115
    .line 116
    if-nez v3, :cond_3

    .line 117
    .line 118
    iget-object v4, p1, Landroidx/appcompat/widget/p;->k:Landroid/view/LayoutInflater;

    .line 119
    .line 120
    iget v5, p1, Landroidx/appcompat/widget/p;->m:I

    .line 121
    .line 122
    invoke-virtual {v4, v5, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    check-cast v1, Ll/a0;

    .line 127
    .line 128
    iput-object v1, p1, Landroidx/appcompat/widget/p;->o:Ll/a0;

    .line 129
    .line 130
    iget-object v4, p1, Landroidx/appcompat/widget/p;->j:Ll/m;

    .line 131
    .line 132
    invoke-interface {v1, v4}, Ll/a0;->a(Ll/m;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1, v2}, Landroidx/appcompat/widget/p;->h(Z)V

    .line 136
    .line 137
    .line 138
    :cond_3
    iget-object v1, p1, Landroidx/appcompat/widget/p;->o:Ll/a0;

    .line 139
    .line 140
    if-eq v3, v1, :cond_4

    .line 141
    .line 142
    move-object v2, v1

    .line 143
    check-cast v2, Landroidx/appcompat/widget/ActionMenuView;

    .line 144
    .line 145
    invoke-virtual {v2, p1}, Landroidx/appcompat/widget/ActionMenuView;->setPresenter(Landroidx/appcompat/widget/p;)V

    .line 146
    .line 147
    .line 148
    :cond_4
    check-cast v1, Landroidx/appcompat/widget/ActionMenuView;

    .line 149
    .line 150
    iput-object v1, p0, Landroidx/appcompat/widget/ActionBarContextView;->j:Landroidx/appcompat/widget/ActionMenuView;

    .line 151
    .line 152
    const/4 p1, 0x0

    .line 153
    invoke-virtual {v1, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 154
    .line 155
    .line 156
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarContextView;->j:Landroidx/appcompat/widget/ActionMenuView;

    .line 157
    .line 158
    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 159
    .line 160
    .line 161
    return-void
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

.method public final d()V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->u:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget v1, Lf/g;->abc_action_bar_title_item:I

    .line 14
    .line 15
    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    add-int/lit8 v0, v0, -0x1

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Landroid/widget/LinearLayout;

    .line 29
    .line 30
    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->u:Landroid/widget/LinearLayout;

    .line 31
    .line 32
    sget v1, Lf/f;->action_bar_title:I

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Landroid/widget/TextView;

    .line 39
    .line 40
    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->v:Landroid/widget/TextView;

    .line 41
    .line 42
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->u:Landroid/widget/LinearLayout;

    .line 43
    .line 44
    sget v1, Lf/f;->action_bar_subtitle:I

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Landroid/widget/TextView;

    .line 51
    .line 52
    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->w:Landroid/widget/TextView;

    .line 53
    .line 54
    iget v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->x:I

    .line 55
    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarContextView;->v:Landroid/widget/TextView;

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v1, v2, v0}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 65
    .line 66
    .line 67
    :cond_0
    iget v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->y:I

    .line 68
    .line 69
    if-eqz v0, :cond_1

    .line 70
    .line 71
    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarContextView;->w:Landroid/widget/TextView;

    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v1, v2, v0}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 78
    .line 79
    .line 80
    :cond_1
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->v:Landroid/widget/TextView;

    .line 81
    .line 82
    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarContextView;->p:Ljava/lang/CharSequence;

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->w:Landroid/widget/TextView;

    .line 88
    .line 89
    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarContextView;->q:Ljava/lang/CharSequence;

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 92
    .line 93
    .line 94
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->p:Ljava/lang/CharSequence;

    .line 95
    .line 96
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarContextView;->q:Ljava/lang/CharSequence;

    .line 101
    .line 102
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    iget-object v2, p0, Landroidx/appcompat/widget/ActionBarContextView;->w:Landroid/widget/TextView;

    .line 107
    .line 108
    const/16 v3, 0x8

    .line 109
    .line 110
    const/4 v4, 0x0

    .line 111
    if-nez v1, :cond_2

    .line 112
    .line 113
    const/4 v5, 0x0

    .line 114
    goto :goto_0

    .line 115
    :cond_2
    const/16 v5, 0x8

    .line 116
    .line 117
    :goto_0
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 118
    .line 119
    .line 120
    iget-object v2, p0, Landroidx/appcompat/widget/ActionBarContextView;->u:Landroid/widget/LinearLayout;

    .line 121
    .line 122
    if-eqz v0, :cond_3

    .line 123
    .line 124
    if-nez v1, :cond_4

    .line 125
    .line 126
    :cond_3
    const/4 v3, 0x0

    .line 127
    :cond_4
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 128
    .line 129
    .line 130
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->u:Landroid/widget/LinearLayout;

    .line 131
    .line 132
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    if-nez v0, :cond_5

    .line 137
    .line 138
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->u:Landroid/widget/LinearLayout;

    .line 139
    .line 140
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 141
    .line 142
    .line 143
    :cond_5
    return-void
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

.method public final e()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->t:Landroid/view/View;

    .line 6
    .line 7
    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->j:Landroidx/appcompat/widget/ActionMenuView;

    .line 8
    .line 9
    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->k:Landroidx/appcompat/widget/p;

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarContextView;->s:Landroid/view/View;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    .line 17
    .line 18
    :cond_0
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
.end method

.method public final generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 3

    .line 1
    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, -0x2

    .line 5
    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 6
    .line 7
    .line 8
    return-object v0
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

.method public final generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 1
    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 8
    .line 9
    .line 10
    return-object v0
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

.method public getAnimatedVisibility()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->m:Lm0/e1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->h:Landroidx/appcompat/widget/a;

    .line 6
    .line 7
    iget v0, v0, Landroidx/appcompat/widget/a;->b:I

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0
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

.method public getContentHeight()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->l:I

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

.method public getSubtitle()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->q:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-object v0
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

.method public getTitle()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->p:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-object v0
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

.method public final h(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eq p1, v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->m:Lm0/e1;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lm0/e1;->b()V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    :cond_1
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

.method public final i(IJ)Lm0/e1;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->m:Lm0/e1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lm0/e1;->b()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->h:Landroidx/appcompat/widget/a;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez p1, :cond_2

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-static {p0}, Lm0/w0;->a(Landroid/view/View;)Lm0/e1;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const/high16 v2, 0x3f800000    # 1.0f

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Lm0/e1;->a(F)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p2, p3}, Lm0/e1;->c(J)V

    .line 32
    .line 33
    .line 34
    iget-object p2, v0, Landroidx/appcompat/widget/a;->c:Landroidx/appcompat/widget/ActionBarContextView;

    .line 35
    .line 36
    iput-object v1, p2, Landroidx/appcompat/widget/ActionBarContextView;->m:Lm0/e1;

    .line 37
    .line 38
    iput p1, v0, Landroidx/appcompat/widget/a;->b:I

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Lm0/e1;->d(Lm0/f1;)V

    .line 41
    .line 42
    .line 43
    return-object v1

    .line 44
    :cond_2
    invoke-static {p0}, Lm0/w0;->a(Landroid/view/View;)Lm0/e1;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2, v1}, Lm0/e1;->a(F)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, p2, p3}, Lm0/e1;->c(J)V

    .line 52
    .line 53
    .line 54
    iget-object p2, v0, Landroidx/appcompat/widget/a;->c:Landroidx/appcompat/widget/ActionBarContextView;

    .line 55
    .line 56
    iput-object v2, p2, Landroidx/appcompat/widget/ActionBarContextView;->m:Lm0/e1;

    .line 57
    .line 58
    iput p1, v0, Landroidx/appcompat/widget/a;->b:I

    .line 59
    .line 60
    invoke-virtual {v2, v0}, Lm0/e1;->d(Lm0/f1;)V

    .line 61
    .line 62
    .line 63
    return-object v2
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    sget-object v0, Lf/j;->ActionBar:[I

    .line 9
    .line 10
    sget v1, Lf/a;->actionBarStyle:I

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-virtual {p1, v2, v0, v1, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    sget v0, Lf/j;->ActionBar_height:I

    .line 19
    .line 20
    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setContentHeight(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarContextView;->k:Landroidx/appcompat/widget/p;

    .line 31
    .line 32
    if-eqz p1, :cond_7

    .line 33
    .line 34
    iget-object v0, p1, Landroidx/appcompat/widget/p;->i:Landroid/content/Context;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget v1, v0, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 45
    .line 46
    iget v2, v0, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 47
    .line 48
    iget v0, v0, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 49
    .line 50
    const/16 v3, 0x258

    .line 51
    .line 52
    if-gt v0, v3, :cond_6

    .line 53
    .line 54
    if-gt v1, v3, :cond_6

    .line 55
    .line 56
    const/16 v0, 0x2d0

    .line 57
    .line 58
    const/16 v3, 0x3c0

    .line 59
    .line 60
    if-le v1, v3, :cond_0

    .line 61
    .line 62
    if-gt v2, v0, :cond_6

    .line 63
    .line 64
    :cond_0
    if-le v1, v0, :cond_1

    .line 65
    .line 66
    if-le v2, v3, :cond_1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    const/16 v0, 0x1f4

    .line 70
    .line 71
    if-ge v1, v0, :cond_5

    .line 72
    .line 73
    const/16 v0, 0x1e0

    .line 74
    .line 75
    const/16 v3, 0x280

    .line 76
    .line 77
    if-le v1, v3, :cond_2

    .line 78
    .line 79
    if-gt v2, v0, :cond_5

    .line 80
    .line 81
    :cond_2
    if-le v1, v0, :cond_3

    .line 82
    .line 83
    if-le v2, v3, :cond_3

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_3
    const/16 v0, 0x168

    .line 87
    .line 88
    if-lt v1, v0, :cond_4

    .line 89
    .line 90
    const/4 v0, 0x3

    .line 91
    goto :goto_2

    .line 92
    :cond_4
    const/4 v0, 0x2

    .line 93
    goto :goto_2

    .line 94
    :cond_5
    :goto_0
    const/4 v0, 0x4

    .line 95
    goto :goto_2

    .line 96
    :cond_6
    :goto_1
    const/4 v0, 0x5

    .line 97
    :goto_2
    iput v0, p1, Landroidx/appcompat/widget/p;->x:I

    .line 98
    .line 99
    iget-object p1, p1, Landroidx/appcompat/widget/p;->j:Ll/m;

    .line 100
    .line 101
    if-eqz p1, :cond_7

    .line 102
    .line 103
    const/4 v0, 0x1

    .line 104
    invoke-virtual {p1, v0}, Ll/m;->p(Z)V

    .line 105
    .line 106
    .line 107
    :cond_7
    return-void
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

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->k:Landroidx/appcompat/widget/p;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/appcompat/widget/p;->b()Z

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->k:Landroidx/appcompat/widget/p;

    .line 12
    .line 13
    iget-object v0, v0, Landroidx/appcompat/widget/p;->B:Landroidx/appcompat/widget/h;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Ll/w;->b()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-object v0, v0, Ll/w;->i:Ll/u;

    .line 24
    .line 25
    invoke-interface {v0}, Ll/c0;->dismiss()V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final onHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/16 v2, 0x9

    .line 7
    .line 8
    if-ne v0, v2, :cond_0

    .line 9
    .line 10
    iput-boolean v1, p0, Landroidx/appcompat/widget/ActionBarContextView;->o:Z

    .line 11
    .line 12
    :cond_0
    iget-boolean v3, p0, Landroidx/appcompat/widget/ActionBarContextView;->o:Z

    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    if-nez v3, :cond_1

    .line 16
    .line 17
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onHoverEvent(Landroid/view/MotionEvent;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-ne v0, v2, :cond_1

    .line 22
    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    iput-boolean v4, p0, Landroidx/appcompat/widget/ActionBarContextView;->o:Z

    .line 26
    .line 27
    :cond_1
    const/16 p1, 0xa

    .line 28
    .line 29
    if-eq v0, p1, :cond_3

    .line 30
    .line 31
    const/4 p1, 0x3

    .line 32
    if-ne v0, p1, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    return v4

    .line 36
    :cond_3
    :goto_0
    iput-boolean v1, p0, Landroidx/appcompat/widget/ActionBarContextView;->o:Z

    .line 37
    .line 38
    return v4
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
.end method

.method public final onLayout(ZIIII)V
    .locals 5

    .line 1
    sget-boolean p1, Landroidx/appcompat/widget/s4;->a:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x1

    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    if-eqz p1, :cond_1

    .line 14
    .line 15
    sub-int v1, p4, p2

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    sub-int/2addr v1, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    sub-int/2addr p5, p3

    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    sub-int/2addr p5, p3

    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 38
    .line 39
    .line 40
    move-result p3

    .line 41
    sub-int/2addr p5, p3

    .line 42
    iget-object p3, p0, Landroidx/appcompat/widget/ActionBarContextView;->r:Landroid/view/View;

    .line 43
    .line 44
    const/16 v3, 0x8

    .line 45
    .line 46
    if-eqz p3, :cond_6

    .line 47
    .line 48
    invoke-virtual {p3}, Landroid/view/View;->getVisibility()I

    .line 49
    .line 50
    .line 51
    move-result p3

    .line 52
    if-eq p3, v3, :cond_6

    .line 53
    .line 54
    iget-object p3, p0, Landroidx/appcompat/widget/ActionBarContextView;->r:Landroid/view/View;

    .line 55
    .line 56
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 57
    .line 58
    .line 59
    move-result-object p3

    .line 60
    check-cast p3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 61
    .line 62
    if-eqz p1, :cond_2

    .line 63
    .line 64
    iget v4, p3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    iget v4, p3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 68
    .line 69
    :goto_2
    if-eqz p1, :cond_3

    .line 70
    .line 71
    iget p3, p3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_3
    iget p3, p3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 75
    .line 76
    :goto_3
    if-eqz p1, :cond_4

    .line 77
    .line 78
    sub-int/2addr v1, v4

    .line 79
    goto :goto_4

    .line 80
    :cond_4
    add-int/2addr v1, v4

    .line 81
    :goto_4
    iget-object v4, p0, Landroidx/appcompat/widget/ActionBarContextView;->r:Landroid/view/View;

    .line 82
    .line 83
    invoke-static {v4, v1, v2, p5, p1}, Landroidx/appcompat/widget/ActionBarContextView;->g(Landroid/view/View;IIIZ)I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    add-int/2addr v4, v1

    .line 88
    if-eqz p1, :cond_5

    .line 89
    .line 90
    sub-int/2addr v4, p3

    .line 91
    :goto_5
    move v1, v4

    .line 92
    goto :goto_6

    .line 93
    :cond_5
    add-int/2addr v4, p3

    .line 94
    goto :goto_5

    .line 95
    :cond_6
    :goto_6
    iget-object p3, p0, Landroidx/appcompat/widget/ActionBarContextView;->u:Landroid/widget/LinearLayout;

    .line 96
    .line 97
    if-eqz p3, :cond_7

    .line 98
    .line 99
    iget-object v4, p0, Landroidx/appcompat/widget/ActionBarContextView;->t:Landroid/view/View;

    .line 100
    .line 101
    if-nez v4, :cond_7

    .line 102
    .line 103
    invoke-virtual {p3}, Landroid/view/View;->getVisibility()I

    .line 104
    .line 105
    .line 106
    move-result p3

    .line 107
    if-eq p3, v3, :cond_7

    .line 108
    .line 109
    iget-object p3, p0, Landroidx/appcompat/widget/ActionBarContextView;->u:Landroid/widget/LinearLayout;

    .line 110
    .line 111
    invoke-static {p3, v1, v2, p5, p1}, Landroidx/appcompat/widget/ActionBarContextView;->g(Landroid/view/View;IIIZ)I

    .line 112
    .line 113
    .line 114
    move-result p3

    .line 115
    add-int/2addr v1, p3

    .line 116
    :cond_7
    iget-object p3, p0, Landroidx/appcompat/widget/ActionBarContextView;->t:Landroid/view/View;

    .line 117
    .line 118
    if-eqz p3, :cond_8

    .line 119
    .line 120
    invoke-static {p3, v1, v2, p5, p1}, Landroidx/appcompat/widget/ActionBarContextView;->g(Landroid/view/View;IIIZ)I

    .line 121
    .line 122
    .line 123
    :cond_8
    if-eqz p1, :cond_9

    .line 124
    .line 125
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    goto :goto_7

    .line 130
    :cond_9
    sub-int/2addr p4, p2

    .line 131
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 132
    .line 133
    .line 134
    move-result p2

    .line 135
    sub-int p2, p4, p2

    .line 136
    .line 137
    :goto_7
    iget-object p3, p0, Landroidx/appcompat/widget/ActionBarContextView;->j:Landroidx/appcompat/widget/ActionMenuView;

    .line 138
    .line 139
    if-eqz p3, :cond_a

    .line 140
    .line 141
    xor-int/2addr p1, v0

    .line 142
    invoke-static {p3, p2, v2, p5, p1}, Landroidx/appcompat/widget/ActionBarContextView;->g(Landroid/view/View;IIIZ)I

    .line 143
    .line 144
    .line 145
    :cond_a
    return-void
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

.method public final onMeasure(II)V
    .locals 10

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/high16 v1, 0x40000000    # 2.0f

    .line 6
    .line 7
    if-ne v0, v1, :cond_11

    .line 8
    .line 9
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_10

    .line 14
    .line 15
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iget v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->l:I

    .line 20
    .line 21
    if-lez v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    add-int/2addr v2, p2

    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    sub-int p2, p1, p2

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    sub-int/2addr p2, v3

    .line 48
    sub-int v3, v0, v2

    .line 49
    .line 50
    const/high16 v4, -0x80000000

    .line 51
    .line 52
    invoke-static {v3, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    iget-object v6, p0, Landroidx/appcompat/widget/ActionBarContextView;->r:Landroid/view/View;

    .line 57
    .line 58
    if-eqz v6, :cond_1

    .line 59
    .line 60
    invoke-static {v6, p2, v5}, Landroidx/appcompat/widget/ActionBarContextView;->f(Landroid/view/View;II)I

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    iget-object v6, p0, Landroidx/appcompat/widget/ActionBarContextView;->r:Landroid/view/View;

    .line 65
    .line 66
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    check-cast v6, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 71
    .line 72
    iget v7, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 73
    .line 74
    iget v6, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 75
    .line 76
    add-int/2addr v7, v6

    .line 77
    sub-int/2addr p2, v7

    .line 78
    :cond_1
    iget-object v6, p0, Landroidx/appcompat/widget/ActionBarContextView;->j:Landroidx/appcompat/widget/ActionMenuView;

    .line 79
    .line 80
    if-eqz v6, :cond_2

    .line 81
    .line 82
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    if-ne v6, p0, :cond_2

    .line 87
    .line 88
    iget-object v6, p0, Landroidx/appcompat/widget/ActionBarContextView;->j:Landroidx/appcompat/widget/ActionMenuView;

    .line 89
    .line 90
    invoke-static {v6, p2, v5}, Landroidx/appcompat/widget/ActionBarContextView;->f(Landroid/view/View;II)I

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    :cond_2
    iget-object v6, p0, Landroidx/appcompat/widget/ActionBarContextView;->u:Landroid/widget/LinearLayout;

    .line 95
    .line 96
    const/4 v7, 0x0

    .line 97
    if-eqz v6, :cond_7

    .line 98
    .line 99
    iget-object v8, p0, Landroidx/appcompat/widget/ActionBarContextView;->t:Landroid/view/View;

    .line 100
    .line 101
    if-nez v8, :cond_7

    .line 102
    .line 103
    iget-boolean v8, p0, Landroidx/appcompat/widget/ActionBarContextView;->z:Z

    .line 104
    .line 105
    if-eqz v8, :cond_6

    .line 106
    .line 107
    invoke-static {v7, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    iget-object v8, p0, Landroidx/appcompat/widget/ActionBarContextView;->u:Landroid/widget/LinearLayout;

    .line 112
    .line 113
    invoke-virtual {v8, v6, v5}, Landroid/view/View;->measure(II)V

    .line 114
    .line 115
    .line 116
    iget-object v5, p0, Landroidx/appcompat/widget/ActionBarContextView;->u:Landroid/widget/LinearLayout;

    .line 117
    .line 118
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    if-gt v5, p2, :cond_3

    .line 123
    .line 124
    const/4 v6, 0x1

    .line 125
    goto :goto_1

    .line 126
    :cond_3
    const/4 v6, 0x0

    .line 127
    :goto_1
    if-eqz v6, :cond_4

    .line 128
    .line 129
    sub-int/2addr p2, v5

    .line 130
    :cond_4
    iget-object v5, p0, Landroidx/appcompat/widget/ActionBarContextView;->u:Landroid/widget/LinearLayout;

    .line 131
    .line 132
    if-eqz v6, :cond_5

    .line 133
    .line 134
    const/4 v6, 0x0

    .line 135
    goto :goto_2

    .line 136
    :cond_5
    const/16 v6, 0x8

    .line 137
    .line 138
    :goto_2
    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 139
    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_6
    invoke-static {v6, p2, v5}, Landroidx/appcompat/widget/ActionBarContextView;->f(Landroid/view/View;II)I

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    :cond_7
    :goto_3
    iget-object v5, p0, Landroidx/appcompat/widget/ActionBarContextView;->t:Landroid/view/View;

    .line 147
    .line 148
    if-eqz v5, :cond_c

    .line 149
    .line 150
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    iget v6, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 155
    .line 156
    const/4 v8, -0x2

    .line 157
    if-eq v6, v8, :cond_8

    .line 158
    .line 159
    const/high16 v9, 0x40000000    # 2.0f

    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_8
    const/high16 v9, -0x80000000

    .line 163
    .line 164
    :goto_4
    if-ltz v6, :cond_9

    .line 165
    .line 166
    invoke-static {v6, p2}, Ljava/lang/Math;->min(II)I

    .line 167
    .line 168
    .line 169
    move-result p2

    .line 170
    :cond_9
    iget v5, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 171
    .line 172
    if-eq v5, v8, :cond_a

    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_a
    const/high16 v1, -0x80000000

    .line 176
    .line 177
    :goto_5
    if-ltz v5, :cond_b

    .line 178
    .line 179
    invoke-static {v5, v3}, Ljava/lang/Math;->min(II)I

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    :cond_b
    iget-object v4, p0, Landroidx/appcompat/widget/ActionBarContextView;->t:Landroid/view/View;

    .line 184
    .line 185
    invoke-static {p2, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 186
    .line 187
    .line 188
    move-result p2

    .line 189
    invoke-static {v3, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    invoke-virtual {v4, p2, v1}, Landroid/view/View;->measure(II)V

    .line 194
    .line 195
    .line 196
    :cond_c
    iget p2, p0, Landroidx/appcompat/widget/ActionBarContextView;->l:I

    .line 197
    .line 198
    if-gtz p2, :cond_f

    .line 199
    .line 200
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 201
    .line 202
    .line 203
    move-result p2

    .line 204
    const/4 v0, 0x0

    .line 205
    :goto_6
    if-ge v7, p2, :cond_e

    .line 206
    .line 207
    invoke-virtual {p0, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    add-int/2addr v1, v2

    .line 216
    if-le v1, v0, :cond_d

    .line 217
    .line 218
    move v0, v1

    .line 219
    :cond_d
    add-int/lit8 v7, v7, 0x1

    .line 220
    .line 221
    goto :goto_6

    .line 222
    :cond_e
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 223
    .line 224
    .line 225
    return-void

    .line 226
    :cond_f
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 227
    .line 228
    .line 229
    return-void

    .line 230
    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 231
    .line 232
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    move-result-object p2

    .line 236
    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p2

    .line 240
    const-string v0, " can only be used with android:layout_height=\"wrap_content\""

    .line 241
    .line 242
    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object p2

    .line 246
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    throw p1

    .line 250
    :cond_11
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 251
    .line 252
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    move-result-object p2

    .line 256
    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object p2

    .line 260
    const-string v0, " can only be used with android:layout_width=\"match_parent\" (or fill_parent)"

    .line 261
    .line 262
    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object p2

    .line 266
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    throw p1
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

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iput-boolean v1, p0, Landroidx/appcompat/widget/ActionBarContextView;->n:Z

    .line 9
    .line 10
    :cond_0
    iget-boolean v2, p0, Landroidx/appcompat/widget/ActionBarContextView;->n:Z

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    if-nez v2, :cond_1

    .line 14
    .line 15
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    iput-boolean v3, p0, Landroidx/appcompat/widget/ActionBarContextView;->n:Z

    .line 24
    .line 25
    :cond_1
    if-eq v0, v3, :cond_3

    .line 26
    .line 27
    const/4 p1, 0x3

    .line 28
    if-ne v0, p1, :cond_2

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    return v3

    .line 32
    :cond_3
    :goto_0
    iput-boolean v1, p0, Landroidx/appcompat/widget/ActionBarContextView;->n:Z

    .line 33
    .line 34
    return v3
    .line 35
    .line 36
    .line 37
.end method

.method public setContentHeight(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/appcompat/widget/ActionBarContextView;->l:I

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

.method public setCustomView(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->t:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, Landroidx/appcompat/widget/ActionBarContextView;->t:Landroid/view/View;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->u:Landroid/widget/LinearLayout;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->u:Landroid/widget/LinearLayout;

    .line 21
    .line 22
    :cond_1
    if-eqz p1, :cond_2

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 25
    .line 26
    .line 27
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 28
    .line 29
    .line 30
    return-void
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public setSubtitle(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/appcompat/widget/ActionBarContextView;->q:Ljava/lang/CharSequence;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarContextView;->d()V

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

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/appcompat/widget/ActionBarContextView;->p:Ljava/lang/CharSequence;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarContextView;->d()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lm0/w0;->r(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 7
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public setTitleOptional(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->z:Z

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-boolean p1, p0, Landroidx/appcompat/widget/ActionBarContextView;->z:Z

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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public bridge synthetic setVisibility(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->h(I)V

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

.method public final shouldDelayChildPressedState()Z
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
