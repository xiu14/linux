.class public final Lk/h;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public A:Ljava/lang/CharSequence;

.field public B:Ljava/lang/CharSequence;

.field public C:Landroid/content/res/ColorStateList;

.field public D:Landroid/graphics/PorterDuff$Mode;

.field public final synthetic E:Lk/i;

.field public final a:Landroid/view/Menu;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:I

.field public j:I

.field public k:Ljava/lang/CharSequence;

.field public l:Ljava/lang/CharSequence;

.field public m:I

.field public n:C

.field public o:I

.field public p:C

.field public q:I

.field public r:I

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:I

.field public w:I

.field public x:Ljava/lang/String;

.field public y:Ljava/lang/String;

.field public z:Ll/p;


# direct methods
.method public constructor <init>(Lk/i;Landroid/view/Menu;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk/h;->E:Lk/i;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lk/h;->C:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    iput-object p1, p0, Lk/h;->D:Landroid/graphics/PorterDuff$Mode;

    .line 10
    .line 11
    iput-object p2, p0, Lk/h;->a:Landroid/view/Menu;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput p1, p0, Lk/h;->b:I

    .line 15
    .line 16
    iput p1, p0, Lk/h;->c:I

    .line 17
    .line 18
    iput p1, p0, Lk/h;->d:I

    .line 19
    .line 20
    iput p1, p0, Lk/h;->e:I

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Lk/h;->f:Z

    .line 24
    .line 25
    iput-boolean p1, p0, Lk/h;->g:Z

    .line 26
    .line 27
    return-void
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


# virtual methods
.method public final a(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lk/h;->E:Lk/i;

    .line 2
    .line 3
    iget-object v0, v0, Lk/i;->c:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {p1, v1, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    const/4 v0, 0x1

    .line 19
    invoke-virtual {p2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2, p3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    return-object p1

    .line 27
    :catch_0
    move-exception p2

    .line 28
    new-instance p3, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v0, "Cannot instantiate class: "

    .line 31
    .line 32
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const-string p3, "SupportMenuInflater"

    .line 43
    .line 44
    invoke-static {p3, p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    return-object p1
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

.method public final b(Landroid/view/MenuItem;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lk/h;->E:Lk/i;

    .line 2
    .line 3
    iget-object v1, v0, Lk/i;->c:Landroid/content/Context;

    .line 4
    .line 5
    iget-boolean v2, p0, Lk/h;->s:Z

    .line 6
    .line 7
    invoke-interface {p1, v2}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-boolean v3, p0, Lk/h;->t:Z

    .line 12
    .line 13
    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-boolean v3, p0, Lk/h;->u:Z

    .line 18
    .line 19
    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget v3, p0, Lk/h;->r:I

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x1

    .line 27
    if-lt v3, v5, :cond_0

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v3, 0x0

    .line 32
    :goto_0
    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    iget-object v3, p0, Lk/h;->l:Ljava/lang/CharSequence;

    .line 37
    .line 38
    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    iget v3, p0, Lk/h;->m:I

    .line 43
    .line 44
    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 45
    .line 46
    .line 47
    iget v2, p0, Lk/h;->v:I

    .line 48
    .line 49
    if-ltz v2, :cond_1

    .line 50
    .line 51
    invoke-interface {p1, v2}, Landroid/view/MenuItem;->setShowAsAction(I)V

    .line 52
    .line 53
    .line 54
    :cond_1
    iget-object v2, p0, Lk/h;->y:Ljava/lang/String;

    .line 55
    .line 56
    if-eqz v2, :cond_4

    .line 57
    .line 58
    invoke-virtual {v1}, Landroid/content/Context;->isRestricted()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-nez v2, :cond_3

    .line 63
    .line 64
    new-instance v2, Lk/g;

    .line 65
    .line 66
    iget-object v3, v0, Lk/i;->d:Ljava/lang/Object;

    .line 67
    .line 68
    if-nez v3, :cond_2

    .line 69
    .line 70
    invoke-static {v1}, Lk/i;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iput-object v1, v0, Lk/i;->d:Ljava/lang/Object;

    .line 75
    .line 76
    :cond_2
    iget-object v1, v0, Lk/i;->d:Ljava/lang/Object;

    .line 77
    .line 78
    iget-object v3, p0, Lk/h;->y:Ljava/lang/String;

    .line 79
    .line 80
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 81
    .line 82
    .line 83
    iput-object v1, v2, Lk/g;->h:Ljava/lang/Object;

    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    :try_start_0
    sget-object v6, Lk/g;->j:[Ljava/lang/Class;

    .line 90
    .line 91
    invoke-virtual {v1, v3, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    iput-object v6, v2, Lk/g;->i:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 96
    .line 97
    invoke-interface {p1, v2}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :catch_0
    move-exception p1

    .line 102
    new-instance v0, Landroid/view/InflateException;

    .line 103
    .line 104
    const-string v2, "Couldn\'t resolve menu item onClick handler "

    .line 105
    .line 106
    const-string v4, " in class "

    .line 107
    .line 108
    invoke-static {v2, v3, v4}, Landroidx/appcompat/app/b;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-direct {v0, v1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 127
    .line 128
    .line 129
    throw v0

    .line 130
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 131
    .line 132
    const-string v0, "The android:onClick attribute cannot be used within a restricted context"

    .line 133
    .line 134
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    throw p1

    .line 138
    :cond_4
    :goto_1
    iget v1, p0, Lk/h;->r:I

    .line 139
    .line 140
    const/4 v2, 0x2

    .line 141
    if-lt v1, v2, :cond_7

    .line 142
    .line 143
    instance-of v1, p1, Ll/o;

    .line 144
    .line 145
    if-eqz v1, :cond_5

    .line 146
    .line 147
    move-object v1, p1

    .line 148
    check-cast v1, Ll/o;

    .line 149
    .line 150
    invoke-virtual {v1, v5}, Ll/o;->f(Z)V

    .line 151
    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_5
    instance-of v1, p1, Ll/t;

    .line 155
    .line 156
    if-eqz v1, :cond_7

    .line 157
    .line 158
    move-object v1, p1

    .line 159
    check-cast v1, Ll/t;

    .line 160
    .line 161
    iget-object v2, v1, Ll/t;->c:Lg0/a;

    .line 162
    .line 163
    :try_start_1
    iget-object v3, v1, Ll/t;->d:Ljava/lang/reflect/Method;

    .line 164
    .line 165
    if-nez v3, :cond_6

    .line 166
    .line 167
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    const-string v6, "setExclusiveCheckable"

    .line 172
    .line 173
    new-array v7, v5, [Ljava/lang/Class;

    .line 174
    .line 175
    sget-object v8, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 176
    .line 177
    aput-object v8, v7, v4

    .line 178
    .line 179
    invoke-virtual {v3, v6, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    iput-object v3, v1, Ll/t;->d:Ljava/lang/reflect/Method;

    .line 184
    .line 185
    goto :goto_2

    .line 186
    :catch_1
    move-exception v1

    .line 187
    goto :goto_3

    .line 188
    :cond_6
    :goto_2
    iget-object v1, v1, Ll/t;->d:Ljava/lang/reflect/Method;

    .line 189
    .line 190
    new-array v3, v5, [Ljava/lang/Object;

    .line 191
    .line 192
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 193
    .line 194
    aput-object v6, v3, v4

    .line 195
    .line 196
    invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 197
    .line 198
    .line 199
    goto :goto_4

    .line 200
    :goto_3
    const-string v2, "MenuItemWrapper"

    .line 201
    .line 202
    const-string v3, "Error while calling setExclusiveCheckable"

    .line 203
    .line 204
    invoke-static {v2, v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 205
    .line 206
    .line 207
    :cond_7
    :goto_4
    iget-object v1, p0, Lk/h;->x:Ljava/lang/String;

    .line 208
    .line 209
    if-eqz v1, :cond_8

    .line 210
    .line 211
    sget-object v2, Lk/i;->e:[Ljava/lang/Class;

    .line 212
    .line 213
    iget-object v0, v0, Lk/i;->a:[Ljava/lang/Object;

    .line 214
    .line 215
    invoke-virtual {p0, v1, v2, v0}, Lk/h;->a(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    check-cast v0, Landroid/view/View;

    .line 220
    .line 221
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setActionView(Landroid/view/View;)Landroid/view/MenuItem;

    .line 222
    .line 223
    .line 224
    const/4 v4, 0x1

    .line 225
    :cond_8
    iget v0, p0, Lk/h;->w:I

    .line 226
    .line 227
    if-lez v0, :cond_a

    .line 228
    .line 229
    if-nez v4, :cond_9

    .line 230
    .line 231
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setActionView(I)Landroid/view/MenuItem;

    .line 232
    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_9
    const-string v0, "SupportMenuInflater"

    .line 236
    .line 237
    const-string v1, "Ignoring attribute \'itemActionViewLayout\'. Action view already specified."

    .line 238
    .line 239
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 240
    .line 241
    .line 242
    :cond_a
    :goto_5
    iget-object v0, p0, Lk/h;->z:Ll/p;

    .line 243
    .line 244
    if-eqz v0, :cond_c

    .line 245
    .line 246
    instance-of v1, p1, Lg0/a;

    .line 247
    .line 248
    if-eqz v1, :cond_b

    .line 249
    .line 250
    move-object v1, p1

    .line 251
    check-cast v1, Lg0/a;

    .line 252
    .line 253
    invoke-interface {v1, v0}, Lg0/a;->b(Ll/p;)Lg0/a;

    .line 254
    .line 255
    .line 256
    goto :goto_6

    .line 257
    :cond_b
    const-string v0, "MenuItemCompat"

    .line 258
    .line 259
    const-string v1, "setActionProvider: item does not implement SupportMenuItem; ignoring"

    .line 260
    .line 261
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 262
    .line 263
    .line 264
    :cond_c
    :goto_6
    iget-object v0, p0, Lk/h;->A:Ljava/lang/CharSequence;

    .line 265
    .line 266
    instance-of v1, p1, Lg0/a;

    .line 267
    .line 268
    const/16 v2, 0x1a

    .line 269
    .line 270
    if-eqz v1, :cond_d

    .line 271
    .line 272
    move-object v3, p1

    .line 273
    check-cast v3, Lg0/a;

    .line 274
    .line 275
    invoke-interface {v3, v0}, Lg0/a;->setContentDescription(Ljava/lang/CharSequence;)Lg0/a;

    .line 276
    .line 277
    .line 278
    goto :goto_7

    .line 279
    :cond_d
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 280
    .line 281
    if-lt v3, v2, :cond_e

    .line 282
    .line 283
    invoke-static {p1, v0}, Lm0/p;->h(Landroid/view/MenuItem;Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 284
    .line 285
    .line 286
    :cond_e
    :goto_7
    iget-object v0, p0, Lk/h;->B:Ljava/lang/CharSequence;

    .line 287
    .line 288
    if-eqz v1, :cond_f

    .line 289
    .line 290
    move-object v3, p1

    .line 291
    check-cast v3, Lg0/a;

    .line 292
    .line 293
    invoke-interface {v3, v0}, Lg0/a;->setTooltipText(Ljava/lang/CharSequence;)Lg0/a;

    .line 294
    .line 295
    .line 296
    goto :goto_8

    .line 297
    :cond_f
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 298
    .line 299
    if-lt v3, v2, :cond_10

    .line 300
    .line 301
    invoke-static {p1, v0}, Lm0/p;->m(Landroid/view/MenuItem;Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 302
    .line 303
    .line 304
    :cond_10
    :goto_8
    iget-char v0, p0, Lk/h;->n:C

    .line 305
    .line 306
    iget v3, p0, Lk/h;->o:I

    .line 307
    .line 308
    if-eqz v1, :cond_11

    .line 309
    .line 310
    move-object v4, p1

    .line 311
    check-cast v4, Lg0/a;

    .line 312
    .line 313
    invoke-interface {v4, v0, v3}, Lg0/a;->setAlphabeticShortcut(CI)Landroid/view/MenuItem;

    .line 314
    .line 315
    .line 316
    goto :goto_9

    .line 317
    :cond_11
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 318
    .line 319
    if-lt v4, v2, :cond_12

    .line 320
    .line 321
    invoke-static {p1, v0, v3}, Lm0/p;->g(Landroid/view/MenuItem;CI)Landroid/view/MenuItem;

    .line 322
    .line 323
    .line 324
    :cond_12
    :goto_9
    iget-char v0, p0, Lk/h;->p:C

    .line 325
    .line 326
    iget v3, p0, Lk/h;->q:I

    .line 327
    .line 328
    if-eqz v1, :cond_13

    .line 329
    .line 330
    move-object v4, p1

    .line 331
    check-cast v4, Lg0/a;

    .line 332
    .line 333
    invoke-interface {v4, v0, v3}, Lg0/a;->setNumericShortcut(CI)Landroid/view/MenuItem;

    .line 334
    .line 335
    .line 336
    goto :goto_a

    .line 337
    :cond_13
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 338
    .line 339
    if-lt v4, v2, :cond_14

    .line 340
    .line 341
    invoke-static {p1, v0, v3}, Lm0/p;->k(Landroid/view/MenuItem;CI)Landroid/view/MenuItem;

    .line 342
    .line 343
    .line 344
    :cond_14
    :goto_a
    iget-object v0, p0, Lk/h;->D:Landroid/graphics/PorterDuff$Mode;

    .line 345
    .line 346
    if-eqz v0, :cond_16

    .line 347
    .line 348
    if-eqz v1, :cond_15

    .line 349
    .line 350
    move-object v3, p1

    .line 351
    check-cast v3, Lg0/a;

    .line 352
    .line 353
    invoke-interface {v3, v0}, Lg0/a;->setIconTintMode(Landroid/graphics/PorterDuff$Mode;)Landroid/view/MenuItem;

    .line 354
    .line 355
    .line 356
    goto :goto_b

    .line 357
    :cond_15
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 358
    .line 359
    if-lt v3, v2, :cond_16

    .line 360
    .line 361
    invoke-static {p1, v0}, Lm0/p;->j(Landroid/view/MenuItem;Landroid/graphics/PorterDuff$Mode;)Landroid/view/MenuItem;

    .line 362
    .line 363
    .line 364
    :cond_16
    :goto_b
    iget-object v0, p0, Lk/h;->C:Landroid/content/res/ColorStateList;

    .line 365
    .line 366
    if-eqz v0, :cond_18

    .line 367
    .line 368
    if-eqz v1, :cond_17

    .line 369
    .line 370
    check-cast p1, Lg0/a;

    .line 371
    .line 372
    invoke-interface {p1, v0}, Lg0/a;->setIconTintList(Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;

    .line 373
    .line 374
    .line 375
    goto :goto_c

    .line 376
    :cond_17
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 377
    .line 378
    if-lt v1, v2, :cond_18

    .line 379
    .line 380
    invoke-static {p1, v0}, Lm0/p;->i(Landroid/view/MenuItem;Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;

    .line 381
    .line 382
    .line 383
    :cond_18
    :goto_c
    return-void
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
