.class Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lcom/google/android/material/timepicker/TimePickerView$OnSelectionChange;
.implements Lcom/google/android/material/timepicker/TimePickerPresenter;


# instance fields
.field public final h:Landroid/widget/LinearLayout;

.field public final i:Lcom/google/android/material/timepicker/TimeModel;

.field public final j:Landroid/text/TextWatcher;

.field public final k:Landroid/text/TextWatcher;

.field public final l:Lcom/google/android/material/timepicker/ChipTextInputComboView;

.field public final m:Lcom/google/android/material/timepicker/ChipTextInputComboView;

.field public final n:Landroid/widget/EditText;

.field public final o:Landroid/widget/EditText;

.field public final p:Lcom/google/android/material/button/MaterialButtonToggleGroup;


# direct methods
.method public constructor <init>(Landroid/widget/LinearLayout;Lcom/google/android/material/timepicker/TimeModel;)V
    .locals 12

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter$1;-><init>(Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->j:Landroid/text/TextWatcher;

    .line 10
    .line 11
    new-instance v1, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter$2;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter$2;-><init>(Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->k:Landroid/text/TextWatcher;

    .line 17
    .line 18
    iput-object p1, p0, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->h:Landroid/widget/LinearLayout;

    .line 19
    .line 20
    iput-object p2, p0, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->i:Lcom/google/android/material/timepicker/TimeModel;

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    sget v3, Lcom/google/android/material/R$id;->material_minute_text_input:I

    .line 27
    .line 28
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Lcom/google/android/material/timepicker/ChipTextInputComboView;

    .line 33
    .line 34
    iput-object v3, p0, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->l:Lcom/google/android/material/timepicker/ChipTextInputComboView;

    .line 35
    .line 36
    sget v4, Lcom/google/android/material/R$id;->material_hour_text_input:I

    .line 37
    .line 38
    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    check-cast v4, Lcom/google/android/material/timepicker/ChipTextInputComboView;

    .line 43
    .line 44
    iput-object v4, p0, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->m:Lcom/google/android/material/timepicker/ChipTextInputComboView;

    .line 45
    .line 46
    sget v5, Lcom/google/android/material/R$id;->material_label:I

    .line 47
    .line 48
    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    iget-object v6, v3, Lcom/google/android/material/timepicker/ChipTextInputComboView;->i:Lcom/google/android/material/textfield/TextInputLayout;

    .line 53
    .line 54
    check-cast v5, Landroid/widget/TextView;

    .line 55
    .line 56
    sget v7, Lcom/google/android/material/R$id;->material_label:I

    .line 57
    .line 58
    invoke-virtual {v4, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    iget-object v8, v4, Lcom/google/android/material/timepicker/ChipTextInputComboView;->i:Lcom/google/android/material/textfield/TextInputLayout;

    .line 63
    .line 64
    check-cast v7, Landroid/widget/TextView;

    .line 65
    .line 66
    sget v9, Lcom/google/android/material/R$string;->material_timepicker_minute:I

    .line 67
    .line 68
    invoke-virtual {v2, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v9

    .line 72
    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 73
    .line 74
    .line 75
    sget v5, Lcom/google/android/material/R$string;->material_timepicker_hour:I

    .line 76
    .line 77
    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 82
    .line 83
    .line 84
    sget v2, Lcom/google/android/material/R$id;->selection_type:I

    .line 85
    .line 86
    const/16 v5, 0xc

    .line 87
    .line 88
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    invoke-virtual {v3, v2, v5}, Lcom/google/android/material/timepicker/ChipTextInputComboView;->setTag(ILjava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    sget v2, Lcom/google/android/material/R$id;->selection_type:I

    .line 96
    .line 97
    const/16 v5, 0xa

    .line 98
    .line 99
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-virtual {v4, v2, v5}, Lcom/google/android/material/timepicker/ChipTextInputComboView;->setTag(ILjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    iget v2, p2, Lcom/google/android/material/timepicker/TimeModel;->j:I

    .line 107
    .line 108
    if-nez v2, :cond_0

    .line 109
    .line 110
    sget v2, Lcom/google/android/material/R$id;->material_clock_period_toggle:I

    .line 111
    .line 112
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    check-cast v2, Lcom/google/android/material/button/MaterialButtonToggleGroup;

    .line 117
    .line 118
    iput-object v2, p0, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->p:Lcom/google/android/material/button/MaterialButtonToggleGroup;

    .line 119
    .line 120
    new-instance v5, Lcom/google/android/material/timepicker/c;

    .line 121
    .line 122
    const/4 v7, 0x0

    .line 123
    invoke-direct {v5, v7, p0}, Lcom/google/android/material/timepicker/c;-><init>(ILjava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    iget-object v2, v2, Lcom/google/android/material/button/MaterialButtonToggleGroup;->j:Ljava/util/LinkedHashSet;

    .line 127
    .line 128
    invoke-virtual {v2, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    iget-object v2, p0, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->p:Lcom/google/android/material/button/MaterialButtonToggleGroup;

    .line 132
    .line 133
    const/4 v5, 0x0

    .line 134
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->f()V

    .line 138
    .line 139
    .line 140
    :cond_0
    new-instance v2, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter$3;

    .line 141
    .line 142
    invoke-direct {v2, p0}, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter$3;-><init>(Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v4, v2}, Lcom/google/android/material/timepicker/ChipTextInputComboView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v3, v2}, Lcom/google/android/material/timepicker/ChipTextInputComboView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 149
    .line 150
    .line 151
    iget-object v2, p2, Lcom/google/android/material/timepicker/TimeModel;->i:Lcom/google/android/material/timepicker/MaxInputValidator;

    .line 152
    .line 153
    iget-object v5, v4, Lcom/google/android/material/timepicker/ChipTextInputComboView;->j:Landroid/widget/EditText;

    .line 154
    .line 155
    invoke-virtual {v5}, Landroid/widget/TextView;->getFilters()[Landroid/text/InputFilter;

    .line 156
    .line 157
    .line 158
    move-result-object v7

    .line 159
    array-length v9, v7

    .line 160
    add-int/lit8 v9, v9, 0x1

    .line 161
    .line 162
    invoke-static {v7, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v9

    .line 166
    check-cast v9, [Landroid/text/InputFilter;

    .line 167
    .line 168
    array-length v7, v7

    .line 169
    aput-object v2, v9, v7

    .line 170
    .line 171
    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    .line 172
    .line 173
    .line 174
    iget-object v2, p2, Lcom/google/android/material/timepicker/TimeModel;->h:Lcom/google/android/material/timepicker/MaxInputValidator;

    .line 175
    .line 176
    iget-object v5, v3, Lcom/google/android/material/timepicker/ChipTextInputComboView;->j:Landroid/widget/EditText;

    .line 177
    .line 178
    invoke-virtual {v5}, Landroid/widget/TextView;->getFilters()[Landroid/text/InputFilter;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    array-length v9, v7

    .line 183
    add-int/lit8 v9, v9, 0x1

    .line 184
    .line 185
    invoke-static {v7, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    check-cast v9, [Landroid/text/InputFilter;

    .line 190
    .line 191
    array-length v7, v7

    .line 192
    aput-object v2, v9, v7

    .line 193
    .line 194
    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v8}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    iput-object v2, p0, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->n:Landroid/widget/EditText;

    .line 202
    .line 203
    invoke-virtual {v6}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    iput-object v5, p0, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->o:Landroid/widget/EditText;

    .line 208
    .line 209
    new-instance v7, Lcom/google/android/material/timepicker/TimePickerTextInputKeyController;

    .line 210
    .line 211
    invoke-direct {v7, v4, v3, p2}, Lcom/google/android/material/timepicker/TimePickerTextInputKeyController;-><init>(Lcom/google/android/material/timepicker/ChipTextInputComboView;Lcom/google/android/material/timepicker/ChipTextInputComboView;Lcom/google/android/material/timepicker/TimeModel;)V

    .line 212
    .line 213
    .line 214
    new-instance v9, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter$4;

    .line 215
    .line 216
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 217
    .line 218
    .line 219
    move-result-object v10

    .line 220
    sget v11, Lcom/google/android/material/R$string;->material_hour_selection:I

    .line 221
    .line 222
    invoke-direct {v9, v10, v11, p2}, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter$4;-><init>(Landroid/content/Context;ILcom/google/android/material/timepicker/TimeModel;)V

    .line 223
    .line 224
    .line 225
    iget-object v4, v4, Lcom/google/android/material/timepicker/ChipTextInputComboView;->h:Lcom/google/android/material/chip/Chip;

    .line 226
    .line 227
    invoke-static {v4, v9}, Lm0/w0;->q(Landroid/view/View;Lm0/b;)V

    .line 228
    .line 229
    .line 230
    new-instance v4, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter$5;

    .line 231
    .line 232
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    sget v9, Lcom/google/android/material/R$string;->material_minute_selection:I

    .line 237
    .line 238
    invoke-direct {v4, p1, v9, p2}, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter$5;-><init>(Landroid/content/Context;ILcom/google/android/material/timepicker/TimeModel;)V

    .line 239
    .line 240
    .line 241
    iget-object p1, v3, Lcom/google/android/material/timepicker/ChipTextInputComboView;->h:Lcom/google/android/material/chip/Chip;

    .line 242
    .line 243
    invoke-static {p1, v4}, Lm0/w0;->q(Landroid/view/View;Lm0/b;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {p0, p2}, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->e(Lcom/google/android/material/timepicker/TimeModel;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v8}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    invoke-virtual {v6}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    .line 260
    .line 261
    .line 262
    move-result-object p2

    .line 263
    const v0, 0x10000005

    .line 264
    .line 265
    .line 266
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setImeOptions(I)V

    .line 267
    .line 268
    .line 269
    const v0, 0x10000006

    .line 270
    .line 271
    .line 272
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setImeOptions(I)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {p1, v7}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {p1, v7}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {p2, v7}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 282
    .line 283
    .line 284
    return-void
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
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->h:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->i:Lcom/google/android/material/timepicker/TimeModel;

    .line 8
    .line 9
    iget v0, v0, Lcom/google/android/material/timepicker/TimeModel;->m:I

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->b(I)V

    .line 12
    .line 13
    .line 14
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
.end method

.method public final b(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->i:Lcom/google/android/material/timepicker/TimeModel;

    .line 2
    .line 3
    iput p1, v0, Lcom/google/android/material/timepicker/TimeModel;->m:I

    .line 4
    .line 5
    const/16 v0, 0xc

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    iget-object v3, p0, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->l:Lcom/google/android/material/timepicker/ChipTextInputComboView;

    .line 15
    .line 16
    invoke-virtual {v3, v0}, Lcom/google/android/material/timepicker/ChipTextInputComboView;->setChecked(Z)V

    .line 17
    .line 18
    .line 19
    const/16 v0, 0xa

    .line 20
    .line 21
    if-ne p1, v0, :cond_1

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    :cond_1
    iget-object p1, p0, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->m:Lcom/google/android/material/timepicker/ChipTextInputComboView;

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Lcom/google/android/material/timepicker/ChipTextInputComboView;->setChecked(Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->f()V

    .line 30
    .line 31
    .line 32
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final c()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->h:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const-class v3, Landroid/view/inputmethod/InputMethodManager;

    .line 14
    .line 15
    invoke-static {v2, v3}, Lq3/a;->J(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-virtual {v2, v1, v3}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    const/16 v1, 0x8

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 34
    .line 35
    .line 36
    return-void
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

.method public final d()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->i:Lcom/google/android/material/timepicker/TimeModel;

    .line 2
    .line 3
    iget v1, v0, Lcom/google/android/material/timepicker/TimeModel;->m:I

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v1, 0x0

    .line 14
    :goto_0
    iget-object v2, p0, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->l:Lcom/google/android/material/timepicker/ChipTextInputComboView;

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Lcom/google/android/material/timepicker/ChipTextInputComboView;->setChecked(Z)V

    .line 17
    .line 18
    .line 19
    iget v0, v0, Lcom/google/android/material/timepicker/TimeModel;->m:I

    .line 20
    .line 21
    const/16 v1, 0xa

    .line 22
    .line 23
    if-ne v0, v1, :cond_1

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    :cond_1
    iget-object v0, p0, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->m:Lcom/google/android/material/timepicker/ChipTextInputComboView;

    .line 27
    .line 28
    invoke-virtual {v0, v3}, Lcom/google/android/material/timepicker/ChipTextInputComboView;->setChecked(Z)V

    .line 29
    .line 30
    .line 31
    return-void
    .line 32
    .line 33
.end method

.method public final e(Lcom/google/android/material/timepicker/TimeModel;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->n:Landroid/widget/EditText;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->k:Landroid/text/TextWatcher;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->o:Landroid/widget/EditText;

    .line 9
    .line 10
    iget-object v3, p0, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->j:Landroid/text/TextWatcher;

    .line 11
    .line 12
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 13
    .line 14
    .line 15
    iget-object v4, p0, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->h:Landroid/widget/LinearLayout;

    .line 16
    .line 17
    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    iget-object v4, v4, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 26
    .line 27
    iget v5, p1, Lcom/google/android/material/timepicker/TimeModel;->l:I

    .line 28
    .line 29
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    const/4 v6, 0x1

    .line 34
    new-array v7, v6, [Ljava/lang/Object;

    .line 35
    .line 36
    const/4 v8, 0x0

    .line 37
    aput-object v5, v7, v8

    .line 38
    .line 39
    const-string v5, "%02d"

    .line 40
    .line 41
    invoke-static {v4, v5, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    invoke-virtual {p1}, Lcom/google/android/material/timepicker/TimeModel;->c()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    new-array v6, v6, [Ljava/lang/Object;

    .line 54
    .line 55
    aput-object p1, v6, v8

    .line 56
    .line 57
    invoke-static {v4, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iget-object v4, p0, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->l:Lcom/google/android/material/timepicker/ChipTextInputComboView;

    .line 62
    .line 63
    iget-object v6, v4, Lcom/google/android/material/timepicker/ChipTextInputComboView;->k:Landroid/text/TextWatcher;

    .line 64
    .line 65
    iget-object v8, v4, Lcom/google/android/material/timepicker/ChipTextInputComboView;->j:Landroid/widget/EditText;

    .line 66
    .line 67
    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 68
    .line 69
    .line 70
    move-result-object v9

    .line 71
    invoke-static {v9, v7, v5}, Lcom/google/android/material/timepicker/TimeModel;->b(Landroid/content/res/Resources;Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    iget-object v4, v4, Lcom/google/android/material/timepicker/ChipTextInputComboView;->h:Lcom/google/android/material/chip/Chip;

    .line 76
    .line 77
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-nez v4, :cond_0

    .line 85
    .line 86
    invoke-virtual {v8, v6}, Landroid/widget/TextView;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v8, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v8, v6}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 93
    .line 94
    .line 95
    :cond_0
    iget-object v4, p0, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->m:Lcom/google/android/material/timepicker/ChipTextInputComboView;

    .line 96
    .line 97
    iget-object v6, v4, Lcom/google/android/material/timepicker/ChipTextInputComboView;->k:Landroid/text/TextWatcher;

    .line 98
    .line 99
    iget-object v7, v4, Lcom/google/android/material/timepicker/ChipTextInputComboView;->j:Landroid/widget/EditText;

    .line 100
    .line 101
    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    invoke-static {v8, p1, v5}, Lcom/google/android/material/timepicker/TimeModel;->b(Landroid/content/res/Resources;Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    iget-object v4, v4, Lcom/google/android/material/timepicker/ChipTextInputComboView;->h:Lcom/google/android/material/chip/Chip;

    .line 110
    .line 111
    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 112
    .line 113
    .line 114
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-nez v4, :cond_1

    .line 119
    .line 120
    invoke-virtual {v7, v6}, Landroid/widget/TextView;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v7, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v7, v6}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 127
    .line 128
    .line 129
    :cond_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->f()V

    .line 136
    .line 137
    .line 138
    return-void
    .line 139
    .line 140
.end method

.method public final f()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->p:Lcom/google/android/material/button/MaterialButtonToggleGroup;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v1, p0, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->i:Lcom/google/android/material/timepicker/TimeModel;

    .line 7
    .line 8
    iget v1, v1, Lcom/google/android/material/timepicker/TimeModel;->n:I

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    sget v1, Lcom/google/android/material/R$id;->material_clock_period_am_button:I

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    sget v1, Lcom/google/android/material/R$id;->material_clock_period_pm_button:I

    .line 16
    .line 17
    :goto_0
    const/4 v2, 0x1

    .line 18
    invoke-virtual {v0, v1, v2}, Lcom/google/android/material/button/MaterialButtonToggleGroup;->b(IZ)V

    .line 19
    .line 20
    .line 21
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

.method public final invalidate()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->i:Lcom/google/android/material/timepicker/TimeModel;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/google/android/material/timepicker/TimePickerTextInputPresenter;->e(Lcom/google/android/material/timepicker/TimeModel;)V

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
.end method
