.class public final synthetic Lcom/google/android/datatransport/runtime/scheduling/persistence/b;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lcom/google/android/datatransport/runtime/scheduling/persistence/SQLiteEventStore$Function;


# instance fields
.field public final synthetic a:J


# direct methods
.method public synthetic constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lcom/google/android/datatransport/runtime/scheduling/persistence/b;->a:J

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
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/google/android/datatransport/runtime/scheduling/persistence/b;->a:J

    .line 2
    .line 3
    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    .line 4
    .line 5
    sget-object v2, Lcom/google/android/datatransport/runtime/scheduling/persistence/SQLiteEventStore;->m:Lcom/google/android/datatransport/Encoding;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    new-array v3, v2, [Ljava/lang/String;

    .line 9
    .line 10
    const-string v4, "SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1"

    .line 11
    .line 12
    invoke-virtual {p1, v4, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :try_start_0
    sget-object v3, Lcom/google/android/datatransport/runtime/scheduling/persistence/SQLiteEventStore;->m:Lcom/google/android/datatransport/Encoding;

    .line 17
    .line 18
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getLong(I)J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    sget v4, Lcom/google/android/datatransport/runtime/firebase/transport/TimeWindow;->c:I

    .line 26
    .line 27
    new-instance v4, Lcom/google/android/datatransport/runtime/firebase/transport/TimeWindow$Builder;

    .line 28
    .line 29
    invoke-direct {v4}, Lcom/google/android/datatransport/runtime/firebase/transport/TimeWindow$Builder;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-wide v2, v4, Lcom/google/android/datatransport/runtime/firebase/transport/TimeWindow$Builder;->a:J

    .line 33
    .line 34
    iput-wide v0, v4, Lcom/google/android/datatransport/runtime/firebase/transport/TimeWindow$Builder;->b:J

    .line 35
    .line 36
    new-instance v0, Lcom/google/android/datatransport/runtime/firebase/transport/TimeWindow;

    .line 37
    .line 38
    iget-wide v1, v4, Lcom/google/android/datatransport/runtime/firebase/transport/TimeWindow$Builder;->a:J

    .line 39
    .line 40
    iget-wide v3, v4, Lcom/google/android/datatransport/runtime/firebase/transport/TimeWindow$Builder;->b:J

    .line 41
    .line 42
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/datatransport/runtime/firebase/transport/TimeWindow;-><init>(JJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 46
    .line 47
    .line 48
    return-object v0

    .line 49
    :catchall_0
    move-exception v0

    .line 50
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 51
    .line 52
    .line 53
    throw v0
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
