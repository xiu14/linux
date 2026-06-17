.class public final Lcom/google/gson/GsonBuilder;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final a:Lcom/google/gson/internal/Excluder;

.field public final b:Lcom/google/gson/LongSerializationPolicy;

.field public final c:Lcom/google/gson/FieldNamingStrategy;

.field public final d:Ljava/util/HashMap;

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/util/ArrayList;

.field public final g:I

.field public final h:I

.field public final i:Z

.field public final j:Lcom/google/gson/FormattingStyle;

.field public final k:Z

.field public final l:Lcom/google/gson/ToNumberStrategy;

.field public final m:Lcom/google/gson/ToNumberStrategy;

.field public final n:Ljava/util/ArrayDeque;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/google/gson/internal/Excluder;->j:Lcom/google/gson/internal/Excluder;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/google/gson/GsonBuilder;->a:Lcom/google/gson/internal/Excluder;

    .line 7
    .line 8
    sget-object v0, Lcom/google/gson/LongSerializationPolicy;->h:Lcom/google/gson/LongSerializationPolicy;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/google/gson/GsonBuilder;->b:Lcom/google/gson/LongSerializationPolicy;

    .line 11
    .line 12
    sget-object v0, Lcom/google/gson/FieldNamingPolicy;->h:Lcom/google/gson/FieldNamingPolicy;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/google/gson/GsonBuilder;->c:Lcom/google/gson/FieldNamingStrategy;

    .line 15
    .line 16
    new-instance v0, Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/google/gson/GsonBuilder;->d:Ljava/util/HashMap;

    .line 22
    .line 23
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/google/gson/GsonBuilder;->e:Ljava/util/ArrayList;

    .line 29
    .line 30
    new-instance v0, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lcom/google/gson/GsonBuilder;->f:Ljava/util/ArrayList;

    .line 36
    .line 37
    sget-object v0, Lcom/google/gson/Gson;->n:Lcom/google/gson/FormattingStyle;

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    iput v0, p0, Lcom/google/gson/GsonBuilder;->g:I

    .line 41
    .line 42
    iput v0, p0, Lcom/google/gson/GsonBuilder;->h:I

    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    iput-boolean v0, p0, Lcom/google/gson/GsonBuilder;->i:Z

    .line 46
    .line 47
    sget-object v1, Lcom/google/gson/Gson;->n:Lcom/google/gson/FormattingStyle;

    .line 48
    .line 49
    iput-object v1, p0, Lcom/google/gson/GsonBuilder;->j:Lcom/google/gson/FormattingStyle;

    .line 50
    .line 51
    iput-boolean v0, p0, Lcom/google/gson/GsonBuilder;->k:Z

    .line 52
    .line 53
    sget-object v0, Lcom/google/gson/Gson;->p:Lcom/google/gson/ToNumberStrategy;

    .line 54
    .line 55
    iput-object v0, p0, Lcom/google/gson/GsonBuilder;->l:Lcom/google/gson/ToNumberStrategy;

    .line 56
    .line 57
    sget-object v0, Lcom/google/gson/Gson;->q:Lcom/google/gson/ToNumberStrategy;

    .line 58
    .line 59
    iput-object v0, p0, Lcom/google/gson/GsonBuilder;->m:Lcom/google/gson/ToNumberStrategy;

    .line 60
    .line 61
    new-instance v0, Ljava/util/ArrayDeque;

    .line 62
    .line 63
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object v0, p0, Lcom/google/gson/GsonBuilder;->n:Ljava/util/ArrayDeque;

    .line 67
    .line 68
    return-void
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


