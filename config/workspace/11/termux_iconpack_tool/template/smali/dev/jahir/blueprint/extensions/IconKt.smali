.class public final Ldev/jahir/blueprint/extensions/IconKt;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# direct methods
.method public static final pickIcon(Landroidx/fragment/app/q0;Ldev/jahir/blueprint/data/models/Icon;Landroid/graphics/drawable/Drawable;I)V
    .locals 10

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "icon"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Landroid/content/Intent;

    .line 12
    .line 13
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    const/4 v3, 0x0

    .line 18
    :try_start_0
    instance-of v4, p2, Landroid/graphics/drawable/BitmapDrawable;

    .line 19
    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    check-cast p2, Landroid/graphics/drawable/BitmapDrawable;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catch_0
    nop

    .line 26
    goto :goto_3

    .line 27
    :cond_0
    move-object p2, v3

    .line 28
    :goto_0
    if-eqz p2, :cond_2

    .line 29
    .line 30
    invoke-virtual {p2}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    if-nez p2, :cond_1

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_1
    :goto_1
    move-object v3, p2

    .line 38
    goto :goto_3

    .line 39
    :cond_2
    :goto_2
    invoke-virtual {p1}, Ldev/jahir/blueprint/data/models/Icon;->getResId()I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    invoke-static {p0, p2, v3, v2, v3}, Ldev/jahir/frames/extensions/context/ContextKt;->drawable$default(Landroid/content/Context;ILandroid/graphics/drawable/Drawable;ILjava/lang/Object;)Landroid/graphics/drawable/Drawable;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    if-eqz p2, :cond_3

    .line 48
    .line 49
    invoke-static {p2, p0}, Ldev/jahir/blueprint/extensions/AdaptiveIconKt;->asAdaptive(Landroid/graphics/drawable/Drawable;Landroid/content/Context;)Lp4/f;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    if-eqz p2, :cond_3

    .line 54
    .line 55
    iget-object p2, p2, Lp4/f;->h:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p2, Landroid/graphics/drawable/Drawable;

    .line 58
    .line 59
    if-eqz p2, :cond_3

    .line 60
    .line 61
    invoke-static {p2}, Le6/l;->I(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    goto :goto_1

    .line 66
    :cond_3
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-virtual {p1}, Ldev/jahir/blueprint/data/models/Icon;->getResId()I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    invoke-static {p2, v4}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    .line 75
    .line 76
    .line 77
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    goto :goto_1

    .line 79
    :goto_3
    move-object v4, v3

    .line 80
    const/4 p2, 0x0

    .line 81
    if-eqz v4, :cond_a

    .line 82
    .line 83
    const/4 v3, 0x1

    .line 84
    if-eq p3, v3, :cond_6

    .line 85
    .line 86
    if-eq p3, v2, :cond_4

    .line 87
    .line 88
    move-object v5, p0

    .line 89
    goto :goto_5

    .line 90
    :cond_4
    invoke-virtual {p1}, Ldev/jahir/blueprint/data/models/Icon;->getName()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    const/4 v8, 0x4

    .line 95
    const/4 v9, 0x0

    .line 96
    const/4 v7, 0x0

    .line 97
    move-object v5, p0

    .line 98
    invoke-static/range {v4 .. v9}, Ldev/jahir/blueprint/extensions/BitmapKt;->getUri$default(Landroid/graphics/Bitmap;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Landroid/net/Uri;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    if-eqz p0, :cond_5

    .line 103
    .line 104
    const-string p1, "android.intent.extra.STREAM"

    .line 105
    .line 106
    invoke-virtual {v1, p1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, p0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 113
    .line 114
    .line 115
    :cond_5
    const-string p0, "return-data"

    .line 116
    .line 117
    invoke-virtual {v1, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 118
    .line 119
    .line 120
    goto :goto_5

    .line 121
    :cond_6
    move-object v5, p0

    .line 122
    :try_start_1
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    if-eqz p0, :cond_7

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_7
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    if-eqz p0, :cond_9

    .line 134
    .line 135
    invoke-virtual {v4, p0, p2}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    if-nez p0, :cond_8

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_8
    move-object v4, p0

    .line 143
    :cond_9
    :goto_4
    invoke-virtual {v1, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-static {p0}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 148
    .line 149
    .line 150
    :catch_1
    invoke-virtual {p1}, Ldev/jahir/blueprint/data/models/Icon;->getResId()I

    .line 151
    .line 152
    .line 153
    move-result p0

    .line 154
    invoke-static {v5, p0}, Landroid/content/Intent$ShortcutIconResource;->fromContext(Landroid/content/Context;I)Landroid/content/Intent$ShortcutIconResource;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    const-string p1, "android.intent.extra.shortcut.ICON_RESOURCE"

    .line 159
    .line 160
    invoke-virtual {v1, p1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 161
    .line 162
    .line 163
    :goto_5
    const-string p0, "picker_key"

    .line 164
    .line 165
    invoke-virtual {v1, p0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 166
    .line 167
    .line 168
    const/4 p0, -0x1

    .line 169
    invoke-virtual {v5, p0, v1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 170
    .line 171
    .line 172
    goto :goto_6

    .line 173
    :cond_a
    move-object v5, p0

    .line 174
    invoke-virtual {v5, p2, v1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 175
    .line 176
    .line 177
    :goto_6
    invoke-virtual {v5}, Landroid/app/Activity;->finish()V

    .line 178
    .line 179
    .line 180
    return-void
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
