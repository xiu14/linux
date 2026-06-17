.class public final synthetic Lcom/google/android/datatransport/runtime/scheduling/persistence/e;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lcom/google/android/datatransport/runtime/scheduling/persistence/SQLiteEventStore$Function;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Lcom/google/android/datatransport/runtime/TransportContext;


# direct methods
.method public synthetic constructor <init>(JLcom/google/android/datatransport/runtime/TransportContext;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lcom/google/android/datatransport/runtime/scheduling/persistence/e;->a:J

    .line 5
    .line 6
    iput-object p3, p0, Lcom/google/android/datatransport/runtime/scheduling/persistence/e;->b:Lcom/google/android/datatransport/runtime/TransportContext;

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
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    sget-object v0, Lcom/google/android/datatransport/runtime/scheduling/persistence/SQLiteEventStore;->m:Lcom/google/android/datatransport/Encoding;

    .line 4
    .line 5
    new-instance v0, Landroid/content/ContentValues;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v1, "next_request_ms"

    .line 11
    .line 12
    iget-wide v2, p0, Lcom/google/android/datatransport/runtime/scheduling/persistence/e;->a:J

    .line 13
    .line 14
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/google/android/datatransport/runtime/scheduling/persistence/e;->b:Lcom/google/android/datatransport/runtime/TransportContext;

    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/google/android/datatransport/runtime/TransportContext;->b()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v1}, Lcom/google/android/datatransport/runtime/TransportContext;->d()Lcom/google/android/datatransport/Priority;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-static {v3}, Lcom/google/android/datatransport/runtime/util/PriorityMapping;->a(Lcom/google/android/datatransport/Priority;)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    const-string v3, "transport_contexts"

    .line 44
    .line 45
    const-string v4, "backend_name = ? and priority = ?"

    .line 46
    .line 47
    invoke-virtual {p1, v3, v0, v4, v2}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    const/4 v4, 0x1

    .line 52
    const/4 v5, 0x0

    .line 53
    if-ge v2, v4, :cond_0

    .line 54
    .line 55
    const-string v2, "backend_name"

    .line 56
    .line 57
    invoke-virtual {v1}, Lcom/google/android/datatransport/runtime/TransportContext;->b()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-virtual {v0, v2, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Lcom/google/android/datatransport/runtime/TransportContext;->d()Lcom/google/android/datatransport/Priority;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-static {v1}, Lcom/google/android/datatransport/runtime/util/PriorityMapping;->a(Lcom/google/android/datatransport/Priority;)I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    const-string v2, "priority"

    .line 77
    .line 78
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, v3, v5, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 82
    .line 83
    .line 84
    :cond_0
    return-object v5
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