# virtual methods
.method public final a()Lcom/google/gson/Gson;
    .locals 14

    .line 1
    new-instance v10, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/gson/GsonBuilder;->e:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lcom/google/gson/GsonBuilder;->f:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    add-int/2addr v3, v1

    .line 16
    add-int/lit8 v3, v3, 0x3

    .line 17
    .line 18
    invoke-direct {v10, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 22
    .line 23
    .line 24
    invoke-static {v10}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 25
    .line 26
    .line 27
    new-instance v1, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 36
    .line 37
    .line 38
    sget-boolean v1, Lcom/google/gson/internal/sql/SqlTypesSupport;->a:Z

    .line 39
    .line 40
    iget v3, p0, Lcom/google/gson/GsonBuilder;->g:I

    .line 41
    .line 42
    iget v4, p0, Lcom/google/gson/GsonBuilder;->h:I

    .line 43
    .line 44
    const/4 v5, 0x2

    .line 45
    if-ne v3, v5, :cond_0

    .line 46
    .line 47
    if-eq v4, v5, :cond_2

    .line 48
    .line 49
    :cond_0
    sget-object v5, Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$DateType;->b:Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$DateType;

    .line 50
    .line 51
    invoke-virtual {v5, v3, v4}, Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$DateType;->a(II)Lcom/google/gson/TypeAdapterFactory;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    if-eqz v1, :cond_1

    .line 56
    .line 57
    sget-object v6, Lcom/google/gson/internal/sql/SqlTypesSupport;->c:Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$DateType;

    .line 58
    .line 59
    invoke-virtual {v6, v3, v4}, Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$DateType;->a(II)Lcom/google/gson/TypeAdapterFactory;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    sget-object v7, Lcom/google/gson/internal/sql/SqlTypesSupport;->b:Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$DateType;

    .line 64
    .line 65
    invoke-virtual {v7, v3, v4}, Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$DateType;->a(II)Lcom/google/gson/TypeAdapterFactory;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    goto :goto_0

    .line 70
    :cond_1
    const/4 v6, 0x0

    .line 71
    move-object v3, v6

    .line 72
    :goto_0
    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    if-eqz v1, :cond_2

    .line 76
    .line 77
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    :cond_2
    move-object v1, v0

    .line 84
    new-instance v0, Lcom/google/gson/Gson;

    .line 85
    .line 86
    new-instance v3, Ljava/util/HashMap;

    .line 87
    .line 88
    iget-object v4, p0, Lcom/google/gson/GsonBuilder;->d:Ljava/util/HashMap;

    .line 89
    .line 90
    invoke-direct {v3, v4}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 91
    .line 92
    .line 93
    new-instance v8, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-direct {v8, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 96
    .line 97
    .line 98
    new-instance v9, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-direct {v9, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 101
    .line 102
    .line 103
    new-instance v13, Ljava/util/ArrayList;

    .line 104
    .line 105
    iget-object v1, p0, Lcom/google/gson/GsonBuilder;->n:Ljava/util/ArrayDeque;

    .line 106
    .line 107
    invoke-direct {v13, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 108
    .line 109
    .line 110
    iget-object v1, p0, Lcom/google/gson/GsonBuilder;->a:Lcom/google/gson/internal/Excluder;

    .line 111
    .line 112
    iget-object v2, p0, Lcom/google/gson/GsonBuilder;->c:Lcom/google/gson/FieldNamingStrategy;

    .line 113
    .line 114
    iget-boolean v4, p0, Lcom/google/gson/GsonBuilder;->i:Z

    .line 115
    .line 116
    iget-object v5, p0, Lcom/google/gson/GsonBuilder;->j:Lcom/google/gson/FormattingStyle;

    .line 117
    .line 118
    iget-boolean v6, p0, Lcom/google/gson/GsonBuilder;->k:Z

    .line 119
    .line 120
    iget-object v7, p0, Lcom/google/gson/GsonBuilder;->b:Lcom/google/gson/LongSerializationPolicy;

    .line 121
    .line 122
    iget-object v11, p0, Lcom/google/gson/GsonBuilder;->l:Lcom/google/gson/ToNumberStrategy;

    .line 123
    .line 124
    iget-object v12, p0, Lcom/google/gson/GsonBuilder;->m:Lcom/google/gson/ToNumberStrategy;

    .line 125
    .line 126
    invoke-direct/range {v0 .. v13}, Lcom/google/gson/Gson;-><init>(Lcom/google/gson/internal/Excluder;Lcom/google/gson/FieldNamingStrategy;Ljava/util/Map;ZLcom/google/gson/FormattingStyle;ZLcom/google/gson/LongSerializationPolicy;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/google/gson/ToNumberStrategy;Lcom/google/gson/ToNumberStrategy;Ljava/util/List;)V

    .line 127
    .line 128
    .line 129
    return-object v0
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
