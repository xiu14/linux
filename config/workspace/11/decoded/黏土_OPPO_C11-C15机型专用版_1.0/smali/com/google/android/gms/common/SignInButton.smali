.class public final Lcom/google/android/gms/common/SignInButton;
.super Landroid/widget/FrameLayout;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/common/SignInButton$ColorScheme;,
        Lcom/google/android/gms/common/SignInButton$ButtonSize;
    }
.end annotation


# instance fields
.field public h:I

.field public i:I

.field public j:Landroid/view/View;

.field public k:Landroid/view/View$OnClickListener;


# virtual methods
.method public final a(II)V
    .locals 8

    .line 1
    iput p1, p0, Lcom/google/android/gms/common/SignInButton;->h:I

    .line 2
    .line 3
    iput p2, p0, Lcom/google/android/gms/common/SignInButton;->i:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object p2, p0, Lcom/google/android/gms/common/SignInButton;->j:Landroid/view/View;

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    :try_start_0
    iget p2, p0, Lcom/google/android/gms/common/SignInButton;->h:I

    .line 17
    .line 18
    iget v0, p0, Lcom/google/android/gms/common/SignInButton;->i:I

    .line 19
    .line 20
    invoke-static {p1, p2, v0}, Lcom/google/android/gms/common/internal/zaz;->c(Landroid/content/Context;II)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    iput-object p2, p0, Lcom/google/android/gms/common/SignInButton;->j:Landroid/view/View;
    :try_end_0
    .catch Lcom/google/android/gms/dynamic/RemoteCreator$RemoteCreatorException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    goto/16 :goto_2

    .line 27
    .line 28
    :catch_0
    nop

    .line 29
    const-string p2, "SignInButton"

    .line 30
    .line 31
    const-string v0, "Sign in button not found, using placeholder instead"

    .line 32
    .line 33
    invoke-static {p2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    iget p2, p0, Lcom/google/android/gms/common/SignInButton;->h:I

    .line 37
    .line 38
    iget v0, p0, Lcom/google/android/gms/common/SignInButton;->i:I

    .line 39
    .line 40
    new-instance v1, Lcom/google/android/gms/common/internal/zaaa;

    .line 41
    .line 42
    const v2, 0x1010048

    .line 43
    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    invoke-direct {v1, p1, v3, v2}, Landroid/widget/Button;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    sget-object v2, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 56
    .line 57
    .line 58
    const/high16 v2, 0x41600000    # 14.0f

    .line 59
    .line 60
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 68
    .line 69
    const/high16 v4, 0x42400000    # 48.0f

    .line 70
    .line 71
    mul-float v2, v2, v4

    .line 72
    .line 73
    const/high16 v4, 0x3f000000    # 0.5f

    .line 74
    .line 75
    add-float/2addr v2, v4

    .line 76
    float-to-int v2, v2

    .line 77
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setMinWidth(I)V

    .line 81
    .line 82
    .line 83
    sget v2, Lcom/google/android/gms/base/R$drawable;->common_google_signin_btn_icon_dark:I

    .line 84
    .line 85
    sget v4, Lcom/google/android/gms/base/R$drawable;->common_google_signin_btn_icon_light:I

    .line 86
    .line 87
    invoke-static {v0, v2, v4, v4}, Lcom/google/android/gms/common/internal/zaaa;->a(IIII)I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    sget v4, Lcom/google/android/gms/base/R$drawable;->common_google_signin_btn_text_dark:I

    .line 92
    .line 93
    sget v5, Lcom/google/android/gms/base/R$drawable;->common_google_signin_btn_text_light:I

    .line 94
    .line 95
    invoke-static {v0, v4, v5, v5}, Lcom/google/android/gms/common/internal/zaaa;->a(IIII)I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    const-string v5, "Unknown button size: "

    .line 100
    .line 101
    const/4 v6, 0x2

    .line 102
    const/4 v7, 0x1

    .line 103
    if-eqz p2, :cond_2

    .line 104
    .line 105
    if-eq p2, v7, :cond_2

    .line 106
    .line 107
    if-ne p2, v6, :cond_1

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 111
    .line 112
    invoke-static {p2, v5}, Landroidx/appcompat/app/b;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw p1

    .line 120
    :cond_2
    move v2, v4

    .line 121
    :goto_0
    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-static {v2}, Le6/d;->Y(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    sget v4, Lcom/google/android/gms/base/R$color;->common_google_signin_btn_tint:I

    .line 130
    .line 131
    invoke-virtual {p1, v4}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    invoke-static {v2, v4}, Lf0/a;->h(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 136
    .line 137
    .line 138
    sget-object v4, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    .line 139
    .line 140
    invoke-static {v2, v4}, Lf0/a;->i(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 144
    .line 145
    .line 146
    sget v2, Lcom/google/android/gms/base/R$color;->common_google_signin_btn_text_dark:I

    .line 147
    .line 148
    sget v4, Lcom/google/android/gms/base/R$color;->common_google_signin_btn_text_light:I

    .line 149
    .line 150
    invoke-static {v0, v2, v4, v4}, Lcom/google/android/gms/common/internal/zaaa;->a(IIII)I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->d(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 162
    .line 163
    .line 164
    if-eqz p2, :cond_5

    .line 165
    .line 166
    if-eq p2, v7, :cond_4

    .line 167
    .line 168
    if-ne p2, v6, :cond_3

    .line 169
    .line 170
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 171
    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 175
    .line 176
    invoke-static {p2, v5}, Landroidx/appcompat/app/b;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    throw p1

    .line 184
    :cond_4
    sget p2, Lcom/google/android/gms/base/R$string;->common_signin_button_text_long:I

    .line 185
    .line 186
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 191
    .line 192
    .line 193
    goto :goto_1

    .line 194
    :cond_5
    sget p2, Lcom/google/android/gms/base/R$string;->common_signin_button_text:I

    .line 195
    .line 196
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 201
    .line 202
    .line 203
    :goto_1
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-static {p1}, Lcom/google/android/gms/common/util/DeviceProperties;->a(Landroid/content/Context;)Z

    .line 211
    .line 212
    .line 213
    move-result p1

    .line 214
    if-eqz p1, :cond_6

    .line 215
    .line 216
    const/16 p1, 0x13

    .line 217
    .line 218
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 219
    .line 220
    .line 221
    :cond_6
    iput-object v1, p0, Lcom/google/android/gms/common/SignInButton;->j:Landroid/view/View;

    .line 222
    .line 223
    :goto_2
    iget-object p1, p0, Lcom/google/android/gms/common/SignInButton;->j:Landroid/view/View;

    .line 224
    .line 225
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 226
    .line 227
    .line 228
    iget-object p1, p0, Lcom/google/android/gms/common/SignInButton;->j:Landroid/view/View;

    .line 229
    .line 230
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 231
    .line 232
    .line 233
    move-result p2

    .line 234
    invoke-virtual {p1, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 235
    .line 236
    .line 237
    iget-object p1, p0, Lcom/google/android/gms/common/SignInButton;->j:Landroid/view/View;

    .line 238
    .line 239
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 240
    .line 241
    .line 242
    return-void
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

.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/SignInButton;->k:Landroid/view/View$OnClickListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/android/gms/common/SignInButton;->j:Landroid/view/View;

    .line 6
    .line 7
    if-ne p1, v1, :cond_0

    .line 8
    .line 9
    invoke-interface {v0, p0}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 10
    .line 11
    .line 12
    :cond_0
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

.method public setColorScheme(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/common/SignInButton;->h:I

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/common/SignInButton;->a(II)V

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

.method public setEnabled(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setEnabled(Z)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/common/SignInButton;->j:Landroid/view/View;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

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

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/common/SignInButton;->k:Landroid/view/View$OnClickListener;

    .line 2
    .line 3
    iget-object p1, p0, Lcom/google/android/gms/common/SignInButton;->j:Landroid/view/View;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    .line 9
    .line 10
    :cond_0
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

.method public setScopes([Lcom/google/android/gms/common/api/Scope;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget p1, p0, Lcom/google/android/gms/common/SignInButton;->h:I

    .line 2
    .line 3
    iget v0, p0, Lcom/google/android/gms/common/SignInButton;->i:I

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/common/SignInButton;->a(II)V

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
.end method

.method public setSize(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/common/SignInButton;->i:I

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/common/SignInButton;->a(II)V

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
