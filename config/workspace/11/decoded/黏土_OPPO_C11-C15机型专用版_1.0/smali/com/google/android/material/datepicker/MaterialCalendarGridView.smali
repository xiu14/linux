.class final Lcom/google/android/material/datepicker/MaterialCalendarGridView;
.super Landroid/widget/GridView;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final h:Ljava/util/Calendar;

.field public final i:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Landroid/widget/GridView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-static {p1}, Lcom/google/android/material/datepicker/UtcDates;->i(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->h:Ljava/util/Calendar;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const p2, 0x101020d

    .line 17
    .line 18
    .line 19
    invoke-static {p1, p2}, Lcom/google/android/material/datepicker/MaterialDatePicker;->j(Landroid/content/Context;I)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    sget p1, Lcom/google/android/material/R$id;->cancel_button:I

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Landroid/view/View;->setNextFocusLeftId(I)V

    .line 28
    .line 29
    .line 30
    sget p1, Lcom/google/android/material/R$id;->confirm_button:I

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Landroid/view/View;->setNextFocusRightId(I)V

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    sget p2, Lcom/google/android/material/R$attr;->nestedScrollable:I

    .line 40
    .line 41
    invoke-static {p1, p2}, Lcom/google/android/material/datepicker/MaterialDatePicker;->j(Landroid/content/Context;I)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    iput-boolean p1, p0, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->i:Z

    .line 46
    .line 47
    new-instance p1, Lcom/google/android/material/datepicker/MaterialCalendarGridView$1;

    .line 48
    .line 49
    invoke-direct {p1}, Lm0/b;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-static {p0, p1}, Lm0/w0;->q(Landroid/view/View;Lm0/b;)V

    .line 53
    .line 54
    .line 55
    return-void
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


# virtual methods
.method public final a()Lcom/google/android/material/datepicker/MonthAdapter;
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/google/android/material/datepicker/MonthAdapter;

    .line 6
    .line 7
    return-object v0
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

.method public final b(I)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sub-int/2addr p1, v0

    .line 6
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

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
.end method

.method public final getAdapter()Landroid/widget/Adapter;
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/datepicker/MonthAdapter;

    return-object v0
.end method

.method public final getAdapter()Landroid/widget/ListAdapter;
    .locals 1

    .line 2
    invoke-super {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/datepicker/MonthAdapter;

    return-object v0
.end method

.method public final onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/GridView;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lcom/google/android/material/datepicker/MonthAdapter;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

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
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p1}, Landroid/widget/GridView;->onDraw(Landroid/graphics/Canvas;)V

    .line 4
    .line 5
    .line 6
    invoke-super {v0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lcom/google/android/material/datepicker/MonthAdapter;

    .line 11
    .line 12
    iget-object v2, v1, Lcom/google/android/material/datepicker/MonthAdapter;->i:Lcom/google/android/material/datepicker/DateSelector;

    .line 13
    .line 14
    iget-object v3, v1, Lcom/google/android/material/datepicker/MonthAdapter;->h:Lcom/google/android/material/datepicker/Month;

    .line 15
    .line 16
    iget-object v4, v1, Lcom/google/android/material/datepicker/MonthAdapter;->k:Lcom/google/android/material/datepicker/CalendarStyle;

    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/google/android/material/datepicker/MonthAdapter;->a()I

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    invoke-virtual {v0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-virtual {v1}, Lcom/google/android/material/datepicker/MonthAdapter;->c()I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    invoke-virtual {v0}, Landroid/widget/AdapterView;->getLastVisiblePosition()I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    invoke-virtual {v1, v5}, Lcom/google/android/material/datepicker/MonthAdapter;->b(I)Ljava/lang/Long;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    invoke-virtual {v1, v6}, Lcom/google/android/material/datepicker/MonthAdapter;->b(I)Ljava/lang/Long;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    invoke-interface {v2}, Lcom/google/android/material/datepicker/DateSelector;->x()Ljava/util/ArrayList;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 55
    .line 56
    .line 57
    move-result v9

    .line 58
    const/4 v11, 0x0

    .line 59
    :goto_0
    if-ge v11, v9, :cond_10

    .line 60
    .line 61
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v12

    .line 65
    add-int/lit8 v11, v11, 0x1

    .line 66
    .line 67
    check-cast v12, Ll0/b;

    .line 68
    .line 69
    iget-object v13, v12, Ll0/b;->a:Ljava/lang/Object;

    .line 70
    .line 71
    iget-object v12, v12, Ll0/b;->b:Ljava/lang/Object;

    .line 72
    .line 73
    if-eqz v13, :cond_f

    .line 74
    .line 75
    if-nez v12, :cond_0

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    check-cast v13, Ljava/lang/Long;

    .line 79
    .line 80
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 81
    .line 82
    .line 83
    move-result-wide v14

    .line 84
    check-cast v12, Ljava/lang/Long;

    .line 85
    .line 86
    move/from16 v16, v11

    .line 87
    .line 88
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 89
    .line 90
    .line 91
    move-result-wide v10

    .line 92
    if-eqz v7, :cond_1

    .line 93
    .line 94
    if-eqz v8, :cond_1

    .line 95
    .line 96
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 97
    .line 98
    .line 99
    move-result-wide v17

    .line 100
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 101
    .line 102
    .line 103
    move-result-wide v19

    .line 104
    cmp-long v13, v17, v19

    .line 105
    .line 106
    if-gtz v13, :cond_1

    .line 107
    .line 108
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 109
    .line 110
    .line 111
    move-result-wide v12

    .line 112
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 113
    .line 114
    .line 115
    move-result-wide v17

    .line 116
    cmp-long v19, v12, v17

    .line 117
    .line 118
    if-gez v19, :cond_2

    .line 119
    .line 120
    :cond_1
    move-object/from16 v19, v1

    .line 121
    .line 122
    move-object/from16 v17, v2

    .line 123
    .line 124
    move-object v13, v3

    .line 125
    goto/16 :goto_b

    .line 126
    .line 127
    :cond_2
    invoke-static {v0}, Lcom/google/android/material/internal/ViewUtils;->e(Landroid/view/View;)Z

    .line 128
    .line 129
    .line 130
    move-result v12

    .line 131
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 132
    .line 133
    .line 134
    move-result-wide v17

    .line 135
    iget-object v13, v0, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->h:Ljava/util/Calendar;

    .line 136
    .line 137
    cmp-long v20, v14, v17

    .line 138
    .line 139
    if-gez v20, :cond_5

    .line 140
    .line 141
    iget v14, v3, Lcom/google/android/material/datepicker/Month;->k:I

    .line 142
    .line 143
    rem-int v14, v5, v14

    .line 144
    .line 145
    if-nez v14, :cond_3

    .line 146
    .line 147
    const/4 v14, 0x0

    .line 148
    goto :goto_1

    .line 149
    :cond_3
    if-nez v12, :cond_4

    .line 150
    .line 151
    add-int/lit8 v14, v5, -0x1

    .line 152
    .line 153
    invoke-virtual {v0, v14}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b(I)Landroid/view/View;

    .line 154
    .line 155
    .line 156
    move-result-object v14

    .line 157
    invoke-virtual {v14}, Landroid/view/View;->getRight()I

    .line 158
    .line 159
    .line 160
    move-result v14

    .line 161
    goto :goto_1

    .line 162
    :cond_4
    add-int/lit8 v14, v5, -0x1

    .line 163
    .line 164
    invoke-virtual {v0, v14}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b(I)Landroid/view/View;

    .line 165
    .line 166
    .line 167
    move-result-object v14

    .line 168
    invoke-virtual {v14}, Landroid/view/View;->getLeft()I

    .line 169
    .line 170
    .line 171
    move-result v14

    .line 172
    :goto_1
    move v15, v14

    .line 173
    move v14, v5

    .line 174
    goto :goto_2

    .line 175
    :cond_5
    invoke-virtual {v13, v14, v15}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 176
    .line 177
    .line 178
    const/4 v14, 0x5

    .line 179
    invoke-virtual {v13, v14}, Ljava/util/Calendar;->get(I)I

    .line 180
    .line 181
    .line 182
    move-result v15

    .line 183
    add-int/lit8 v15, v15, -0x1

    .line 184
    .line 185
    invoke-virtual {v1}, Lcom/google/android/material/datepicker/MonthAdapter;->a()I

    .line 186
    .line 187
    .line 188
    move-result v14

    .line 189
    add-int/2addr v14, v15

    .line 190
    invoke-virtual {v0, v14}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b(I)Landroid/view/View;

    .line 191
    .line 192
    .line 193
    move-result-object v15

    .line 194
    invoke-virtual {v15}, Landroid/view/View;->getLeft()I

    .line 195
    .line 196
    .line 197
    move-result v17

    .line 198
    invoke-virtual {v15}, Landroid/view/View;->getWidth()I

    .line 199
    .line 200
    .line 201
    move-result v15

    .line 202
    div-int/lit8 v15, v15, 0x2

    .line 203
    .line 204
    add-int v15, v15, v17

    .line 205
    .line 206
    :goto_2
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 207
    .line 208
    .line 209
    move-result-wide v17

    .line 210
    cmp-long v20, v10, v17

    .line 211
    .line 212
    if-lez v20, :cond_8

    .line 213
    .line 214
    add-int/lit8 v10, v6, 0x1

    .line 215
    .line 216
    iget v11, v3, Lcom/google/android/material/datepicker/Month;->k:I

    .line 217
    .line 218
    rem-int/2addr v10, v11

    .line 219
    if-nez v10, :cond_6

    .line 220
    .line 221
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 222
    .line 223
    .line 224
    move-result v10

    .line 225
    goto :goto_3

    .line 226
    :cond_6
    if-nez v12, :cond_7

    .line 227
    .line 228
    invoke-virtual {v0, v6}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b(I)Landroid/view/View;

    .line 229
    .line 230
    .line 231
    move-result-object v10

    .line 232
    invoke-virtual {v10}, Landroid/view/View;->getRight()I

    .line 233
    .line 234
    .line 235
    move-result v10

    .line 236
    goto :goto_3

    .line 237
    :cond_7
    invoke-virtual {v0, v6}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b(I)Landroid/view/View;

    .line 238
    .line 239
    .line 240
    move-result-object v10

    .line 241
    invoke-virtual {v10}, Landroid/view/View;->getLeft()I

    .line 242
    .line 243
    .line 244
    move-result v10

    .line 245
    :goto_3
    move v11, v6

    .line 246
    :goto_4
    move-object/from16 v17, v2

    .line 247
    .line 248
    move-object v13, v3

    .line 249
    goto :goto_5

    .line 250
    :cond_8
    invoke-virtual {v13, v10, v11}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 251
    .line 252
    .line 253
    const/4 v10, 0x5

    .line 254
    invoke-virtual {v13, v10}, Ljava/util/Calendar;->get(I)I

    .line 255
    .line 256
    .line 257
    move-result v10

    .line 258
    add-int/lit8 v10, v10, -0x1

    .line 259
    .line 260
    invoke-virtual {v1}, Lcom/google/android/material/datepicker/MonthAdapter;->a()I

    .line 261
    .line 262
    .line 263
    move-result v11

    .line 264
    add-int/2addr v11, v10

    .line 265
    invoke-virtual {v0, v11}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b(I)Landroid/view/View;

    .line 266
    .line 267
    .line 268
    move-result-object v10

    .line 269
    invoke-virtual {v10}, Landroid/view/View;->getLeft()I

    .line 270
    .line 271
    .line 272
    move-result v13

    .line 273
    invoke-virtual {v10}, Landroid/view/View;->getWidth()I

    .line 274
    .line 275
    .line 276
    move-result v10

    .line 277
    div-int/lit8 v10, v10, 0x2

    .line 278
    .line 279
    add-int/2addr v10, v13

    .line 280
    goto :goto_4

    .line 281
    :goto_5
    invoke-virtual {v1, v14}, Lcom/google/android/material/datepicker/MonthAdapter;->getItemId(I)J

    .line 282
    .line 283
    .line 284
    move-result-wide v2

    .line 285
    long-to-int v3, v2

    .line 286
    move/from16 v18, v3

    .line 287
    .line 288
    invoke-virtual {v1, v11}, Lcom/google/android/material/datepicker/MonthAdapter;->getItemId(I)J

    .line 289
    .line 290
    .line 291
    move-result-wide v2

    .line 292
    long-to-int v3, v2

    .line 293
    move/from16 v2, v18

    .line 294
    .line 295
    :goto_6
    if-gt v2, v3, :cond_e

    .line 296
    .line 297
    invoke-virtual {v0}, Landroid/widget/GridView;->getNumColumns()I

    .line 298
    .line 299
    .line 300
    move-result v18

    .line 301
    move-object/from16 v19, v1

    .line 302
    .line 303
    mul-int v1, v18, v2

    .line 304
    .line 305
    invoke-virtual {v0}, Landroid/widget/GridView;->getNumColumns()I

    .line 306
    .line 307
    .line 308
    move-result v18

    .line 309
    add-int v18, v18, v1

    .line 310
    .line 311
    move/from16 v20, v2

    .line 312
    .line 313
    add-int/lit8 v2, v18, -0x1

    .line 314
    .line 315
    invoke-virtual {v0, v1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b(I)Landroid/view/View;

    .line 316
    .line 317
    .line 318
    move-result-object v18

    .line 319
    invoke-virtual/range {v18 .. v18}, Landroid/view/View;->getTop()I

    .line 320
    .line 321
    .line 322
    move-result v21

    .line 323
    iget-object v0, v4, Lcom/google/android/material/datepicker/CalendarStyle;->a:Lcom/google/android/material/datepicker/CalendarItemStyle;

    .line 324
    .line 325
    iget-object v0, v0, Lcom/google/android/material/datepicker/CalendarItemStyle;->a:Landroid/graphics/Rect;

    .line 326
    .line 327
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 328
    .line 329
    add-int v0, v21, v0

    .line 330
    .line 331
    invoke-virtual/range {v18 .. v18}, Landroid/view/View;->getBottom()I

    .line 332
    .line 333
    .line 334
    move-result v18

    .line 335
    move/from16 v21, v3

    .line 336
    .line 337
    iget-object v3, v4, Lcom/google/android/material/datepicker/CalendarStyle;->a:Lcom/google/android/material/datepicker/CalendarItemStyle;

    .line 338
    .line 339
    iget-object v3, v3, Lcom/google/android/material/datepicker/CalendarItemStyle;->a:Landroid/graphics/Rect;

    .line 340
    .line 341
    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    .line 342
    .line 343
    sub-int v3, v18, v3

    .line 344
    .line 345
    if-nez v12, :cond_b

    .line 346
    .line 347
    if-le v1, v14, :cond_9

    .line 348
    .line 349
    const/4 v1, 0x0

    .line 350
    goto :goto_7

    .line 351
    :cond_9
    move v1, v15

    .line 352
    :goto_7
    if-le v11, v2, :cond_a

    .line 353
    .line 354
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    goto :goto_a

    .line 359
    :cond_a
    move v2, v10

    .line 360
    goto :goto_a

    .line 361
    :cond_b
    if-le v11, v2, :cond_c

    .line 362
    .line 363
    const/4 v2, 0x0

    .line 364
    goto :goto_8

    .line 365
    :cond_c
    move v2, v10

    .line 366
    :goto_8
    if-le v1, v14, :cond_d

    .line 367
    .line 368
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    .line 369
    .line 370
    .line 371
    move-result v1

    .line 372
    goto :goto_9

    .line 373
    :cond_d
    move v1, v15

    .line 374
    :goto_9
    move/from16 v28, v2

    .line 375
    .line 376
    move v2, v1

    .line 377
    move/from16 v1, v28

    .line 378
    .line 379
    :goto_a
    int-to-float v1, v1

    .line 380
    int-to-float v0, v0

    .line 381
    int-to-float v2, v2

    .line 382
    int-to-float v3, v3

    .line 383
    move/from16 v24, v0

    .line 384
    .line 385
    iget-object v0, v4, Lcom/google/android/material/datepicker/CalendarStyle;->h:Landroid/graphics/Paint;

    .line 386
    .line 387
    move-object/from16 v22, p1

    .line 388
    .line 389
    move-object/from16 v27, v0

    .line 390
    .line 391
    move/from16 v23, v1

    .line 392
    .line 393
    move/from16 v25, v2

    .line 394
    .line 395
    move/from16 v26, v3

    .line 396
    .line 397
    invoke-virtual/range {v22 .. v27}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 398
    .line 399
    .line 400
    add-int/lit8 v2, v20, 0x1

    .line 401
    .line 402
    move-object/from16 v0, p0

    .line 403
    .line 404
    move-object/from16 v1, v19

    .line 405
    .line 406
    move/from16 v3, v21

    .line 407
    .line 408
    goto :goto_6

    .line 409
    :cond_e
    move-object/from16 v0, p0

    .line 410
    .line 411
    move-object v3, v13

    .line 412
    move/from16 v11, v16

    .line 413
    .line 414
    move-object/from16 v2, v17

    .line 415
    .line 416
    goto/16 :goto_0

    .line 417
    .line 418
    :goto_b
    move-object/from16 v0, p0

    .line 419
    .line 420
    move-object v3, v13

    .line 421
    move/from16 v11, v16

    .line 422
    .line 423
    move-object/from16 v2, v17

    .line 424
    .line 425
    move-object/from16 v1, v19

    .line 426
    .line 427
    goto/16 :goto_0

    .line 428
    .line 429
    :cond_f
    move/from16 v16, v11

    .line 430
    .line 431
    move-object/from16 v0, p0

    .line 432
    .line 433
    goto/16 :goto_0

    .line 434
    .line 435
    :cond_10
    return-void
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

.method public final onFocusChanged(ZILandroid/graphics/Rect;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    const/16 p1, 0x21

    .line 4
    .line 5
    if-ne p2, p1, :cond_0

    .line 6
    .line 7
    invoke-super {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/google/android/material/datepicker/MonthAdapter;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/google/android/material/datepicker/MonthAdapter;->c()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->setSelection(I)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const/16 p1, 0x82

    .line 22
    .line 23
    if-ne p2, p1, :cond_1

    .line 24
    .line 25
    invoke-super {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Lcom/google/android/material/datepicker/MonthAdapter;

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/google/android/material/datepicker/MonthAdapter;->a()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->setSelection(I)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    const/4 p1, 0x1

    .line 40
    invoke-super {p0, p1, p2, p3}, Landroid/widget/GridView;->onFocusChanged(ZILandroid/graphics/Rect;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    const/4 p1, 0x0

    .line 45
    invoke-super {p0, p1, p2, p3}, Landroid/widget/GridView;->onFocusChanged(ZILandroid/graphics/Rect;)V

    .line 46
    .line 47
    .line 48
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

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/GridView;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    const/4 v1, -0x1

    .line 14
    const/4 v2, 0x1

    .line 15
    if-eq p2, v1, :cond_3

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    invoke-super {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lcom/google/android/material/datepicker/MonthAdapter;

    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/google/android/material/datepicker/MonthAdapter;->a()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-lt p2, v1, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/16 p2, 0x13

    .line 35
    .line 36
    if-ne p2, p1, :cond_2

    .line 37
    .line 38
    invoke-super {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Lcom/google/android/material/datepicker/MonthAdapter;

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/google/android/material/datepicker/MonthAdapter;->a()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->setSelection(I)V

    .line 49
    .line 50
    .line 51
    return v2

    .line 52
    :cond_2
    return v0

    .line 53
    :cond_3
    :goto_0
    return v2
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

.method public final onMeasure(II)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const p2, 0xffffff

    .line 6
    .line 7
    .line 8
    const/high16 v0, -0x80000000

    .line 9
    .line 10
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    invoke-super {p0, p1, p2}, Landroid/widget/GridView;->onMeasure(II)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    iput p2, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/GridView;->onMeasure(II)V

    .line 29
    .line 30
    .line 31
    return-void
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

.method public final bridge synthetic setAdapter(Landroid/widget/Adapter;)V
    .locals 0

    .line 1
    check-cast p1, Landroid/widget/ListAdapter;

    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method

.method public final setAdapter(Landroid/widget/ListAdapter;)V
    .locals 4

    .line 2
    instance-of v0, p1, Lcom/google/android/material/datepicker/MonthAdapter;

    if-eqz v0, :cond_0

    .line 3
    invoke-super {p0, p1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-class v0, Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/google/android/material/datepicker/MonthAdapter;

    .line 6
    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    .line 7
    const-string v0, "%1$s must have its Adapter set to a %2$s"

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setSelection(I)V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/google/android/material/datepicker/MonthAdapter;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/google/android/material/datepicker/MonthAdapter;->a()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-ge p1, v0, :cond_0

    .line 12
    .line 13
    invoke-super {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lcom/google/android/material/datepicker/MonthAdapter;

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/google/android/material/datepicker/MonthAdapter;->a()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-super {p0, p1}, Landroid/widget/GridView;->setSelection(I)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/GridView;->setSelection(I)V

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
