.class public final Ldev/jahir/kuper/extensions/FileKt;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# direct methods
.method private static final copyFilesTo(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 3

    .line 1
    const/16 v0, 0x1000

    .line 2
    .line 3
    :try_start_0
    new-array v0, v0, [B

    .line 4
    .line 5
    :goto_0
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, -0x1

    .line 10
    if-eq v1, v2, :cond_0

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {p1, v0, v2, v1}, Ljava/io/OutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    goto :goto_1

    .line 19
    :catch_0
    :cond_0
    :try_start_1
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 23
    .line 24
    .line 25
    goto :goto_2

    .line 26
    :goto_1
    :try_start_2
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 30
    .line 31
    .line 32
    :catch_1
    throw p0

    .line 33
    :catch_2
    :goto_2
    return-void
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

.method public static final copyFromTo(Ljava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;Ljava/io/File;)V
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "from"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    goto :goto_3

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :try_start_0
    new-instance v1, Ljava/io/FileOutputStream;

    .line 16
    .line 17
    invoke-direct {v1, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 18
    .line 19
    .line 20
    :try_start_1
    invoke-virtual {p0, p1}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1}, Ldev/jahir/kuper/extensions/FileKt;->copyFilesTo(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    .line 29
    .line 30
    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V

    .line 34
    .line 35
    .line 36
    :goto_0
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 37
    .line 38
    .line 39
    goto :goto_3

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    goto :goto_1

    .line 42
    :catch_0
    nop

    .line 43
    goto :goto_2

    .line 44
    :catchall_1
    move-exception p0

    .line 45
    move-object v1, v0

    .line 46
    goto :goto_1

    .line 47
    :catch_1
    nop

    .line 48
    move-object v1, v0

    .line 49
    goto :goto_2

    .line 50
    :goto_1
    if-eqz v0, :cond_1

    .line 51
    .line 52
    :try_start_3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 53
    .line 54
    .line 55
    :cond_1
    if-eqz v1, :cond_2

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V

    .line 58
    .line 59
    .line 60
    :cond_2
    if-eqz v1, :cond_3

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 63
    .line 64
    .line 65
    :catch_2
    :cond_3
    throw p0

    .line 66
    :goto_2
    if-eqz v0, :cond_4

    .line 67
    .line 68
    :try_start_4
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 69
    .line 70
    .line 71
    :cond_4
    if-eqz v1, :cond_5

    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 74
    .line 75
    .line 76
    :cond_5
    if-eqz v1, :cond_6

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :catch_3
    :cond_6
    :goto_3
    return-void
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
