.class Lcom/google/android/material/textfield/MaterialAutoCompleteTextView$1;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic h:Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/material/textfield/MaterialAutoCompleteTextView$1;->h:Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;

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
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 9

    .line 1
    iget-object p1, p0, Lcom/google/android/material/textfield/MaterialAutoCompleteTextView$1;->h:Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;

    .line 2
    .line 3
    iget-object v0, p1, Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;->l:Landroidx/appcompat/widget/r2;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-gez p3, :cond_1

    .line 7
    .line 8
    iget-object v2, v0, Landroidx/appcompat/widget/r2;->G:Landroidx/appcompat/widget/h0;

    .line 9
    .line 10
    invoke-virtual {v2}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    move-object v2, v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v2, v0, Landroidx/appcompat/widget/r2;->j:Landroidx/appcompat/widget/e2;

    .line 19
    .line 20
    invoke-virtual {v2}, Landroid/widget/AdapterView;->getSelectedItem()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->getAdapter()Landroid/widget/ListAdapter;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v2, p3}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    :goto_0
    invoke-static {p1, v2}, Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;->a(Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    if-eqz v3, :cond_7

    .line 41
    .line 42
    if-eqz p2, :cond_3

    .line 43
    .line 44
    if-gez p3, :cond_2

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    :goto_1
    move-object v5, p2

    .line 48
    move v6, p3

    .line 49
    move-wide v7, p4

    .line 50
    goto :goto_5

    .line 51
    :cond_3
    :goto_2
    iget-object p1, v0, Landroidx/appcompat/widget/r2;->G:Landroidx/appcompat/widget/h0;

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-nez p1, :cond_4

    .line 58
    .line 59
    move-object p2, v1

    .line 60
    goto :goto_3

    .line 61
    :cond_4
    iget-object p1, v0, Landroidx/appcompat/widget/r2;->j:Landroidx/appcompat/widget/e2;

    .line 62
    .line 63
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getSelectedView()Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    move-object p2, p1

    .line 68
    :goto_3
    iget-object p1, v0, Landroidx/appcompat/widget/r2;->G:Landroidx/appcompat/widget/h0;

    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-nez p1, :cond_5

    .line 75
    .line 76
    const/4 p1, -0x1

    .line 77
    const/4 p3, -0x1

    .line 78
    goto :goto_4

    .line 79
    :cond_5
    iget-object p1, v0, Landroidx/appcompat/widget/r2;->j:Landroidx/appcompat/widget/e2;

    .line 80
    .line 81
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    move p3, p1

    .line 86
    :goto_4
    iget-object p1, v0, Landroidx/appcompat/widget/r2;->G:Landroidx/appcompat/widget/h0;

    .line 87
    .line 88
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-nez p1, :cond_6

    .line 93
    .line 94
    const-wide/high16 p4, -0x8000000000000000L

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_6
    iget-object p1, v0, Landroidx/appcompat/widget/r2;->j:Landroidx/appcompat/widget/e2;

    .line 98
    .line 99
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getSelectedItemId()J

    .line 100
    .line 101
    .line 102
    move-result-wide p4

    .line 103
    goto :goto_1

    .line 104
    :goto_5
    iget-object v4, v0, Landroidx/appcompat/widget/r2;->j:Landroidx/appcompat/widget/e2;

    .line 105
    .line 106
    invoke-interface/range {v3 .. v8}, Landroid/widget/AdapterView$OnItemClickListener;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 107
    .line 108
    .line 109
    :cond_7
    invoke-virtual {v0}, Landroidx/appcompat/widget/r2;->dismiss()V

    .line 110
    .line 111
    .line 112
    return-void
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
.end method
