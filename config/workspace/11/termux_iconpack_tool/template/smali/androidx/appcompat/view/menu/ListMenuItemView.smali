.class public Landroidx/appcompat/view/menu/ListMenuItemView;
.super Landroid/widget/LinearLayout;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ll/z;
.implements Landroid/widget/AbsListView$SelectionBoundsAdjuster;


# instance fields
.field public h:Ll/o;

.field public i:Landroid/widget/ImageView;

.field public j:Landroid/widget/RadioButton;

.field public k:Landroid/widget/TextView;

.field public l:Landroid/widget/CheckBox;

.field public m:Landroid/widget/TextView;

.field public n:Landroid/widget/ImageView;

.field public o:Landroid/widget/ImageView;

.field public p:Landroid/widget/LinearLayout;

.field public final q:Landroid/graphics/drawable/Drawable;

.field public final r:I

.field public final s:Landroid/content/Context;

.field public t:Z

.field public final u:Landroid/graphics/drawable/Drawable;

.field public final v:Z

.field public w:Landroid/view/LayoutInflater;

.field public x:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 1
    sget v0, Lf/a;->listMenuViewStyle:I

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    sget-object v2, Lf/j;->MenuView:[I

    .line 11
    .line 12
    invoke-static {v1, p2, v2, v0}, La1/w;->A(Landroid/content/Context;Landroid/util/AttributeSet;[II)La1/w;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    sget v0, Lf/j;->MenuView_android_itemBackground:I

    .line 17
    .line 18
    invoke-virtual {p2, v0}, La1/w;->t(I)Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->q:Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    sget v0, Lf/j;->MenuView_android_itemTextAppearance:I

    .line 25
    .line 26
    iget-object v1, p2, La1/w;->i:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Landroid/content/res/TypedArray;

    .line 29
    .line 30
    const/4 v2, -0x1

    .line 31
    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iput v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->r:I

    .line 36
    .line 37
    sget v0, Lf/j;->MenuView_preserveIconSpacing:I

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iput-boolean v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->t:Z

    .line 45
    .line 46
    iput-object p1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->s:Landroid/content/Context;

    .line 47
    .line 48
    sget v0, Lf/j;->MenuView_subMenuArrow:I

    .line 49
    .line 50
    invoke-virtual {p2, v0}, La1/w;->t(I)Landroid/graphics/drawable/Drawable;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->u:Landroid/graphics/drawable/Drawable;

    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const v0, 0x1010129

    .line 61
    .line 62
    .line 63
    filled-new-array {v0}, [I

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sget v1, Lf/a;->dropDownListViewStyle:I

    .line 68
    .line 69
    const/4 v3, 0x0

    .line 70
    invoke-virtual {p1, v3, v0, v1, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iput-boolean v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->v:Z

    .line 79
    .line 80
    invoke-virtual {p2}, La1/w;->E()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 84
    .line 85
    .line 86
    return-void
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

.method private getInflater()Landroid/view/LayoutInflater;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->w:Landroid/view/LayoutInflater;

    .line 2
    .line 3
    if-nez v0, :cond_0

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
    iput-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->w:Landroid/view/LayoutInflater;

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->w:Landroid/view/LayoutInflater;

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

.method private setSubMenuArrowVisible(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->n:Landroid/widget/ImageView;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/16 p1, 0x8

    .line 10
    .line 11
    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    :cond_1
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
.end method


# virtual methods
.method public final adjustListItemSelectionBounds(Landroid/graphics/Rect;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->o:Landroid/widget/ImageView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->o:Landroid/widget/ImageView;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 18
    .line 19
    iget v1, p1, Landroid/graphics/Rect;->top:I

    .line 20
    .line 21
    iget-object v2, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->o:Landroid/widget/ImageView;

    .line 22
    .line 23
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    iget v3, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 28
    .line 29
    add-int/2addr v2, v3

    .line 30
    iget v0, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 31
    .line 32
    add-int/2addr v2, v0

    .line 33
    add-int/2addr v2, v1

    .line 34
    iput v2, p1, Landroid/graphics/Rect;->top:I

    .line 35
    .line 36
    :cond_0
    return-void
    .line 37
.end method

.method public final b(Ll/o;)V
    .locals 10

    .line 1
    iput-object p1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->h:Ll/o;

    .line 2
    .line 3
    invoke-virtual {p1}, Ll/o;->isVisible()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p1, Ll/o;->n:Ll/m;

    .line 8
    .line 9
    const/16 v2, 0x8

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/16 v0, 0x8

    .line 17
    .line 18
    :goto_0
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p1, Ll/o;->e:Ljava/lang/CharSequence;

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroidx/appcompat/view/menu/ListMenuItemView;->setTitle(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ll/o;->isCheckable()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-virtual {p0, v0}, Landroidx/appcompat/view/menu/ListMenuItemView;->setCheckable(Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ll/m;->o()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/4 v4, 0x1

    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    invoke-virtual {v1}, Ll/m;->n()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    iget-char v0, p1, Ll/o;->j:C

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    iget-char v0, p1, Ll/o;->h:C

    .line 50
    .line 51
    :goto_1
    if-eqz v0, :cond_2

    .line 52
    .line 53
    const/4 v0, 0x1

    .line 54
    goto :goto_2

    .line 55
    :cond_2
    const/4 v0, 0x0

    .line 56
    :goto_2
    invoke-virtual {v1}, Ll/m;->n()Z

    .line 57
    .line 58
    .line 59
    if-eqz v0, :cond_5

    .line 60
    .line 61
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->h:Ll/o;

    .line 62
    .line 63
    iget-object v1, v0, Ll/o;->n:Ll/m;

    .line 64
    .line 65
    invoke-virtual {v1}, Ll/m;->o()Z

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-eqz v5, :cond_4

    .line 70
    .line 71
    invoke-virtual {v1}, Ll/m;->n()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_3

    .line 76
    .line 77
    iget-char v0, v0, Ll/o;->j:C

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_3
    iget-char v0, v0, Ll/o;->h:C

    .line 81
    .line 82
    :goto_3
    if-eqz v0, :cond_4

    .line 83
    .line 84
    const/4 v0, 0x1

    .line 85
    goto :goto_4

    .line 86
    :cond_4
    const/4 v0, 0x0

    .line 87
    :goto_4
    if-eqz v0, :cond_5

    .line 88
    .line 89
    goto :goto_5

    .line 90
    :cond_5
    const/16 v3, 0x8

    .line 91
    .line 92
    :goto_5
    if-nez v3, :cond_d

    .line 93
    .line 94
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->m:Landroid/widget/TextView;

    .line 95
    .line 96
    iget-object v1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->h:Ll/o;

    .line 97
    .line 98
    iget-object v5, v1, Ll/o;->n:Ll/m;

    .line 99
    .line 100
    iget-object v6, v5, Ll/m;->a:Landroid/content/Context;

    .line 101
    .line 102
    invoke-virtual {v5}, Ll/m;->n()Z

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    if-eqz v7, :cond_6

    .line 107
    .line 108
    iget-char v7, v1, Ll/o;->j:C

    .line 109
    .line 110
    goto :goto_6

    .line 111
    :cond_6
    iget-char v7, v1, Ll/o;->h:C

    .line 112
    .line 113
    :goto_6
    if-nez v7, :cond_7

    .line 114
    .line 115
    const-string v1, ""

    .line 116
    .line 117
    goto/16 :goto_9

    .line 118
    .line 119
    :cond_7
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    new-instance v9, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-static {v6}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    invoke-virtual {v6}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    .line 133
    .line 134
    .line 135
    move-result v6

    .line 136
    if-eqz v6, :cond_8

    .line 137
    .line 138
    sget v6, Lf/h;->abc_prepend_shortcut_label:I

    .line 139
    .line 140
    invoke-virtual {v8, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    :cond_8
    invoke-virtual {v5}, Ll/m;->n()Z

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    if-eqz v5, :cond_9

    .line 152
    .line 153
    iget v1, v1, Ll/o;->k:I

    .line 154
    .line 155
    goto :goto_7

    .line 156
    :cond_9
    iget v1, v1, Ll/o;->i:I

    .line 157
    .line 158
    :goto_7
    sget v5, Lf/h;->abc_menu_meta_shortcut_label:I

    .line 159
    .line 160
    invoke-virtual {v8, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    const/high16 v6, 0x10000

    .line 165
    .line 166
    invoke-static {v9, v1, v6, v5}, Ll/o;->c(Ljava/lang/StringBuilder;IILjava/lang/String;)V

    .line 167
    .line 168
    .line 169
    sget v5, Lf/h;->abc_menu_ctrl_shortcut_label:I

    .line 170
    .line 171
    invoke-virtual {v8, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    const/16 v6, 0x1000

    .line 176
    .line 177
    invoke-static {v9, v1, v6, v5}, Ll/o;->c(Ljava/lang/StringBuilder;IILjava/lang/String;)V

    .line 178
    .line 179
    .line 180
    sget v5, Lf/h;->abc_menu_alt_shortcut_label:I

    .line 181
    .line 182
    invoke-virtual {v8, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    const/4 v6, 0x2

    .line 187
    invoke-static {v9, v1, v6, v5}, Ll/o;->c(Ljava/lang/StringBuilder;IILjava/lang/String;)V

    .line 188
    .line 189
    .line 190
    sget v5, Lf/h;->abc_menu_shift_shortcut_label:I

    .line 191
    .line 192
    invoke-virtual {v8, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    invoke-static {v9, v1, v4, v5}, Ll/o;->c(Ljava/lang/StringBuilder;IILjava/lang/String;)V

    .line 197
    .line 198
    .line 199
    sget v4, Lf/h;->abc_menu_sym_shortcut_label:I

    .line 200
    .line 201
    invoke-virtual {v8, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    const/4 v5, 0x4

    .line 206
    invoke-static {v9, v1, v5, v4}, Ll/o;->c(Ljava/lang/StringBuilder;IILjava/lang/String;)V

    .line 207
    .line 208
    .line 209
    sget v4, Lf/h;->abc_menu_function_shortcut_label:I

    .line 210
    .line 211
    invoke-virtual {v8, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    invoke-static {v9, v1, v2, v4}, Ll/o;->c(Ljava/lang/StringBuilder;IILjava/lang/String;)V

    .line 216
    .line 217
    .line 218
    if-eq v7, v2, :cond_c

    .line 219
    .line 220
    const/16 v1, 0xa

    .line 221
    .line 222
    if-eq v7, v1, :cond_b

    .line 223
    .line 224
    const/16 v1, 0x20

    .line 225
    .line 226
    if-eq v7, v1, :cond_a

    .line 227
    .line 228
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    goto :goto_8

    .line 232
    :cond_a
    sget v1, Lf/h;->abc_menu_space_shortcut_label:I

    .line 233
    .line 234
    invoke-virtual {v8, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    goto :goto_8

    .line 242
    :cond_b
    sget v1, Lf/h;->abc_menu_enter_shortcut_label:I

    .line 243
    .line 244
    invoke-virtual {v8, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    goto :goto_8

    .line 252
    :cond_c
    sget v1, Lf/h;->abc_menu_delete_shortcut_label:I

    .line 253
    .line 254
    invoke-virtual {v8, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    :goto_8
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    :goto_9
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 266
    .line 267
    .line 268
    :cond_d
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->m:Landroid/widget/TextView;

    .line 269
    .line 270
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    if-eq v0, v3, :cond_e

    .line 275
    .line 276
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->m:Landroid/widget/TextView;

    .line 277
    .line 278
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 279
    .line 280
    .line 281
    :cond_e
    invoke-virtual {p1}, Ll/o;->getIcon()Landroid/graphics/drawable/Drawable;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-virtual {p0, v0}, Landroidx/appcompat/view/menu/ListMenuItemView;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {p1}, Ll/o;->isEnabled()Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    invoke-virtual {p0, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {p1}, Ll/o;->hasSubMenu()Z

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    invoke-direct {p0, v0}, Landroidx/appcompat/view/menu/ListMenuItemView;->setSubMenuArrowVisible(Z)V

    .line 300
    .line 301
    .line 302
    iget-object p1, p1, Ll/o;->q:Ljava/lang/CharSequence;

    .line 303
    .line 304
    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 305
    .line 306
    .line 307
    return-void
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

.method public getItemData()Ll/o;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->h:Ll/o;

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

.method public final onFinishInflate()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishInflate()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->q:Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 7
    .line 8
    .line 9
    sget v0, Lf/f;->title:I

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroid/widget/TextView;

    .line 16
    .line 17
    iput-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->k:Landroid/widget/TextView;

    .line 18
    .line 19
    const/4 v1, -0x1

    .line 20
    iget v2, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->r:I

    .line 21
    .line 22
    if-eq v2, v1, :cond_0

    .line 23
    .line 24
    iget-object v1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->s:Landroid/content/Context;

    .line 25
    .line 26
    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 27
    .line 28
    .line 29
    :cond_0
    sget v0, Lf/f;->shortcut:I

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Landroid/widget/TextView;

    .line 36
    .line 37
    iput-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->m:Landroid/widget/TextView;

    .line 38
    .line 39
    sget v0, Lf/f;->submenuarrow:I

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Landroid/widget/ImageView;

    .line 46
    .line 47
    iput-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->n:Landroid/widget/ImageView;

    .line 48
    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    iget-object v1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->u:Landroid/graphics/drawable/Drawable;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    sget v0, Lf/f;->group_divider:I

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Landroid/widget/ImageView;

    .line 63
    .line 64
    iput-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->o:Landroid/widget/ImageView;

    .line 65
    .line 66
    sget v0, Lf/f;->content:I

    .line 67
    .line 68
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Landroid/widget/LinearLayout;

    .line 73
    .line 74
    iput-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->p:Landroid/widget/LinearLayout;

    .line 75
    .line 76
    return-void
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
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->i:Landroid/widget/ImageView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->t:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->i:Landroid/widget/ImageView;

    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 20
    .line 21
    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 22
    .line 23
    if-lez v0, :cond_0

    .line 24
    .line 25
    iget v2, v1, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 26
    .line 27
    if-gtz v2, :cond_0

    .line 28
    .line 29
    iput v0, v1, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 30
    .line 31
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 32
    .line 33
    .line 34
    return-void
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

.method public setCheckable(Z)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->j:Landroid/widget/RadioButton;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->l:Landroid/widget/CheckBox;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_3

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->h:Ll/o;

    .line 14
    .line 15
    iget v0, v0, Ll/o;->x:I

    .line 16
    .line 17
    and-int/lit8 v0, v0, 0x4

    .line 18
    .line 19
    const/4 v1, -0x1

    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v0, :cond_3

    .line 22
    .line 23
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->j:Landroid/widget/RadioButton;

    .line 24
    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    invoke-direct {p0}, Landroidx/appcompat/view/menu/ListMenuItemView;->getInflater()Landroid/view/LayoutInflater;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sget v3, Lf/g;->abc_list_menu_item_radio:I

    .line 32
    .line 33
    invoke-virtual {v0, v3, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Landroid/widget/RadioButton;

    .line 38
    .line 39
    iput-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->j:Landroid/widget/RadioButton;

    .line 40
    .line 41
    iget-object v3, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->p:Landroid/widget/LinearLayout;

    .line 42
    .line 43
    if-eqz v3, :cond_1

    .line 44
    .line 45
    invoke-virtual {v3, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-virtual {p0, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 50
    .line 51
    .line 52
    :cond_2
    :goto_0
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->j:Landroid/widget/RadioButton;

    .line 53
    .line 54
    iget-object v1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->l:Landroid/widget/CheckBox;

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->l:Landroid/widget/CheckBox;

    .line 58
    .line 59
    if-nez v0, :cond_5

    .line 60
    .line 61
    invoke-direct {p0}, Landroidx/appcompat/view/menu/ListMenuItemView;->getInflater()Landroid/view/LayoutInflater;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sget v3, Lf/g;->abc_list_menu_item_checkbox:I

    .line 66
    .line 67
    invoke-virtual {v0, v3, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Landroid/widget/CheckBox;

    .line 72
    .line 73
    iput-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->l:Landroid/widget/CheckBox;

    .line 74
    .line 75
    iget-object v3, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->p:Landroid/widget/LinearLayout;

    .line 76
    .line 77
    if-eqz v3, :cond_4

    .line 78
    .line 79
    invoke-virtual {v3, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    invoke-virtual {p0, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 84
    .line 85
    .line 86
    :cond_5
    :goto_1
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->l:Landroid/widget/CheckBox;

    .line 87
    .line 88
    iget-object v1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->j:Landroid/widget/RadioButton;

    .line 89
    .line 90
    :goto_2
    const/16 v3, 0x8

    .line 91
    .line 92
    if-eqz p1, :cond_7

    .line 93
    .line 94
    iget-object p1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->h:Ll/o;

    .line 95
    .line 96
    invoke-virtual {p1}, Ll/o;->isChecked()Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-eqz p1, :cond_6

    .line 108
    .line 109
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 110
    .line 111
    .line 112
    :cond_6
    if-eqz v1, :cond_9

    .line 113
    .line 114
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-eq p1, v3, :cond_9

    .line 119
    .line 120
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_7
    iget-object p1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->l:Landroid/widget/CheckBox;

    .line 125
    .line 126
    if-eqz p1, :cond_8

    .line 127
    .line 128
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 129
    .line 130
    .line 131
    :cond_8
    iget-object p1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->j:Landroid/widget/RadioButton;

    .line 132
    .line 133
    if-eqz p1, :cond_9

    .line 134
    .line 135
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 136
    .line 137
    .line 138
    :cond_9
    :goto_3
    return-void
    .line 139
    .line 140
.end method

.method public setChecked(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->h:Ll/o;

    .line 2
    .line 3
    iget v0, v0, Ll/o;->x:I

    .line 4
    .line 5
    and-int/lit8 v0, v0, 0x4

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->j:Landroid/widget/RadioButton;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-direct {p0}, Landroidx/appcompat/view/menu/ListMenuItemView;->getInflater()Landroid/view/LayoutInflater;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget v3, Lf/g;->abc_list_menu_item_radio:I

    .line 20
    .line 21
    invoke-virtual {v0, v3, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Landroid/widget/RadioButton;

    .line 26
    .line 27
    iput-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->j:Landroid/widget/RadioButton;

    .line 28
    .line 29
    iget-object v2, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->p:Landroid/widget/LinearLayout;

    .line 30
    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    invoke-virtual {v2, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {p0, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->j:Landroid/widget/RadioButton;

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_2
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->l:Landroid/widget/CheckBox;

    .line 44
    .line 45
    if-nez v0, :cond_4

    .line 46
    .line 47
    invoke-direct {p0}, Landroidx/appcompat/view/menu/ListMenuItemView;->getInflater()Landroid/view/LayoutInflater;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sget v3, Lf/g;->abc_list_menu_item_checkbox:I

    .line 52
    .line 53
    invoke-virtual {v0, v3, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Landroid/widget/CheckBox;

    .line 58
    .line 59
    iput-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->l:Landroid/widget/CheckBox;

    .line 60
    .line 61
    iget-object v2, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->p:Landroid/widget/LinearLayout;

    .line 62
    .line 63
    if-eqz v2, :cond_3

    .line 64
    .line 65
    invoke-virtual {v2, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    invoke-virtual {p0, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 70
    .line 71
    .line 72
    :cond_4
    :goto_1
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->l:Landroid/widget/CheckBox;

    .line 73
    .line 74
    :goto_2
    invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 75
    .line 76
    .line 77
    return-void
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

.method public setForceShowIcon(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->x:Z

    .line 2
    .line 3
    iput-boolean p1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->t:Z

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

.method public setGroupDividerEnabled(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->o:Landroid/widget/ImageView;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->v:Z

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/16 p1, 0x8

    .line 14
    .line 15
    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    :cond_1
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
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->h:Ll/o;

    .line 2
    .line 3
    iget-object v0, v0, Ll/o;->n:Ll/m;

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->x:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-boolean v1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->t:Z

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_3

    .line 14
    :cond_0
    iget-object v1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->i:Landroid/widget/ImageView;

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    iget-boolean v2, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->t:Z

    .line 21
    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    goto :goto_3

    .line 25
    :cond_1
    const/4 v2, 0x0

    .line 26
    if-nez v1, :cond_3

    .line 27
    .line 28
    invoke-direct {p0}, Landroidx/appcompat/view/menu/ListMenuItemView;->getInflater()Landroid/view/LayoutInflater;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    sget v3, Lf/g;->abc_list_menu_item_icon:I

    .line 33
    .line 34
    invoke-virtual {v1, v3, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Landroid/widget/ImageView;

    .line 39
    .line 40
    iput-object v1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->i:Landroid/widget/ImageView;

    .line 41
    .line 42
    iget-object v3, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->p:Landroid/widget/LinearLayout;

    .line 43
    .line 44
    if-eqz v3, :cond_2

    .line 45
    .line 46
    invoke-virtual {v3, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-virtual {p0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 51
    .line 52
    .line 53
    :cond_3
    :goto_0
    if-nez p1, :cond_5

    .line 54
    .line 55
    iget-boolean v1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->t:Z

    .line 56
    .line 57
    if-eqz v1, :cond_4

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_4
    iget-object p1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->i:Landroid/widget/ImageView;

    .line 61
    .line 62
    const/16 v0, 0x8

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_5
    :goto_1
    iget-object v1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->i:Landroid/widget/ImageView;

    .line 69
    .line 70
    if-eqz v0, :cond_6

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_6
    const/4 p1, 0x0

    .line 74
    :goto_2
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 75
    .line 76
    .line 77
    iget-object p1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->i:Landroid/widget/ImageView;

    .line 78
    .line 79
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_7

    .line 84
    .line 85
    iget-object p1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->i:Landroid/widget/ImageView;

    .line 86
    .line 87
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 88
    .line 89
    .line 90
    :cond_7
    :goto_3
    return-void
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

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->k:Landroid/widget/TextView;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->k:Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->k:Landroid/widget/TextView;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget-object p1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->k:Landroid/widget/TextView;

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    const/16 v0, 0x8

    .line 30
    .line 31
    if-eq p1, v0, :cond_1

    .line 32
    .line 33
    iget-object p1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->k:Landroid/widget/TextView;

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    :cond_1
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
