.class Lcom/google/android/material/textfield/StartCompoundLayout;
.super Landroid/widget/LinearLayout;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation


# instance fields
.field public final h:Lcom/google/android/material/textfield/TextInputLayout;

.field public final i:Landroidx/appcompat/widget/AppCompatTextView;

.field public j:Ljava/lang/CharSequence;

.field public final k:Lcom/google/android/material/internal/CheckableImageButton;

.field public l:Landroid/content/res/ColorStateList;

.field public m:Landroid/graphics/PorterDuff$Mode;

.field public n:I

.field public o:Landroid/widget/ImageView$ScaleType;

.field public p:Landroid/view/View$OnLongClickListener;

.field public q:Z


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;La1/w;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->h:Lcom/google/android/material/textfield/TextInputLayout;

    .line 9
    .line 10
    const/16 p1, 0x8

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 17
    .line 18
    .line 19
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 20
    .line 21
    const v2, 0x800003

    .line 22
    .line 23
    .line 24
    const/4 v3, -0x2

    .line 25
    const/4 v4, -0x1

    .line 26
    invoke-direct {v1, v3, v4, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    sget v2, Lcom/google/android/material/R$layout;->design_text_input_start_icon:I

    .line 41
    .line 42
    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Lcom/google/android/material/internal/CheckableImageButton;

    .line 47
    .line 48
    iput-object v1, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->k:Lcom/google/android/material/internal/CheckableImageButton;

    .line 49
    .line 50
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 51
    .line 52
    const/16 v5, 0x16

    .line 53
    .line 54
    if-gt v2, v5, :cond_0

    .line 55
    .line 56
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    const/4 v6, 0x4

    .line 65
    invoke-static {v5, v6}, Lcom/google/android/material/internal/ViewUtils;->b(Landroid/content/Context;I)F

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    float-to-int v5, v5

    .line 70
    invoke-static {v2, v5}, Lcom/google/android/material/ripple/RippleUtils;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 75
    .line 76
    .line 77
    :cond_0
    new-instance v2, Landroidx/appcompat/widget/AppCompatTextView;

    .line 78
    .line 79
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    const/4 v6, 0x0

    .line 84
    invoke-direct {v2, v5, v6}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 85
    .line 86
    .line 87
    iput-object v2, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->i:Landroidx/appcompat/widget/AppCompatTextView;

    .line 88
    .line 89
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-static {v5}, Lcom/google/android/material/resources/MaterialResources;->d(Landroid/content/Context;)Z

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    if-eqz v5, :cond_1

    .line 98
    .line 99
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    check-cast v5, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 104
    .line 105
    invoke-virtual {v5, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 106
    .line 107
    .line 108
    :cond_1
    iget-object v5, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->p:Landroid/view/View$OnLongClickListener;

    .line 109
    .line 110
    invoke-virtual {v1, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 111
    .line 112
    .line 113
    invoke-static {v1, v5}, Lcom/google/android/material/textfield/IconHelper;->d(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    .line 114
    .line 115
    .line 116
    iput-object v6, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->p:Landroid/view/View$OnLongClickListener;

    .line 117
    .line 118
    invoke-virtual {v1, v6}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 119
    .line 120
    .line 121
    invoke-static {v1, v6}, Lcom/google/android/material/textfield/IconHelper;->d(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    .line 122
    .line 123
    .line 124
    sget v5, Lcom/google/android/material/R$styleable;->TextInputLayout_startIconTint:I

    .line 125
    .line 126
    iget-object v7, p2, La1/w;->i:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v7, Landroid/content/res/TypedArray;

    .line 129
    .line 130
    invoke-virtual {v7, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    if-eqz v5, :cond_2

    .line 135
    .line 136
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    sget v8, Lcom/google/android/material/R$styleable;->TextInputLayout_startIconTint:I

    .line 141
    .line 142
    invoke-static {v5, p2, v8}, Lcom/google/android/material/resources/MaterialResources;->a(Landroid/content/Context;La1/w;I)Landroid/content/res/ColorStateList;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    iput-object v5, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->l:Landroid/content/res/ColorStateList;

    .line 147
    .line 148
    :cond_2
    sget v5, Lcom/google/android/material/R$styleable;->TextInputLayout_startIconTintMode:I

    .line 149
    .line 150
    invoke-virtual {v7, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    if-eqz v5, :cond_3

    .line 155
    .line 156
    sget v5, Lcom/google/android/material/R$styleable;->TextInputLayout_startIconTintMode:I

    .line 157
    .line 158
    invoke-virtual {v7, v5, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    invoke-static {v5, v6}, Lcom/google/android/material/internal/ViewUtils;->f(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    iput-object v5, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->m:Landroid/graphics/PorterDuff$Mode;

    .line 167
    .line 168
    :cond_3
    sget v5, Lcom/google/android/material/R$styleable;->TextInputLayout_startIconDrawable:I

    .line 169
    .line 170
    invoke-virtual {v7, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    const/4 v8, 0x1

    .line 175
    if-eqz v5, :cond_5

    .line 176
    .line 177
    sget v5, Lcom/google/android/material/R$styleable;->TextInputLayout_startIconDrawable:I

    .line 178
    .line 179
    invoke-virtual {p2, v5}, La1/w;->t(I)Landroid/graphics/drawable/Drawable;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    invoke-virtual {p0, v5}, Lcom/google/android/material/textfield/StartCompoundLayout;->b(Landroid/graphics/drawable/Drawable;)V

    .line 184
    .line 185
    .line 186
    sget v5, Lcom/google/android/material/R$styleable;->TextInputLayout_startIconContentDescription:I

    .line 187
    .line 188
    invoke-virtual {v7, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 189
    .line 190
    .line 191
    move-result v5

    .line 192
    if-eqz v5, :cond_4

    .line 193
    .line 194
    sget v5, Lcom/google/android/material/R$styleable;->TextInputLayout_startIconContentDescription:I

    .line 195
    .line 196
    invoke-virtual {v7, v5}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    invoke-virtual {v1}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 201
    .line 202
    .line 203
    move-result-object v9

    .line 204
    if-eq v9, v5, :cond_4

    .line 205
    .line 206
    invoke-virtual {v1, v5}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 207
    .line 208
    .line 209
    :cond_4
    sget v5, Lcom/google/android/material/R$styleable;->TextInputLayout_startIconCheckable:I

    .line 210
    .line 211
    invoke-virtual {v7, v5, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 212
    .line 213
    .line 214
    move-result v5

    .line 215
    invoke-virtual {v1, v5}, Lcom/google/android/material/internal/CheckableImageButton;->setCheckable(Z)V

    .line 216
    .line 217
    .line 218
    :cond_5
    sget v5, Lcom/google/android/material/R$styleable;->TextInputLayout_startIconMinSize:I

    .line 219
    .line 220
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 221
    .line 222
    .line 223
    move-result-object v9

    .line 224
    sget v10, Lcom/google/android/material/R$dimen;->mtrl_min_touch_target_size:I

    .line 225
    .line 226
    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 227
    .line 228
    .line 229
    move-result v9

    .line 230
    invoke-virtual {v7, v5, v9}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 231
    .line 232
    .line 233
    move-result v5

    .line 234
    if-ltz v5, :cond_a

    .line 235
    .line 236
    iget v9, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->n:I

    .line 237
    .line 238
    if-eq v5, v9, :cond_6

    .line 239
    .line 240
    iput v5, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->n:I

    .line 241
    .line 242
    invoke-virtual {v1, v5}, Landroid/view/View;->setMinimumWidth(I)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v1, v5}, Landroid/view/View;->setMinimumHeight(I)V

    .line 246
    .line 247
    .line 248
    :cond_6
    sget v5, Lcom/google/android/material/R$styleable;->TextInputLayout_startIconScaleType:I

    .line 249
    .line 250
    invoke-virtual {v7, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 251
    .line 252
    .line 253
    move-result v5

    .line 254
    if-eqz v5, :cond_7

    .line 255
    .line 256
    sget v5, Lcom/google/android/material/R$styleable;->TextInputLayout_startIconScaleType:I

    .line 257
    .line 258
    invoke-virtual {v7, v5, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 259
    .line 260
    .line 261
    move-result v4

    .line 262
    invoke-static {v4}, Lcom/google/android/material/textfield/IconHelper;->b(I)Landroid/widget/ImageView$ScaleType;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    iput-object v4, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->o:Landroid/widget/ImageView$ScaleType;

    .line 267
    .line 268
    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 269
    .line 270
    .line 271
    :cond_7
    invoke-virtual {v2, p1}, Landroid/view/View;->setVisibility(I)V

    .line 272
    .line 273
    .line 274
    sget p1, Lcom/google/android/material/R$id;->textinput_prefix_text:I

    .line 275
    .line 276
    invoke-virtual {v2, p1}, Landroid/view/View;->setId(I)V

    .line 277
    .line 278
    .line 279
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 280
    .line 281
    invoke-direct {p1, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 285
    .line 286
    .line 287
    sget-object p1, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 288
    .line 289
    invoke-virtual {v2, v8}, Landroid/view/View;->setAccessibilityLiveRegion(I)V

    .line 290
    .line 291
    .line 292
    sget p1, Lcom/google/android/material/R$styleable;->TextInputLayout_prefixTextAppearance:I

    .line 293
    .line 294
    invoke-virtual {v7, p1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 295
    .line 296
    .line 297
    move-result p1

    .line 298
    invoke-static {v2, p1}, Lu2/f;->L(Landroid/widget/TextView;I)V

    .line 299
    .line 300
    .line 301
    sget p1, Lcom/google/android/material/R$styleable;->TextInputLayout_prefixTextColor:I

    .line 302
    .line 303
    invoke-virtual {v7, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 304
    .line 305
    .line 306
    move-result p1

    .line 307
    if-eqz p1, :cond_8

    .line 308
    .line 309
    sget p1, Lcom/google/android/material/R$styleable;->TextInputLayout_prefixTextColor:I

    .line 310
    .line 311
    invoke-virtual {p2, p1}, La1/w;->s(I)Landroid/content/res/ColorStateList;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 316
    .line 317
    .line 318
    :cond_8
    sget p1, Lcom/google/android/material/R$styleable;->TextInputLayout_prefixText:I

    .line 319
    .line 320
    invoke-virtual {v7, p1}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 325
    .line 326
    .line 327
    move-result p2

    .line 328
    if-eqz p2, :cond_9

    .line 329
    .line 330
    goto :goto_0

    .line 331
    :cond_9
    move-object v6, p1

    .line 332
    :goto_0
    iput-object v6, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->j:Ljava/lang/CharSequence;

    .line 333
    .line 334
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {p0}, Lcom/google/android/material/textfield/StartCompoundLayout;->e()V

    .line 338
    .line 339
    .line 340
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 344
    .line 345
    .line 346
    return-void

    .line 347
    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 348
    .line 349
    const-string p2, "startIconSize cannot be less than 0"

    .line 350
    .line 351
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    throw p1
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
.method public final a()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->k:Lcom/google/android/material/internal/CheckableImageButton;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginEnd()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    add-int/2addr v0, v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    :goto_0
    sget-object v1, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    iget-object v2, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->i:Landroidx/appcompat/widget/AppCompatTextView;

    .line 33
    .line 34
    invoke-virtual {v2}, Landroid/view/View;->getPaddingStart()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    add-int/2addr v2, v1

    .line 39
    add-int/2addr v2, v0

    .line 40
    return v2
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

.method public final b(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->k:Lcom/google/android/material/internal/CheckableImageButton;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object p1, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->l:Landroid/content/res/ColorStateList;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->m:Landroid/graphics/PorterDuff$Mode;

    .line 11
    .line 12
    iget-object v2, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->h:Lcom/google/android/material/textfield/TextInputLayout;

    .line 13
    .line 14
    invoke-static {v2, v0, p1, v1}, Lcom/google/android/material/textfield/IconHelper;->a(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/StartCompoundLayout;->c(Z)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->l:Landroid/content/res/ColorStateList;

    .line 22
    .line 23
    invoke-static {v2, v0, p1}, Lcom/google/android/material/textfield/IconHelper;->c(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/StartCompoundLayout;->c(Z)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->p:Landroid/view/View$OnLongClickListener;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0, p1}, Lcom/google/android/material/textfield/IconHelper;->d(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    .line 38
    .line 39
    .line 40
    iput-object v1, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->p:Landroid/view/View$OnLongClickListener;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v1}, Lcom/google/android/material/textfield/IconHelper;->d(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-eqz p1, :cond_1

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 55
    .line 56
    .line 57
    :cond_1
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

.method public final c(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->k:Lcom/google/android/material/internal/CheckableImageButton;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-eq v1, p1, :cond_2

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    const/16 v2, 0x8

    .line 19
    .line 20
    :goto_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/google/android/material/textfield/StartCompoundLayout;->d()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/google/android/material/textfield/StartCompoundLayout;->e()V

    .line 27
    .line 28
    .line 29
    :cond_2
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

.method public final d()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->h:Lcom/google/android/material/textfield/TextInputLayout;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->k:Landroid/widget/EditText;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v1, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->k:Lcom/google/android/material/internal/CheckableImageButton;

    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    sget-object v1, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getPaddingStart()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    :goto_0
    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundPaddingTop()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    sget v4, Lcom/google/android/material/R$dimen;->material_input_text_to_prefix_suffix_padding:I

    .line 37
    .line 38
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundPaddingBottom()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    sget-object v4, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 47
    .line 48
    iget-object v4, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->i:Landroidx/appcompat/widget/AppCompatTextView;

    .line 49
    .line 50
    invoke-virtual {v4, v1, v2, v3, v0}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 51
    .line 52
    .line 53
    return-void
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

.method public final e()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->j:Ljava/lang/CharSequence;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-boolean v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->q:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/16 v0, 0x8

    .line 15
    .line 16
    :goto_0
    iget-object v3, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->k:Lcom/google/android/material/internal/CheckableImageButton;

    .line 17
    .line 18
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    :cond_1
    const/4 v1, 0x0

    .line 27
    :cond_2
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->i:Landroidx/appcompat/widget/AppCompatTextView;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/google/android/material/textfield/StartCompoundLayout;->h:Lcom/google/android/material/textfield/TextInputLayout;

    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->q()Z

    .line 38
    .line 39
    .line 40
    return-void
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

.method public final onMeasure(II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/android/material/textfield/StartCompoundLayout;->d()V

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
