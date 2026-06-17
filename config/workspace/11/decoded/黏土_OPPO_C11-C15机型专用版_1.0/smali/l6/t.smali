.class public abstract Ll6/t;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final a:Ll6/r0;

.field public final b:Lw5/d;

.field public final c:Ll6/n;


# direct methods
.method public constructor <init>(Ll6/r0;Lw5/d;Ll6/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll6/t;->a:Ll6/r0;

    .line 5
    .line 6
    iput-object p2, p0, Ll6/t;->b:Lw5/d;

    .line 7
    .line 8
    iput-object p3, p0, Ll6/t;->c:Ll6/n;

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

.method public static b(Landroidx/lifecycle/a1;Ljava/lang/Class;Ljava/lang/reflect/Method;)Ll6/t;
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    .line 1
    new-instance v2, Ll6/q0;

    move-object/from16 v3, p1

    invoke-direct {v2, v0, v3, v1}, Ll6/q0;-><init>(Landroidx/lifecycle/a1;Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    .line 2
    iget-object v3, v2, Ll6/q0;->d:[Ljava/lang/annotation/Annotation;

    array-length v4, v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    const-string v7, "HEAD"

    const/4 v8, 0x1

    if-ge v6, v4, :cond_12

    aget-object v10, v3, v6

    .line 3
    instance-of v11, v10, Lo6/b;

    if-eqz v11, :cond_0

    .line 4
    check-cast v10, Lo6/b;

    invoke-interface {v10}, Lo6/b;->value()Ljava/lang/String;

    move-result-object v7

    const-string v8, "DELETE"

    invoke-virtual {v2, v8, v7, v5}, Ll6/q0;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_3

    .line 5
    :cond_0
    instance-of v11, v10, Lo6/f;

    if-eqz v11, :cond_1

    .line 6
    check-cast v10, Lo6/f;

    invoke-interface {v10}, Lo6/f;->value()Ljava/lang/String;

    move-result-object v7

    const-string v8, "GET"

    invoke-virtual {v2, v8, v7, v5}, Ll6/q0;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_3

    .line 7
    :cond_1
    instance-of v11, v10, Lo6/g;

    if-eqz v11, :cond_2

    .line 8
    check-cast v10, Lo6/g;

    invoke-interface {v10}, Lo6/g;->value()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v7, v8, v5}, Ll6/q0;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_3

    .line 9
    :cond_2
    instance-of v7, v10, Lo6/n;

    if-eqz v7, :cond_3

    .line 10
    check-cast v10, Lo6/n;

    invoke-interface {v10}, Lo6/n;->value()Ljava/lang/String;

    move-result-object v7

    const-string v9, "PATCH"

    invoke-virtual {v2, v9, v7, v8}, Ll6/q0;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_3

    .line 11
    :cond_3
    instance-of v7, v10, Lo6/o;

    if-eqz v7, :cond_4

    .line 12
    check-cast v10, Lo6/o;

    invoke-interface {v10}, Lo6/o;->value()Ljava/lang/String;

    move-result-object v7

    const-string v9, "POST"

    invoke-virtual {v2, v9, v7, v8}, Ll6/q0;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_3

    .line 13
    :cond_4
    instance-of v7, v10, Lo6/p;

    if-eqz v7, :cond_5

    .line 14
    check-cast v10, Lo6/p;

    invoke-interface {v10}, Lo6/p;->value()Ljava/lang/String;

    move-result-object v7

    const-string v9, "PUT"

    invoke-virtual {v2, v9, v7, v8}, Ll6/q0;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_3

    .line 15
    :cond_5
    instance-of v7, v10, Lo6/m;

    if-eqz v7, :cond_6

    .line 16
    check-cast v10, Lo6/m;

    invoke-interface {v10}, Lo6/m;->value()Ljava/lang/String;

    move-result-object v7

    const-string v8, "OPTIONS"

    invoke-virtual {v2, v8, v7, v5}, Ll6/q0;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_3

    .line 17
    :cond_6
    instance-of v7, v10, Lo6/h;

    if-eqz v7, :cond_7

    .line 18
    check-cast v10, Lo6/h;

    .line 19
    invoke-interface {v10}, Lo6/h;->method()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v10}, Lo6/h;->path()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v10}, Lo6/h;->hasBody()Z

    move-result v9

    invoke-virtual {v2, v7, v8, v9}, Ll6/q0;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_3

    .line 20
    :cond_7
    instance-of v7, v10, Lo6/k;

    if-eqz v7, :cond_d

    .line 21
    check-cast v10, Lo6/k;

    .line 22
    invoke-interface {v10}, Lo6/k;->value()[Ljava/lang/String;

    move-result-object v7

    .line 23
    array-length v11, v7

    if-eqz v11, :cond_c

    .line 24
    invoke-interface {v10}, Lo6/k;->allowUnsafeNonAsciiValues()Z

    move-result v10

    .line 25
    new-instance v11, Lp3/j;

    invoke-direct {v11}, Lp3/j;-><init>()V

    .line 26
    array-length v12, v7

    const/4 v13, 0x0

    :goto_1
    if-ge v13, v12, :cond_b

    aget-object v14, v7, v13

    const/16 v15, 0x3a

    .line 27
    invoke-virtual {v14, v15}, Ljava/lang/String;->indexOf(I)I

    move-result v15

    const/4 v9, -0x1

    if-eq v15, v9, :cond_a

    if-eqz v15, :cond_a

    .line 28
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v9

    sub-int/2addr v9, v8

    if-eq v15, v9, :cond_a

    .line 29
    invoke-virtual {v14, v5, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    add-int/lit8 v15, v15, 0x1

    .line 30
    invoke-virtual {v14, v15}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v14

    .line 31
    const-string v15, "Content-Type"

    invoke-virtual {v15, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v15

    if-eqz v15, :cond_8

    .line 32
    :try_start_0
    sget-object v9, Lw5/r;->d:Ljava/util/regex/Pattern;

    invoke-static {v14}, Lu2/f;->r(Ljava/lang/String;)Lw5/r;

    move-result-object v9

    .line 33
    iput-object v9, v2, Ll6/q0;->u:Lw5/r;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 34
    new-array v2, v8, [Ljava/lang/Object;

    aput-object v14, v2, v5

    const-string v3, "Malformed content type: %s"

    invoke-static {v1, v0, v3, v2}, Ll6/z0;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_8
    if-eqz v10, :cond_9

    .line 35
    invoke-virtual {v11, v9, v14}, Lp3/j;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 36
    :cond_9
    invoke-virtual {v11, v9, v14}, Lp3/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    .line 37
    :cond_a
    new-array v0, v8, [Ljava/lang/Object;

    aput-object v14, v0, v5

    .line 38
    const-string v2, "@Headers value must be in the form \"Name: Value\". Found: \"%s\""

    const/4 v7, 0x0

    invoke-static {v1, v7, v2, v0}, Ll6/z0;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 39
    throw v0

    .line 40
    :cond_b
    invoke-virtual {v11}, Lp3/j;->e()Lw5/n;

    move-result-object v7

    .line 41
    iput-object v7, v2, Ll6/q0;->t:Lw5/n;

    goto :goto_3

    :cond_c
    const/4 v7, 0x0

    .line 42
    const-string v0, "@Headers annotation is empty."

    new-array v2, v5, [Ljava/lang/Object;

    .line 43
    invoke-static {v1, v7, v0, v2}, Ll6/z0;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 44
    throw v0

    :cond_d
    const/4 v7, 0x0

    .line 45
    instance-of v9, v10, Lo6/l;

    const-string v11, "Only one encoding annotation is allowed."

    if-eqz v9, :cond_f

    .line 46
    iget-boolean v9, v2, Ll6/q0;->q:Z

    if-nez v9, :cond_e

    .line 47
    iput-boolean v8, v2, Ll6/q0;->r:Z

    goto :goto_3

    .line 48
    :cond_e
    new-array v0, v5, [Ljava/lang/Object;

    .line 49
    invoke-static {v1, v7, v11, v0}, Ll6/z0;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 50
    throw v0

    .line 51
    :cond_f
    instance-of v9, v10, Lo6/e;

    if-eqz v9, :cond_11

    .line 52
    iget-boolean v9, v2, Ll6/q0;->r:Z

    if-nez v9, :cond_10

    .line 53
    iput-boolean v8, v2, Ll6/q0;->q:Z

    goto :goto_3

    .line 54
    :cond_10
    new-array v0, v5, [Ljava/lang/Object;

    .line 55
    invoke-static {v1, v7, v11, v0}, Ll6/z0;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 56
    throw v0

    :cond_11
    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 57
    :cond_12
    iget-object v4, v2, Ll6/q0;->o:Ljava/lang/String;

    if-eqz v4, :cond_80

    .line 58
    iget-boolean v4, v2, Ll6/q0;->p:Z

    if-nez v4, :cond_15

    .line 59
    iget-boolean v4, v2, Ll6/q0;->r:Z

    if-nez v4, :cond_14

    .line 60
    iget-boolean v4, v2, Ll6/q0;->q:Z

    if-nez v4, :cond_13

    goto :goto_4

    .line 61
    :cond_13
    const-string v0, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST)."

    new-array v2, v5, [Ljava/lang/Object;

    const/4 v7, 0x0

    .line 62
    invoke-static {v1, v7, v0, v2}, Ll6/z0;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 63
    throw v0

    :cond_14
    const/4 v7, 0x0

    .line 64
    const-string v0, "Multipart can only be specified on HTTP methods with request body (e.g., @POST)."

    new-array v2, v5, [Ljava/lang/Object;

    .line 65
    invoke-static {v1, v7, v0, v2}, Ll6/z0;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 66
    throw v0

    .line 67
    :cond_15
    :goto_4
    iget-object v4, v2, Ll6/q0;->e:[[Ljava/lang/annotation/Annotation;

    array-length v6, v4

    .line 68
    new-array v9, v6, [Ll6/z0;

    iput-object v9, v2, Ll6/q0;->w:[Ll6/z0;

    add-int/lit8 v9, v6, -0x1

    const/4 v10, 0x0

    :goto_5
    if-ge v10, v6, :cond_69

    .line 69
    iget-object v11, v2, Ll6/q0;->w:[Ll6/z0;

    iget-object v12, v2, Ll6/q0;->f:[Ljava/lang/reflect/Type;

    aget-object v12, v12, v10

    aget-object v13, v4, v10

    if-ne v10, v9, :cond_16

    const/4 v14, 0x1

    goto :goto_6

    :cond_16
    const/4 v14, 0x0

    :goto_6
    if-eqz v13, :cond_66

    .line 70
    array-length v15, v13

    const/16 v16, 0x0

    :goto_7
    if-ge v5, v15, :cond_65

    aget-object v8, v13, v5

    move-object/from16 v19, v4

    .line 71
    instance-of v4, v8, Lo6/y;

    move/from16 v20, v4

    const-string v4, "@Path parameters may not be used with @Url."

    move/from16 v21, v5

    const-class v5, Ljava/lang/String;

    if-eqz v20, :cond_1f

    .line 72
    invoke-virtual {v2, v10, v12}, Ll6/q0;->c(ILjava/lang/reflect/Type;)V

    .line 73
    iget-boolean v8, v2, Ll6/q0;->n:Z

    if-nez v8, :cond_1e

    .line 74
    iget-boolean v8, v2, Ll6/q0;->j:Z

    if-nez v8, :cond_1d

    .line 75
    iget-boolean v4, v2, Ll6/q0;->k:Z

    if-nez v4, :cond_1c

    .line 76
    iget-boolean v4, v2, Ll6/q0;->l:Z

    if-nez v4, :cond_1b

    .line 77
    iget-boolean v4, v2, Ll6/q0;->m:Z

    if-nez v4, :cond_1a

    .line 78
    iget-object v4, v2, Ll6/q0;->s:Ljava/lang/String;

    if-nez v4, :cond_19

    const/4 v4, 0x1

    .line 79
    iput-boolean v4, v2, Ll6/q0;->n:Z

    .line 80
    const-class v4, Lw5/p;

    if-eq v12, v4, :cond_17

    if-eq v12, v5, :cond_17

    const-class v4, Ljava/net/URI;

    if-eq v12, v4, :cond_17

    instance-of v4, v12, Ljava/lang/Class;

    if-eqz v4, :cond_18

    move-object v4, v12

    check-cast v4, Ljava/lang/Class;

    .line 81
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "android.net.Uri"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_18

    :cond_17
    const/4 v5, 0x0

    goto :goto_8

    .line 82
    :cond_18
    const-string v0, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type."

    const/4 v5, 0x0

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 83
    :goto_8
    new-instance v4, Ll6/f0;

    const/4 v8, 0x1

    invoke-direct {v4, v1, v10, v8}, Ll6/f0;-><init>(Ljava/lang/reflect/Method;II)V

    move/from16 v20, v6

    :goto_9
    move-object/from16 v23, v7

    move/from16 v24, v9

    move-object/from16 v25, v11

    move/from16 v22, v14

    move/from16 v26, v15

    goto/16 :goto_10

    :cond_19
    const/4 v5, 0x0

    const/4 v8, 0x1

    .line 84
    iget-object v0, v2, Ll6/q0;->o:Ljava/lang/String;

    new-array v2, v8, [Ljava/lang/Object;

    aput-object v0, v2, v5

    const-string v0, "@Url cannot be used with @%s URL"

    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_1a
    const/4 v5, 0x0

    .line 85
    const-string v0, "A @Url parameter must not come after a @QueryMap."

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_1b
    const/4 v5, 0x0

    .line 86
    const-string v0, "A @Url parameter must not come after a @QueryName."

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_1c
    const/4 v5, 0x0

    .line 87
    const-string v0, "A @Url parameter must not come after a @Query."

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_1d
    const/4 v5, 0x0

    .line 88
    new-array v0, v5, [Ljava/lang/Object;

    invoke-static {v1, v10, v4, v0}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_1e
    const/4 v5, 0x0

    .line 89
    const-string v0, "Multiple @Url method annotations found."

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_1f
    move/from16 v20, v6

    .line 90
    instance-of v6, v8, Lo6/s;

    move/from16 v22, v6

    iget-object v6, v2, Ll6/q0;->a:Landroidx/lifecycle/a1;

    if-eqz v22, :cond_27

    .line 91
    invoke-virtual {v2, v10, v12}, Ll6/q0;->c(ILjava/lang/reflect/Type;)V

    .line 92
    iget-boolean v5, v2, Ll6/q0;->k:Z

    if-nez v5, :cond_26

    .line 93
    iget-boolean v5, v2, Ll6/q0;->l:Z

    if-nez v5, :cond_25

    .line 94
    iget-boolean v5, v2, Ll6/q0;->m:Z

    if-nez v5, :cond_24

    .line 95
    iget-boolean v5, v2, Ll6/q0;->n:Z

    if-nez v5, :cond_23

    .line 96
    iget-object v4, v2, Ll6/q0;->s:Ljava/lang/String;

    if-eqz v4, :cond_22

    const/4 v4, 0x1

    .line 97
    iput-boolean v4, v2, Ll6/q0;->j:Z

    .line 98
    check-cast v8, Lo6/s;

    .line 99
    invoke-interface {v8}, Lo6/s;->value()Ljava/lang/String;

    move-result-object v4

    .line 100
    sget-object v5, Ll6/q0;->z:Ljava/util/regex/Pattern;

    invoke-virtual {v5, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    move-result v5

    if-eqz v5, :cond_21

    .line 101
    iget-object v5, v2, Ll6/q0;->v:Ljava/util/LinkedHashSet;

    invoke-interface {v5, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_20

    .line 102
    invoke-virtual {v6, v12, v13}, Landroidx/lifecycle/a1;->m(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 103
    new-instance v5, Ll6/h0;

    iget-object v6, v2, Ll6/q0;->c:Ljava/lang/reflect/Method;

    invoke-interface {v8}, Lo6/s;->encoded()Z

    move-result v8

    invoke-direct {v5, v6, v10, v4, v8}, Ll6/h0;-><init>(Ljava/lang/reflect/Method;ILjava/lang/String;Z)V

    move-object v4, v5

    goto/16 :goto_9

    .line 104
    :cond_20
    iget-object v0, v2, Ll6/q0;->s:Ljava/lang/String;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v2, v5

    const/4 v8, 0x1

    aput-object v4, v2, v8

    const-string v0, "URL \"%s\" does not contain \"{%s}\"."

    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_21
    const/4 v2, 0x2

    const/4 v5, 0x0

    const/4 v8, 0x1

    .line 105
    sget-object v0, Ll6/q0;->y:Ljava/util/regex/Pattern;

    .line 106
    invoke-virtual {v0}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v5

    aput-object v4, v2, v8

    .line 107
    const-string v0, "@Path parameter name must match %s. Found: %s"

    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_22
    const/4 v5, 0x0

    const/4 v8, 0x1

    .line 108
    iget-object v0, v2, Ll6/q0;->o:Ljava/lang/String;

    new-array v2, v8, [Ljava/lang/Object;

    aput-object v0, v2, v5

    const-string v0, "@Path can only be used with relative url on @%s"

    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_23
    const/4 v5, 0x0

    .line 109
    new-array v0, v5, [Ljava/lang/Object;

    invoke-static {v1, v10, v4, v0}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_24
    const/4 v5, 0x0

    .line 110
    const-string v0, "A @Path parameter must not come after a @QueryMap."

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_25
    const/4 v5, 0x0

    .line 111
    const-string v0, "A @Path parameter must not come after a @QueryName."

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_26
    const/4 v5, 0x0

    .line 112
    const-string v0, "A @Path parameter must not come after a @Query."

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 113
    :cond_27
    instance-of v4, v8, Lo6/t;

    move/from16 v22, v4

    const-string v4, "<String>)"

    move/from16 v24, v9

    const-string v9, " must include generic type (e.g., "

    move-object/from16 v25, v11

    const-class v11, Ljava/lang/Iterable;

    if-eqz v22, :cond_2b

    .line 114
    invoke-virtual {v2, v10, v12}, Ll6/q0;->c(ILjava/lang/reflect/Type;)V

    .line 115
    check-cast v8, Lo6/t;

    .line 116
    invoke-interface {v8}, Lo6/t;->value()Ljava/lang/String;

    move-result-object v5

    .line 117
    invoke-interface {v8}, Lo6/t;->encoded()Z

    move-result v8

    move/from16 v22, v14

    .line 118
    invoke-static {v12}, Ll6/z0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v14

    move/from16 v26, v15

    const/4 v15, 0x1

    .line 119
    iput-boolean v15, v2, Ll6/q0;->k:Z

    .line 120
    invoke-virtual {v11, v14}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v11

    if-eqz v11, :cond_29

    .line 121
    instance-of v11, v12, Ljava/lang/reflect/ParameterizedType;

    if-eqz v11, :cond_28

    .line 122
    move-object v4, v12

    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    const/4 v11, 0x0

    .line 123
    invoke-static {v11, v4}, Ll6/z0;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v4

    .line 124
    invoke-virtual {v6, v4, v13}, Landroidx/lifecycle/a1;->m(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 125
    new-instance v4, Ll6/d0;

    const/4 v6, 0x2

    invoke-direct {v4, v6, v5, v8}, Ll6/d0;-><init>(ILjava/lang/String;Z)V

    .line 126
    new-instance v5, Ll6/b0;

    invoke-direct {v5, v4, v11}, Ll6/b0;-><init>(Ll6/z0;I)V

    :goto_a
    move-object v4, v5

    :goto_b
    move-object/from16 v23, v7

    goto/16 :goto_10

    :cond_28
    const/4 v11, 0x0

    .line 127
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 128
    invoke-virtual {v14}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    invoke-virtual {v14}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v11, [Ljava/lang/Object;

    .line 130
    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 131
    :cond_29
    invoke-virtual {v14}, Ljava/lang/Class;->isArray()Z

    move-result v4

    if-eqz v4, :cond_2a

    .line 132
    invoke-virtual {v14}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v4

    invoke-static {v4}, Ll6/q0;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v4

    .line 133
    invoke-virtual {v6, v4, v13}, Landroidx/lifecycle/a1;->m(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 134
    new-instance v4, Ll6/d0;

    const/4 v9, 0x2

    invoke-direct {v4, v9, v5, v8}, Ll6/d0;-><init>(ILjava/lang/String;Z)V

    .line 135
    new-instance v5, Ll6/b0;

    const/4 v8, 0x1

    invoke-direct {v5, v4, v8}, Ll6/b0;-><init>(Ll6/z0;I)V

    goto :goto_a

    :cond_2a
    const/4 v9, 0x2

    .line 136
    invoke-virtual {v6, v12, v13}, Landroidx/lifecycle/a1;->m(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 137
    new-instance v4, Ll6/d0;

    invoke-direct {v4, v9, v5, v8}, Ll6/d0;-><init>(ILjava/lang/String;Z)V

    goto :goto_b

    :cond_2b
    move/from16 v22, v14

    move/from16 v26, v15

    .line 138
    instance-of v14, v8, Lo6/v;

    if-eqz v14, :cond_2f

    .line 139
    invoke-virtual {v2, v10, v12}, Ll6/q0;->c(ILjava/lang/reflect/Type;)V

    .line 140
    check-cast v8, Lo6/v;

    .line 141
    invoke-interface {v8}, Lo6/v;->encoded()Z

    move-result v5

    .line 142
    invoke-static {v12}, Ll6/z0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v8

    const/4 v15, 0x1

    .line 143
    iput-boolean v15, v2, Ll6/q0;->l:Z

    .line 144
    invoke-virtual {v11, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v11

    if-eqz v11, :cond_2d

    .line 145
    instance-of v11, v12, Ljava/lang/reflect/ParameterizedType;

    if-eqz v11, :cond_2c

    .line 146
    move-object v4, v12

    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    const/4 v11, 0x0

    .line 147
    invoke-static {v11, v4}, Ll6/z0;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v4

    .line 148
    invoke-virtual {v6, v4, v13}, Landroidx/lifecycle/a1;->m(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 149
    new-instance v4, Ll6/i0;

    invoke-direct {v4, v5}, Ll6/i0;-><init>(Z)V

    .line 150
    new-instance v5, Ll6/b0;

    invoke-direct {v5, v4, v11}, Ll6/b0;-><init>(Ll6/z0;I)V

    goto/16 :goto_a

    :cond_2c
    const/4 v11, 0x0

    .line 151
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 152
    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v11, [Ljava/lang/Object;

    .line 154
    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 155
    :cond_2d
    invoke-virtual {v8}, Ljava/lang/Class;->isArray()Z

    move-result v4

    if-eqz v4, :cond_2e

    .line 156
    invoke-virtual {v8}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v4

    invoke-static {v4}, Ll6/q0;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v4

    .line 157
    invoke-virtual {v6, v4, v13}, Landroidx/lifecycle/a1;->m(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 158
    new-instance v4, Ll6/i0;

    invoke-direct {v4, v5}, Ll6/i0;-><init>(Z)V

    .line 159
    new-instance v5, Ll6/b0;

    const/4 v8, 0x1

    invoke-direct {v5, v4, v8}, Ll6/b0;-><init>(Ll6/z0;I)V

    goto/16 :goto_a

    .line 160
    :cond_2e
    invoke-virtual {v6, v12, v13}, Landroidx/lifecycle/a1;->m(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 161
    new-instance v4, Ll6/i0;

    invoke-direct {v4, v5}, Ll6/i0;-><init>(Z)V

    goto/16 :goto_b

    .line 162
    :cond_2f
    instance-of v14, v8, Lo6/u;

    const-string v15, "Map must include generic types (e.g., Map<String, String>)"

    move/from16 v27, v14

    const-class v14, Ljava/util/Map;

    if-eqz v27, :cond_33

    .line 163
    invoke-virtual {v2, v10, v12}, Ll6/q0;->c(ILjava/lang/reflect/Type;)V

    .line 164
    invoke-static {v12}, Ll6/z0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v4

    const/4 v9, 0x1

    .line 165
    iput-boolean v9, v2, Ll6/q0;->m:Z

    .line 166
    invoke-virtual {v14, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v11

    if-eqz v11, :cond_32

    .line 167
    invoke-static {v12, v4}, Ll6/z0;->i(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v4

    .line 168
    instance-of v11, v4, Ljava/lang/reflect/ParameterizedType;

    if-eqz v11, :cond_31

    .line 169
    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    const/4 v11, 0x0

    .line 170
    invoke-static {v11, v4}, Ll6/z0;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v14

    if-ne v5, v14, :cond_30

    .line 171
    invoke-static {v9, v4}, Ll6/z0;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v4

    .line 172
    invoke-virtual {v6, v4, v13}, Landroidx/lifecycle/a1;->m(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 173
    new-instance v4, Ll6/e0;

    check-cast v8, Lo6/u;

    .line 174
    invoke-interface {v8}, Lo6/u;->encoded()Z

    move-result v5

    const/4 v6, 0x2

    invoke-direct {v4, v1, v10, v5, v6}, Ll6/e0;-><init>(Ljava/lang/reflect/Method;IZI)V

    goto/16 :goto_b

    .line 175
    :cond_30
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "@QueryMap keys must be of type String: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v11, 0x0

    new-array v2, v11, [Ljava/lang/Object;

    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_31
    const/4 v11, 0x0

    .line 176
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v1, v10, v15, v0}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_32
    const/4 v11, 0x0

    .line 177
    const-string v0, "@QueryMap parameter type must be Map."

    new-array v2, v11, [Ljava/lang/Object;

    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_33
    move-object/from16 v23, v7

    .line 178
    instance-of v7, v8, Lo6/i;

    if-eqz v7, :cond_37

    .line 179
    invoke-virtual {v2, v10, v12}, Ll6/q0;->c(ILjava/lang/reflect/Type;)V

    .line 180
    check-cast v8, Lo6/i;

    .line 181
    invoke-interface {v8}, Lo6/i;->value()Ljava/lang/String;

    move-result-object v5

    .line 182
    invoke-static {v12}, Ll6/z0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v7

    .line 183
    invoke-virtual {v11, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v11

    if-eqz v11, :cond_35

    .line 184
    instance-of v11, v12, Ljava/lang/reflect/ParameterizedType;

    if-eqz v11, :cond_34

    .line 185
    move-object v4, v12

    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    const/4 v11, 0x0

    .line 186
    invoke-static {v11, v4}, Ll6/z0;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v4

    .line 187
    invoke-virtual {v6, v4, v13}, Landroidx/lifecycle/a1;->m(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 188
    new-instance v4, Ll6/d0;

    invoke-interface {v8}, Lo6/i;->allowUnsafeNonAsciiValues()Z

    move-result v6

    const/4 v8, 0x1

    invoke-direct {v4, v8, v5, v6}, Ll6/d0;-><init>(ILjava/lang/String;Z)V

    .line 189
    new-instance v5, Ll6/b0;

    invoke-direct {v5, v4, v11}, Ll6/b0;-><init>(Ll6/z0;I)V

    :goto_c
    move-object v4, v5

    goto/16 :goto_10

    :cond_34
    const/4 v11, 0x0

    .line 190
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 191
    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v11, [Ljava/lang/Object;

    .line 193
    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 194
    :cond_35
    invoke-virtual {v7}, Ljava/lang/Class;->isArray()Z

    move-result v4

    if-eqz v4, :cond_36

    .line 195
    invoke-virtual {v7}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v4

    invoke-static {v4}, Ll6/q0;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v4

    .line 196
    invoke-virtual {v6, v4, v13}, Landroidx/lifecycle/a1;->m(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 197
    new-instance v4, Ll6/d0;

    invoke-interface {v8}, Lo6/i;->allowUnsafeNonAsciiValues()Z

    move-result v6

    const/4 v15, 0x1

    invoke-direct {v4, v15, v5, v6}, Ll6/d0;-><init>(ILjava/lang/String;Z)V

    .line 198
    new-instance v5, Ll6/b0;

    invoke-direct {v5, v4, v15}, Ll6/b0;-><init>(Ll6/z0;I)V

    goto :goto_c

    :cond_36
    const/4 v15, 0x1

    .line 199
    invoke-virtual {v6, v12, v13}, Landroidx/lifecycle/a1;->m(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 200
    new-instance v4, Ll6/d0;

    invoke-interface {v8}, Lo6/i;->allowUnsafeNonAsciiValues()Z

    move-result v6

    invoke-direct {v4, v15, v5, v6}, Ll6/d0;-><init>(ILjava/lang/String;Z)V

    goto/16 :goto_10

    .line 201
    :cond_37
    instance-of v7, v8, Lo6/j;

    if-eqz v7, :cond_3c

    .line 202
    const-class v4, Lw5/n;

    if-ne v12, v4, :cond_38

    .line 203
    new-instance v4, Ll6/f0;

    const/4 v11, 0x0

    invoke-direct {v4, v1, v10, v11}, Ll6/f0;-><init>(Ljava/lang/reflect/Method;II)V

    goto/16 :goto_10

    :cond_38
    const/4 v11, 0x0

    .line 204
    invoke-virtual {v2, v10, v12}, Ll6/q0;->c(ILjava/lang/reflect/Type;)V

    .line 205
    invoke-static {v12}, Ll6/z0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v4

    .line 206
    invoke-virtual {v14, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v7

    if-eqz v7, :cond_3b

    .line 207
    invoke-static {v12, v4}, Ll6/z0;->i(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v4

    .line 208
    instance-of v7, v4, Ljava/lang/reflect/ParameterizedType;

    if-eqz v7, :cond_3a

    .line 209
    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    .line 210
    invoke-static {v11, v4}, Ll6/z0;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v7

    if-ne v5, v7, :cond_39

    const/4 v15, 0x1

    .line 211
    invoke-static {v15, v4}, Ll6/z0;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v4

    .line 212
    invoke-virtual {v6, v4, v13}, Landroidx/lifecycle/a1;->m(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 213
    new-instance v4, Ll6/e0;

    check-cast v8, Lo6/j;

    .line 214
    invoke-interface {v8}, Lo6/j;->allowUnsafeNonAsciiValues()Z

    move-result v5

    invoke-direct {v4, v1, v10, v5, v15}, Ll6/e0;-><init>(Ljava/lang/reflect/Method;IZI)V

    goto/16 :goto_10

    .line 215
    :cond_39
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "@HeaderMap keys must be of type String: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v11, 0x0

    new-array v2, v11, [Ljava/lang/Object;

    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 216
    :cond_3a
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v1, v10, v15, v0}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 217
    :cond_3b
    const-string v0, "@HeaderMap parameter type must be Map or Headers."

    new-array v2, v11, [Ljava/lang/Object;

    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 218
    :cond_3c
    instance-of v7, v8, Lo6/c;

    if-eqz v7, :cond_41

    .line 219
    invoke-virtual {v2, v10, v12}, Ll6/q0;->c(ILjava/lang/reflect/Type;)V

    .line 220
    iget-boolean v5, v2, Ll6/q0;->q:Z

    if-eqz v5, :cond_40

    .line 221
    check-cast v8, Lo6/c;

    .line 222
    invoke-interface {v8}, Lo6/c;->value()Ljava/lang/String;

    move-result-object v5

    .line 223
    invoke-interface {v8}, Lo6/c;->encoded()Z

    move-result v7

    const/4 v8, 0x1

    .line 224
    iput-boolean v8, v2, Ll6/q0;->g:Z

    .line 225
    invoke-static {v12}, Ll6/z0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v8

    .line 226
    invoke-virtual {v11, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v11

    if-eqz v11, :cond_3e

    .line 227
    instance-of v11, v12, Ljava/lang/reflect/ParameterizedType;

    if-eqz v11, :cond_3d

    .line 228
    move-object v4, v12

    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    const/4 v11, 0x0

    .line 229
    invoke-static {v11, v4}, Ll6/z0;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v4

    .line 230
    invoke-virtual {v6, v4, v13}, Landroidx/lifecycle/a1;->m(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 231
    new-instance v4, Ll6/d0;

    invoke-direct {v4, v11, v5, v7}, Ll6/d0;-><init>(ILjava/lang/String;Z)V

    .line 232
    new-instance v5, Ll6/b0;

    invoke-direct {v5, v4, v11}, Ll6/b0;-><init>(Ll6/z0;I)V

    goto/16 :goto_c

    :cond_3d
    const/4 v11, 0x0

    .line 233
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 234
    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v11, [Ljava/lang/Object;

    .line 236
    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_3e
    const/4 v11, 0x0

    .line 237
    invoke-virtual {v8}, Ljava/lang/Class;->isArray()Z

    move-result v4

    if-eqz v4, :cond_3f

    .line 238
    invoke-virtual {v8}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v4

    invoke-static {v4}, Ll6/q0;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v4

    .line 239
    invoke-virtual {v6, v4, v13}, Landroidx/lifecycle/a1;->m(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 240
    new-instance v4, Ll6/d0;

    invoke-direct {v4, v11, v5, v7}, Ll6/d0;-><init>(ILjava/lang/String;Z)V

    .line 241
    new-instance v5, Ll6/b0;

    const/4 v8, 0x1

    invoke-direct {v5, v4, v8}, Ll6/b0;-><init>(Ll6/z0;I)V

    goto/16 :goto_c

    .line 242
    :cond_3f
    invoke-virtual {v6, v12, v13}, Landroidx/lifecycle/a1;->m(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 243
    new-instance v4, Ll6/d0;

    invoke-direct {v4, v11, v5, v7}, Ll6/d0;-><init>(ILjava/lang/String;Z)V

    goto/16 :goto_10

    :cond_40
    const/4 v11, 0x0

    .line 244
    const-string v0, "@Field parameters can only be used with form encoding."

    new-array v2, v11, [Ljava/lang/Object;

    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 245
    :cond_41
    instance-of v7, v8, Lo6/d;

    if-eqz v7, :cond_46

    .line 246
    invoke-virtual {v2, v10, v12}, Ll6/q0;->c(ILjava/lang/reflect/Type;)V

    .line 247
    iget-boolean v4, v2, Ll6/q0;->q:Z

    if-eqz v4, :cond_45

    .line 248
    invoke-static {v12}, Ll6/z0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v4

    .line 249
    invoke-virtual {v14, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v7

    if-eqz v7, :cond_44

    .line 250
    invoke-static {v12, v4}, Ll6/z0;->i(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v4

    .line 251
    instance-of v7, v4, Ljava/lang/reflect/ParameterizedType;

    if-eqz v7, :cond_43

    .line 252
    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    const/4 v11, 0x0

    .line 253
    invoke-static {v11, v4}, Ll6/z0;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v7

    if-ne v5, v7, :cond_42

    const/4 v15, 0x1

    .line 254
    invoke-static {v15, v4}, Ll6/z0;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v4

    .line 255
    invoke-virtual {v6, v4, v13}, Landroidx/lifecycle/a1;->m(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 256
    iput-boolean v15, v2, Ll6/q0;->g:Z

    .line 257
    new-instance v4, Ll6/e0;

    check-cast v8, Lo6/d;

    .line 258
    invoke-interface {v8}, Lo6/d;->encoded()Z

    move-result v5

    invoke-direct {v4, v1, v10, v5, v11}, Ll6/e0;-><init>(Ljava/lang/reflect/Method;IZI)V

    goto/16 :goto_10

    .line 259
    :cond_42
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "@FieldMap keys must be of type String: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v11, [Ljava/lang/Object;

    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_43
    const/4 v11, 0x0

    .line 260
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v1, v10, v15, v0}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_44
    const/4 v11, 0x0

    .line 261
    const-string v0, "@FieldMap parameter type must be Map."

    new-array v2, v11, [Ljava/lang/Object;

    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_45
    const/4 v11, 0x0

    .line 262
    const-string v0, "@FieldMap parameters can only be used with form encoding."

    new-array v2, v11, [Ljava/lang/Object;

    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 263
    :cond_46
    instance-of v7, v8, Lo6/q;

    move/from16 v27, v7

    const-class v7, Lw5/s;

    if-eqz v27, :cond_55

    .line 264
    invoke-virtual {v2, v10, v12}, Ll6/q0;->c(ILjava/lang/reflect/Type;)V

    .line 265
    iget-boolean v5, v2, Ll6/q0;->r:Z

    if-eqz v5, :cond_54

    .line 266
    check-cast v8, Lo6/q;

    const/4 v15, 0x1

    .line 267
    iput-boolean v15, v2, Ll6/q0;->h:Z

    .line 268
    invoke-interface {v8}, Lo6/q;->value()Ljava/lang/String;

    move-result-object v5

    .line 269
    invoke-static {v12}, Ll6/z0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v14

    .line 270
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v15

    if-eqz v15, :cond_4d

    .line 271
    invoke-virtual {v11, v14}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    sget-object v6, Ll6/j0;->d:Ll6/j0;

    const-string v8, "@Part annotation must supply a name or use MultipartBody.Part parameter type."

    if-eqz v5, :cond_49

    .line 272
    instance-of v5, v12, Ljava/lang/reflect/ParameterizedType;

    if-eqz v5, :cond_48

    .line 273
    move-object v4, v12

    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    const/4 v11, 0x0

    .line 274
    invoke-static {v11, v4}, Ll6/z0;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v4

    .line 275
    invoke-static {v4}, Ll6/z0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v7, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_47

    .line 276
    new-instance v4, Ll6/b0;

    invoke-direct {v4, v6, v11}, Ll6/b0;-><init>(Ll6/z0;I)V

    goto/16 :goto_10

    .line 277
    :cond_47
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v1, v10, v8, v0}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 278
    :cond_48
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 279
    invoke-virtual {v14}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    invoke-virtual {v14}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v11, 0x0

    new-array v2, v11, [Ljava/lang/Object;

    .line 281
    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_49
    const/4 v11, 0x0

    .line 282
    invoke-virtual {v14}, Ljava/lang/Class;->isArray()Z

    move-result v4

    if-eqz v4, :cond_4b

    .line 283
    invoke-virtual {v14}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v4

    .line 284
    invoke-virtual {v7, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_4a

    .line 285
    new-instance v4, Ll6/b0;

    const/4 v8, 0x1

    invoke-direct {v4, v6, v8}, Ll6/b0;-><init>(Ll6/z0;I)V

    goto/16 :goto_10

    .line 286
    :cond_4a
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v1, v10, v8, v0}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 287
    :cond_4b
    invoke-virtual {v7, v14}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_4c

    move-object v4, v6

    goto/16 :goto_10

    .line 288
    :cond_4c
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v1, v10, v8, v0}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 289
    :cond_4d
    const-string v15, "form-data; name=\""

    move-object/from16 v27, v8

    const-string v8, "\""

    .line 290
    invoke-static {v15, v5, v8}, Landroidx/appcompat/app/b;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 291
    const-string v8, "Content-Transfer-Encoding"

    .line 292
    invoke-interface/range {v27 .. v27}, Lo6/q;->encoding()Ljava/lang/String;

    move-result-object v15

    const-string v0, "Content-Disposition"

    filled-new-array {v0, v5, v8, v15}, [Ljava/lang/String;

    move-result-object v0

    .line 293
    invoke-static {v0}, Lq3/a;->R([Ljava/lang/String;)Lw5/n;

    move-result-object v0

    .line 294
    invoke-virtual {v11, v14}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    const-string v8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation."

    if-eqz v5, :cond_50

    .line 295
    instance-of v5, v12, Ljava/lang/reflect/ParameterizedType;

    if-eqz v5, :cond_4f

    .line 296
    move-object v4, v12

    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    const/4 v11, 0x0

    .line 297
    invoke-static {v11, v4}, Ll6/z0;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v4

    .line 298
    invoke-static {v4}, Ll6/z0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-nez v5, :cond_4e

    .line 299
    invoke-virtual {v6, v4, v13, v3}, Landroidx/lifecycle/a1;->j(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Ll6/n;

    move-result-object v4

    .line 300
    new-instance v5, Ll6/g0;

    invoke-direct {v5, v1, v10, v0, v4}, Ll6/g0;-><init>(Ljava/lang/reflect/Method;ILw5/n;Ll6/n;)V

    .line 301
    new-instance v0, Ll6/b0;

    invoke-direct {v0, v5, v11}, Ll6/b0;-><init>(Ll6/z0;I)V

    :goto_d
    move-object v4, v0

    goto/16 :goto_10

    .line 302
    :cond_4e
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v1, v10, v8, v0}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 303
    :cond_4f
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 304
    invoke-virtual {v14}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    invoke-virtual {v14}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v11, 0x0

    new-array v2, v11, [Ljava/lang/Object;

    .line 306
    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 307
    :cond_50
    invoke-virtual {v14}, Ljava/lang/Class;->isArray()Z

    move-result v4

    if-eqz v4, :cond_52

    .line 308
    invoke-virtual {v14}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v4

    invoke-static {v4}, Ll6/q0;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v4

    .line 309
    invoke-virtual {v7, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-nez v5, :cond_51

    .line 310
    invoke-virtual {v6, v4, v13, v3}, Landroidx/lifecycle/a1;->j(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Ll6/n;

    move-result-object v4

    .line 311
    new-instance v5, Ll6/g0;

    invoke-direct {v5, v1, v10, v0, v4}, Ll6/g0;-><init>(Ljava/lang/reflect/Method;ILw5/n;Ll6/n;)V

    .line 312
    new-instance v0, Ll6/b0;

    const/4 v8, 0x1

    invoke-direct {v0, v5, v8}, Ll6/b0;-><init>(Ll6/z0;I)V

    goto :goto_d

    :cond_51
    const/4 v11, 0x0

    .line 313
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v1, v10, v8, v0}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_52
    const/4 v11, 0x0

    .line 314
    invoke-virtual {v7, v14}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-nez v4, :cond_53

    .line 315
    invoke-virtual {v6, v12, v13, v3}, Landroidx/lifecycle/a1;->j(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Ll6/n;

    move-result-object v4

    .line 316
    new-instance v5, Ll6/g0;

    invoke-direct {v5, v1, v10, v0, v4}, Ll6/g0;-><init>(Ljava/lang/reflect/Method;ILw5/n;Ll6/n;)V

    goto/16 :goto_c

    .line 317
    :cond_53
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v1, v10, v8, v0}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_54
    const/4 v11, 0x0

    .line 318
    const-string v0, "@Part parameters can only be used with multipart encoding."

    new-array v2, v11, [Ljava/lang/Object;

    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 319
    :cond_55
    instance-of v0, v8, Lo6/r;

    if-eqz v0, :cond_5b

    .line 320
    invoke-virtual {v2, v10, v12}, Ll6/q0;->c(ILjava/lang/reflect/Type;)V

    .line 321
    iget-boolean v0, v2, Ll6/q0;->r:Z

    if-eqz v0, :cond_5a

    const/4 v4, 0x1

    .line 322
    iput-boolean v4, v2, Ll6/q0;->h:Z

    .line 323
    invoke-static {v12}, Ll6/z0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    .line 324
    invoke-virtual {v14, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v9

    if-eqz v9, :cond_59

    .line 325
    invoke-static {v12, v0}, Ll6/z0;->i(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v0

    .line 326
    instance-of v9, v0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v9, :cond_58

    .line 327
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    const/4 v11, 0x0

    .line 328
    invoke-static {v11, v0}, Ll6/z0;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v9

    if-ne v5, v9, :cond_57

    .line 329
    invoke-static {v4, v0}, Ll6/z0;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v0

    .line 330
    invoke-static {v0}, Ll6/z0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v7, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-nez v4, :cond_56

    .line 331
    invoke-virtual {v6, v0, v13, v3}, Landroidx/lifecycle/a1;->j(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Ll6/n;

    move-result-object v0

    .line 332
    check-cast v8, Lo6/r;

    .line 333
    new-instance v4, Ll6/g0;

    invoke-interface {v8}, Lo6/r;->encoding()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v1, v10, v0, v5}, Ll6/g0;-><init>(Ljava/lang/reflect/Method;ILl6/n;Ljava/lang/String;)V

    goto/16 :goto_10

    .line 334
    :cond_56
    const-string v0, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead."

    const/4 v11, 0x0

    new-array v2, v11, [Ljava/lang/Object;

    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_57
    const/4 v11, 0x0

    .line 335
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "@PartMap keys must be of type String: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v11, [Ljava/lang/Object;

    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_58
    const/4 v11, 0x0

    .line 336
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v1, v10, v15, v0}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_59
    const/4 v11, 0x0

    .line 337
    const-string v0, "@PartMap parameter type must be Map."

    new-array v2, v11, [Ljava/lang/Object;

    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_5a
    const/4 v11, 0x0

    .line 338
    const-string v0, "@PartMap parameters can only be used with multipart encoding."

    new-array v2, v11, [Ljava/lang/Object;

    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 339
    :cond_5b
    instance-of v0, v8, Lo6/a;

    if-eqz v0, :cond_5e

    .line 340
    invoke-virtual {v2, v10, v12}, Ll6/q0;->c(ILjava/lang/reflect/Type;)V

    .line 341
    iget-boolean v0, v2, Ll6/q0;->q:Z

    if-nez v0, :cond_5d

    iget-boolean v0, v2, Ll6/q0;->r:Z

    if-nez v0, :cond_5d

    .line 342
    iget-boolean v0, v2, Ll6/q0;->i:Z

    if-nez v0, :cond_5c

    .line 343
    :try_start_1
    invoke-virtual {v6, v12, v13, v3}, Landroidx/lifecycle/a1;->j(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Ll6/n;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    const/4 v8, 0x1

    .line 344
    iput-boolean v8, v2, Ll6/q0;->i:Z

    .line 345
    new-instance v4, Ll6/c0;

    invoke-direct {v4, v1, v10, v0}, Ll6/c0;-><init>(Ljava/lang/reflect/Method;ILl6/n;)V

    goto/16 :goto_10

    :catch_1
    move-exception v0

    const/4 v8, 0x1

    .line 346
    new-array v2, v8, [Ljava/lang/Object;

    const/4 v11, 0x0

    aput-object v12, v2, v11

    const-string v3, "Unable to create @Body converter for %s"

    invoke-static {v1, v0, v10, v3, v2}, Ll6/z0;->o(Ljava/lang/reflect/Method;Ljava/lang/Exception;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_5c
    const/4 v11, 0x0

    .line 347
    const-string v0, "Multiple @Body method annotations found."

    new-array v2, v11, [Ljava/lang/Object;

    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_5d
    const/4 v11, 0x0

    .line 348
    const-string v0, "@Body parameters cannot be used with form or multi-part encoding."

    new-array v2, v11, [Ljava/lang/Object;

    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 349
    :cond_5e
    instance-of v0, v8, Lo6/x;

    if-eqz v0, :cond_62

    .line 350
    invoke-virtual {v2, v10, v12}, Ll6/q0;->c(ILjava/lang/reflect/Type;)V

    .line 351
    invoke-static {v12}, Ll6/z0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Ll6/q0;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    add-int/lit8 v4, v10, -0x1

    :goto_e
    if-ltz v4, :cond_61

    .line 352
    iget-object v5, v2, Ll6/q0;->w:[Ll6/z0;

    aget-object v5, v5, v4

    .line 353
    instance-of v6, v5, Ll6/k0;

    if-eqz v6, :cond_60

    check-cast v5, Ll6/k0;

    iget-object v5, v5, Ll6/k0;->d:Ljava/lang/Class;

    .line 354
    invoke-virtual {v5, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5f

    goto :goto_f

    .line 355
    :cond_5f
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "@Tag type "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 356
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " is duplicate of "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Ll6/l0;->b:Ll6/b;

    .line 357
    invoke-virtual {v0, v1, v4}, Ll6/b;->c(Ljava/lang/reflect/Method;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " and would always overwrite its value."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v11, 0x0

    new-array v2, v11, [Ljava/lang/Object;

    .line 358
    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_60
    :goto_f
    add-int/lit8 v4, v4, -0x1

    goto :goto_e

    .line 359
    :cond_61
    new-instance v4, Ll6/k0;

    invoke-direct {v4, v0}, Ll6/k0;-><init>(Ljava/lang/Class;)V

    goto :goto_10

    :cond_62
    const/4 v4, 0x0

    :goto_10
    if-nez v4, :cond_63

    goto :goto_11

    :cond_63
    if-nez v16, :cond_64

    move-object/from16 v16, v4

    :goto_11
    add-int/lit8 v5, v21, 0x1

    move-object/from16 v0, p0

    move-object/from16 v4, v19

    move/from16 v6, v20

    move/from16 v14, v22

    move-object/from16 v7, v23

    move/from16 v9, v24

    move-object/from16 v11, v25

    move/from16 v15, v26

    const/4 v8, 0x1

    goto/16 :goto_7

    .line 360
    :cond_64
    const-string v0, "Multiple Retrofit annotations found, only one allowed."

    const/4 v11, 0x0

    new-array v2, v11, [Ljava/lang/Object;

    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_65
    :goto_12
    move-object/from16 v19, v4

    move/from16 v20, v6

    move-object/from16 v23, v7

    move/from16 v24, v9

    move-object/from16 v25, v11

    move/from16 v22, v14

    goto :goto_13

    :cond_66
    const/16 v16, 0x0

    goto :goto_12

    :goto_13
    if-nez v16, :cond_68

    if-eqz v22, :cond_67

    .line 361
    :try_start_2
    invoke-static {v12}, Ll6/z0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    const-class v4, Lt4/c;

    if-ne v0, v4, :cond_67

    const/4 v8, 0x1

    .line 362
    iput-boolean v8, v2, Ll6/q0;->x:Z
    :try_end_2
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_2 .. :try_end_2} :catch_2

    const/16 v16, 0x0

    goto :goto_14

    .line 363
    :catch_2
    :cond_67
    const-string v0, "No Retrofit annotation found."

    const/4 v11, 0x0

    new-array v2, v11, [Ljava/lang/Object;

    invoke-static {v1, v10, v0, v2}, Ll6/z0;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 364
    :cond_68
    :goto_14
    aput-object v16, v25, v10

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v0, p0

    move-object/from16 v4, v19

    move/from16 v6, v20

    move-object/from16 v7, v23

    move/from16 v9, v24

    const/4 v5, 0x0

    const/4 v8, 0x1

    goto/16 :goto_5

    :cond_69
    move-object/from16 v23, v7

    .line 365
    iget-object v0, v2, Ll6/q0;->s:Ljava/lang/String;

    if-nez v0, :cond_6b

    iget-boolean v0, v2, Ll6/q0;->n:Z

    if-eqz v0, :cond_6a

    goto :goto_15

    .line 366
    :cond_6a
    iget-object v0, v2, Ll6/q0;->o:Ljava/lang/String;

    const/4 v8, 0x1

    new-array v2, v8, [Ljava/lang/Object;

    const/16 v17, 0x0

    aput-object v0, v2, v17

    .line 367
    const-string v0, "Missing either @%s URL or @Url parameter."

    const/4 v7, 0x0

    invoke-static {v1, v7, v0, v2}, Ll6/z0;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 368
    throw v0

    .line 369
    :cond_6b
    :goto_15
    iget-boolean v0, v2, Ll6/q0;->q:Z

    if-nez v0, :cond_6c

    iget-boolean v3, v2, Ll6/q0;->r:Z

    if-nez v3, :cond_6c

    iget-boolean v3, v2, Ll6/q0;->p:Z

    if-nez v3, :cond_6c

    iget-boolean v3, v2, Ll6/q0;->i:Z

    if-nez v3, :cond_6d

    :cond_6c
    const/4 v7, 0x0

    const/4 v11, 0x0

    goto :goto_16

    .line 370
    :cond_6d
    const-string v0, "Non-body HTTP method cannot contain @Body."

    const/4 v11, 0x0

    new-array v2, v11, [Ljava/lang/Object;

    const/4 v7, 0x0

    .line 371
    invoke-static {v1, v7, v0, v2}, Ll6/z0;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 372
    throw v0

    :goto_16
    if-eqz v0, :cond_6f

    .line 373
    iget-boolean v0, v2, Ll6/q0;->g:Z

    if-eqz v0, :cond_6e

    goto :goto_17

    .line 374
    :cond_6e
    const-string v0, "Form-encoded method must contain at least one @Field."

    new-array v2, v11, [Ljava/lang/Object;

    .line 375
    invoke-static {v1, v7, v0, v2}, Ll6/z0;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 376
    throw v0

    .line 377
    :cond_6f
    :goto_17
    iget-boolean v0, v2, Ll6/q0;->r:Z

    if-eqz v0, :cond_71

    iget-boolean v0, v2, Ll6/q0;->h:Z

    if-eqz v0, :cond_70

    goto :goto_18

    .line 378
    :cond_70
    const-string v0, "Multipart method must contain at least one @Part."

    new-array v2, v11, [Ljava/lang/Object;

    .line 379
    invoke-static {v1, v7, v0, v2}, Ll6/z0;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 380
    throw v0

    .line 381
    :cond_71
    :goto_18
    new-instance v0, Ll6/r0;

    invoke-direct {v0, v2}, Ll6/r0;-><init>(Ll6/q0;)V

    .line 382
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    move-result-object v2

    .line 383
    invoke-static {v2}, Ll6/z0;->j(Ljava/lang/reflect/Type;)Z

    move-result v3

    if-nez v3, :cond_7f

    .line 384
    sget-object v3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    if-eq v2, v3, :cond_7e

    .line 385
    invoke-virtual {v1}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v2

    .line 386
    const-class v3, Lp4/k;

    const-class v4, Ll6/s0;

    iget-boolean v5, v0, Ll6/r0;->l:Z

    if-eqz v5, :cond_77

    .line 387
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v6

    .line 388
    array-length v7, v6

    const/16 v18, 0x1

    add-int/lit8 v7, v7, -0x1

    aget-object v6, v6, v7

    check-cast v6, Ljava/lang/reflect/ParameterizedType;

    .line 389
    invoke-interface {v6}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v6

    const/4 v11, 0x0

    aget-object v6, v6, v11

    .line 390
    instance-of v7, v6, Ljava/lang/reflect/WildcardType;

    if-eqz v7, :cond_72

    .line 391
    check-cast v6, Ljava/lang/reflect/WildcardType;

    invoke-interface {v6}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    move-result-object v6

    aget-object v6, v6, v11

    .line 392
    :cond_72
    invoke-static {v6}, Ll6/z0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v7

    const-class v8, Ll6/e;

    if-ne v7, v4, :cond_73

    instance-of v7, v6, Ljava/lang/reflect/ParameterizedType;

    if-eqz v7, :cond_73

    .line 393
    check-cast v6, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v11, v6}, Ll6/z0;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v6

    const/4 v7, 0x1

    const/4 v9, 0x0

    goto :goto_1a

    .line 394
    :cond_73
    invoke-static {v6}, Ll6/z0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v7

    if-eq v7, v8, :cond_76

    .line 395
    sget-boolean v7, Ll6/z0;->b:Z

    if-eqz v7, :cond_74

    if-ne v6, v3, :cond_74

    const/4 v7, 0x1

    goto :goto_19

    :cond_74
    const/4 v7, 0x0

    :goto_19
    move v9, v7

    const/4 v7, 0x0

    .line 396
    :goto_1a
    new-instance v10, Ll6/x0;

    const/4 v15, 0x1

    new-array v11, v15, [Ljava/lang/reflect/Type;

    const/4 v12, 0x0

    aput-object v6, v11, v12

    const/4 v6, 0x0

    invoke-direct {v10, v6, v8, v11}, Ll6/x0;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    .line 397
    const-class v6, Ll6/u0;

    invoke-static {v2, v6}, Ll6/z0;->l([Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_75

    goto :goto_1b

    .line 398
    :cond_75
    array-length v6, v2

    add-int/2addr v6, v15

    new-array v6, v6, [Ljava/lang/annotation/Annotation;

    .line 399
    sget-object v8, Ll6/v0;->a:Ll6/v0;

    aput-object v8, v6, v12

    .line 400
    array-length v8, v2

    invoke-static {v2, v12, v6, v15, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v2, v6

    :goto_1b
    move v6, v9

    :goto_1c
    move-object/from16 v8, p0

    goto :goto_1d

    :cond_76
    const/4 v12, 0x0

    const/4 v15, 0x1

    .line 401
    check-cast v6, Ljava/lang/reflect/ParameterizedType;

    .line 402
    invoke-static {v12, v6}, Ll6/z0;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v0

    new-array v2, v15, [Ljava/lang/Object;

    aput-object v0, v2, v12

    .line 403
    const-string v0, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s"

    const/4 v7, 0x0

    invoke-static {v1, v7, v0, v2}, Ll6/z0;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 404
    throw v0

    .line 405
    :cond_77
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    move-result-object v10

    const/4 v6, 0x0

    const/4 v7, 0x0

    goto :goto_1c

    .line 406
    :goto_1d
    :try_start_3
    invoke-virtual {v8, v10, v2}, Landroidx/lifecycle/a1;->f(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ll6/g;

    move-result-object v2
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_4

    .line 407
    invoke-interface {v2}, Ll6/g;->a()Ljava/lang/reflect/Type;

    move-result-object v9

    .line 408
    const-class v10, Lw5/z;

    if-eq v9, v10, :cond_7d

    if-eq v9, v4, :cond_7c

    .line 409
    iget-object v4, v0, Ll6/r0;->d:Ljava/lang/String;

    move-object/from16 v10, v23

    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_79

    const-class v4, Ljava/lang/Void;

    .line 410
    invoke-virtual {v4, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_79

    .line 411
    sget-boolean v4, Ll6/z0;->b:Z

    if-eqz v4, :cond_78

    if-ne v9, v3, :cond_78

    goto :goto_1e

    .line 412
    :cond_78
    const-string v0, "HEAD method must use Void or Unit as response type."

    const/4 v11, 0x0

    new-array v2, v11, [Ljava/lang/Object;

    const/4 v7, 0x0

    .line 413
    invoke-static {v1, v7, v0, v2}, Ll6/z0;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 414
    throw v0

    .line 415
    :cond_79
    :goto_1e
    invoke-virtual {v1}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v3

    .line 416
    :try_start_4
    invoke-virtual {v8, v9, v3}, Landroidx/lifecycle/a1;->k(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ll6/n;

    move-result-object v4
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_3

    .line 417
    iget-object v1, v8, Landroidx/lifecycle/a1;->j:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lw5/u;

    if-nez v5, :cond_7a

    .line 418
    new-instance v1, Ll6/r;

    const/4 v6, 0x0

    move-object v5, v2

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Ll6/r;-><init>(Ll6/r0;Lw5/u;Ll6/n;Ll6/g;I)V

    return-object v1

    :cond_7a
    move-object v5, v2

    move-object v2, v0

    if-eqz v7, :cond_7b

    .line 419
    new-instance v1, Ll6/r;

    const/4 v6, 0x1

    invoke-direct/range {v1 .. v6}, Ll6/r;-><init>(Ll6/r0;Lw5/u;Ll6/n;Ll6/g;I)V

    return-object v1

    .line 420
    :cond_7b
    new-instance v1, Ll6/s;

    invoke-direct/range {v1 .. v6}, Ll6/s;-><init>(Ll6/r0;Lw5/u;Ll6/n;Ll6/g;Z)V

    return-object v1

    :catch_3
    move-exception v0

    const/4 v8, 0x1

    .line 421
    new-array v2, v8, [Ljava/lang/Object;

    const/4 v11, 0x0

    aput-object v9, v2, v11

    const-string v3, "Unable to create converter for %s"

    invoke-static {v1, v0, v3, v2}, Ll6/z0;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_7c
    const/4 v11, 0x0

    .line 422
    const-string v0, "Response must include generic type (e.g., Response<String>)"

    new-array v2, v11, [Ljava/lang/Object;

    const/4 v7, 0x0

    .line 423
    invoke-static {v1, v7, v0, v2}, Ll6/z0;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 424
    throw v0

    .line 425
    :cond_7d
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "\'"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 426
    invoke-static {v9}, Ll6/z0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\' is not a valid response body type. Did you mean ResponseBody?"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v11, 0x0

    new-array v2, v11, [Ljava/lang/Object;

    const/4 v7, 0x0

    .line 427
    invoke-static {v1, v7, v0, v2}, Ll6/z0;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 428
    throw v0

    :catch_4
    move-exception v0

    const/4 v11, 0x0

    const/4 v8, 0x1

    .line 429
    new-array v2, v8, [Ljava/lang/Object;

    aput-object v10, v2, v11

    const-string v3, "Unable to create call adapter for %s"

    invoke-static {v1, v0, v3, v2}, Ll6/z0;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_7e
    const/4 v7, 0x0

    const/4 v11, 0x0

    .line 430
    const-string v0, "Service methods cannot return void."

    new-array v2, v11, [Ljava/lang/Object;

    .line 431
    invoke-static {v1, v7, v0, v2}, Ll6/z0;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 432
    throw v0

    :cond_7f
    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v11, 0x0

    .line 433
    new-array v0, v8, [Ljava/lang/Object;

    aput-object v2, v0, v11

    .line 434
    const-string v2, "Method return type must not include a type variable or wildcard: %s"

    invoke-static {v1, v7, v2, v0}, Ll6/z0;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 435
    throw v0

    :cond_80
    const/4 v7, 0x0

    const/4 v11, 0x0

    .line 436
    const-string v0, "HTTP method annotation is required (e.g., @GET, @POST, etc.)."

    new-array v2, v11, [Ljava/lang/Object;

    .line 437
    invoke-static {v1, v7, v0, v2}, Ll6/z0;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 438
    throw v0
.end method


# virtual methods
.method public abstract a(Ll6/a0;[Ljava/lang/Object;)Ljava/lang/Object;
.end method
