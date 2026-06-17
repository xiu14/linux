.class public final Lcom/stshell/app/status/GenerationStatusEvent$Companion;
.super Ljava/lang/Object;
.source "GenerationStatusEvent.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stshell/app/status/GenerationStatusEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGenerationStatusEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GenerationStatusEvent.kt\ncom/stshell/app/status/GenerationStatusEvent$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n1#2:70\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stshell/app/status/GenerationStatusEvent$Companion;",
        "",
        "<init>",
        "()V",
        "from",
        "Lcom/stshell/app/status/GenerationStatusEvent;",
        "name",
        "",
        "payloadJson",
        "app_debug"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field static final synthetic $$INSTANCE:Lcom/stshell/app/status/GenerationStatusEvent$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stshell/app/status/GenerationStatusEvent$Companion;

    invoke-direct {v0}, Lcom/stshell/app/status/GenerationStatusEvent$Companion;-><init>()V

    sput-object v0, Lcom/stshell/app/status/GenerationStatusEvent$Companion;->$$INSTANCE:Lcom/stshell/app/status/GenerationStatusEvent$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(Ljava/lang/String;Ljava/lang/String;)Lcom/stshell/app/status/GenerationStatusEvent;
    .locals 10
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "payloadJson"    # Ljava/lang/String;

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    const/4 v0, 0x0

    if-eqz p2, :cond_1

    move-object v1, p2

    .line 70
    .local v1, "it\\1":Ljava/lang/String;
    const/4 v2, 0x0

    .line 36
    .local v2, "$i$a$-takeIf-GenerationStatusEvent$Companion$from$payload$1\\1\\36\\0":I
    move-object v3, v1

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    .end local v1    # "it\\1":Ljava/lang/String;
    .end local v2    # "$i$a$-takeIf-GenerationStatusEvent$Companion$from$payload$1\\1\\36\\0":I
    if-nez v3, :cond_0

    move-object v1, p2

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_1

    .line 70
    .local v1, "p0\\2":Ljava/lang/String;
    const/4 v2, 0x0

    .local v2, "$i$f$from$stub_for_inlining\\2\\36":I
    const/4 v3, 0x0

    .line 36
    .local v3, "$i$a$-let-GenerationStatusEvent$Companion$from$payload$2\\3\\-1\\2":I
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .end local v1    # "p0\\2":Ljava/lang/String;
    .end local v2    # "$i$f$from$stub_for_inlining\\2\\36":I
    .end local v3    # "$i$a$-let-GenerationStatusEvent$Companion$from$payload$2\\3\\-1\\2":I
    goto :goto_1

    :cond_1
    move-object v4, v0

    .line 37
    .local v4, "payload":Lorg/json/JSONObject;
    :goto_1
    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v4, :cond_4

    const-string v3, "at"

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    .line 70
    .local v5, "it\\4":J
    const/4 v7, 0x0

    .line 37
    .local v7, "$i$a$-takeIf-GenerationStatusEvent$Companion$from$at$1\\4\\37\\0":I
    const-wide/16 v8, 0x0

    cmp-long v8, v5, v8

    if-lez v8, :cond_2

    move v5, v1

    goto :goto_2

    :cond_2
    move v5, v2

    .end local v5    # "it\\4":J
    .end local v7    # "$i$a$-takeIf-GenerationStatusEvent$Companion$from$at$1\\4\\37\\0":I
    :goto_2
    if-eqz v5, :cond_3

    goto :goto_3

    :cond_3
    move-object v3, v0

    :goto_3
    if-eqz v3, :cond_4

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    goto :goto_4

    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 39
    .local v5, "at":J
    :goto_4
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v3

    const-string v7, "href"

    sparse-switch v3, :sswitch_data_0

    :goto_5
    goto/16 :goto_a

    :sswitch_0
    const-string v3, "generation_streaming"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_5

    .line 47
    :cond_5
    nop

    .line 48
    nop

    .line 49
    if-eqz v4, :cond_6

    const-string v3, "preview"

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_6

    .line 70
    move-object v7, v3

    .local v7, "it\\8":Ljava/lang/String;
    const/4 v8, 0x0

    .line 49
    .local v8, "$i$a$-takeIf-GenerationStatusEvent$Companion$from$4\\8\\49\\0":I
    move-object v9, v7

    check-cast v9, Ljava/lang/CharSequence;

    invoke-static {v9}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v9

    .end local v7    # "it\\8":Ljava/lang/String;
    .end local v8    # "$i$a$-takeIf-GenerationStatusEvent$Companion$from$4\\8\\49\\0":I
    if-nez v9, :cond_6

    goto :goto_6

    :cond_6
    move-object v3, v0

    .line 50
    :goto_6
    if-eqz v4, :cond_8

    const-string v7, "length"

    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    .line 70
    nop

    .local v8, "it\\9":I
    const/4 v9, 0x0

    .line 50
    .local v9, "$i$a$-takeIf-GenerationStatusEvent$Companion$from$5\\9\\50\\0":I
    if-ltz v8, :cond_7

    goto :goto_7

    :cond_7
    move v1, v2

    .end local v8    # "it\\9":I
    .end local v9    # "$i$a$-takeIf-GenerationStatusEvent$Companion$from$5\\9\\50\\0":I
    :goto_7
    if-eqz v1, :cond_8

    move-object v0, v7

    .line 47
    :cond_8
    new-instance v1, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;

    invoke-direct {v1, v5, v6, v3, v0}, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;-><init>(JLjava/lang/String;Ljava/lang/Integer;)V

    move-object v0, v1

    check-cast v0, Lcom/stshell/app/status/GenerationStatusEvent;

    goto/16 :goto_b

    .line 39
    :sswitch_1
    const-string v1, "generation_ended"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    goto :goto_5

    .line 53
    :cond_9
    nop

    .line 54
    nop

    .line 55
    if-eqz v4, :cond_a

    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_a

    .line 70
    move-object v2, v1

    .local v2, "it\\10":Ljava/lang/String;
    const/4 v3, 0x0

    .line 55
    .local v3, "$i$a$-takeIf-GenerationStatusEvent$Companion$from$6\\10\\55\\0":I
    move-object v7, v2

    check-cast v7, Ljava/lang/CharSequence;

    invoke-static {v7}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v7

    .end local v2    # "it\\10":Ljava/lang/String;
    .end local v3    # "$i$a$-takeIf-GenerationStatusEvent$Companion$from$6\\10\\55\\0":I
    if-nez v7, :cond_a

    goto :goto_8

    :cond_a
    move-object v1, v0

    .line 56
    :goto_8
    if-eqz v4, :cond_b

    const-string v2, "messageId"

    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_b

    .line 70
    move-object v3, v2

    .local v3, "it\\11":Ljava/lang/String;
    const/4 v7, 0x0

    .line 56
    .local v7, "$i$a$-takeIf-GenerationStatusEvent$Companion$from$7\\11\\56\\0":I
    move-object v8, v3

    check-cast v8, Ljava/lang/CharSequence;

    invoke-static {v8}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v8

    .end local v3    # "it\\11":Ljava/lang/String;
    .end local v7    # "$i$a$-takeIf-GenerationStatusEvent$Companion$from$7\\11\\56\\0":I
    if-nez v8, :cond_b

    move-object v0, v2

    .line 53
    :cond_b
    new-instance v2, Lcom/stshell/app/status/GenerationStatusEvent$Ended;

    invoke-direct {v2, v5, v6, v1, v0}, Lcom/stshell/app/status/GenerationStatusEvent$Ended;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    move-object v0, v2

    check-cast v0, Lcom/stshell/app/status/GenerationStatusEvent;

    goto/16 :goto_b

    .line 39
    :sswitch_2
    const-string v1, "st_bridge_ready"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    goto/16 :goto_5

    .line 40
    :cond_c
    if-eqz v4, :cond_d

    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_d

    .line 70
    move-object v2, v1

    .local v2, "it\\5":Ljava/lang/String;
    const/4 v3, 0x0

    .line 40
    .local v3, "$i$a$-takeIf-GenerationStatusEvent$Companion$from$1\\5\\40\\0":I
    move-object v7, v2

    check-cast v7, Ljava/lang/CharSequence;

    invoke-static {v7}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v7

    .end local v2    # "it\\5":Ljava/lang/String;
    .end local v3    # "$i$a$-takeIf-GenerationStatusEvent$Companion$from$1\\5\\40\\0":I
    if-nez v7, :cond_d

    move-object v0, v1

    :cond_d
    new-instance v1, Lcom/stshell/app/status/GenerationStatusEvent$BridgeReady;

    invoke-direct {v1, v5, v6, v0}, Lcom/stshell/app/status/GenerationStatusEvent$BridgeReady;-><init>(JLjava/lang/String;)V

    move-object v0, v1

    check-cast v0, Lcom/stshell/app/status/GenerationStatusEvent;

    goto/16 :goto_b

    .line 39
    :sswitch_3
    const-string v1, "generation_stopped"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    goto/16 :goto_5

    .line 59
    :cond_e
    nop

    .line 60
    nop

    .line 61
    if-eqz v4, :cond_f

    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_f

    .line 70
    move-object v2, v1

    .local v2, "it\\12":Ljava/lang/String;
    const/4 v3, 0x0

    .line 61
    .local v3, "$i$a$-takeIf-GenerationStatusEvent$Companion$from$8\\12\\61\\0":I
    move-object v7, v2

    check-cast v7, Ljava/lang/CharSequence;

    invoke-static {v7}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v7

    .end local v2    # "it\\12":Ljava/lang/String;
    .end local v3    # "$i$a$-takeIf-GenerationStatusEvent$Companion$from$8\\12\\61\\0":I
    if-nez v7, :cond_f

    move-object v0, v1

    .line 59
    :cond_f
    new-instance v1, Lcom/stshell/app/status/GenerationStatusEvent$Stopped;

    invoke-direct {v1, v5, v6, v0}, Lcom/stshell/app/status/GenerationStatusEvent$Stopped;-><init>(JLjava/lang/String;)V

    move-object v0, v1

    check-cast v0, Lcom/stshell/app/status/GenerationStatusEvent;

    goto :goto_b

    .line 39
    :sswitch_4
    const-string v1, "generation_started"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    goto/16 :goto_5

    .line 41
    :cond_10
    nop

    .line 42
    nop

    .line 43
    if-eqz v4, :cond_11

    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_11

    .line 70
    move-object v2, v1

    .local v2, "it\\6":Ljava/lang/String;
    const/4 v3, 0x0

    .line 43
    .local v3, "$i$a$-takeIf-GenerationStatusEvent$Companion$from$2\\6\\43\\0":I
    move-object v7, v2

    check-cast v7, Ljava/lang/CharSequence;

    invoke-static {v7}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v7

    .end local v2    # "it\\6":Ljava/lang/String;
    .end local v3    # "$i$a$-takeIf-GenerationStatusEvent$Companion$from$2\\6\\43\\0":I
    if-nez v7, :cond_11

    goto :goto_9

    :cond_11
    move-object v1, v0

    .line 44
    :goto_9
    if-eqz v4, :cond_12

    const-string v2, "type"

    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_12

    .line 70
    move-object v3, v2

    .local v3, "it\\7":Ljava/lang/String;
    const/4 v7, 0x0

    .line 44
    .local v7, "$i$a$-takeIf-GenerationStatusEvent$Companion$from$3\\7\\44\\0":I
    move-object v8, v3

    check-cast v8, Ljava/lang/CharSequence;

    invoke-static {v8}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v8

    .end local v3    # "it\\7":Ljava/lang/String;
    .end local v7    # "$i$a$-takeIf-GenerationStatusEvent$Companion$from$3\\7\\44\\0":I
    if-nez v8, :cond_12

    move-object v0, v2

    .line 41
    :cond_12
    new-instance v2, Lcom/stshell/app/status/GenerationStatusEvent$Started;

    invoke-direct {v2, v5, v6, v1, v0}, Lcom/stshell/app/status/GenerationStatusEvent$Started;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    move-object v0, v2

    check-cast v0, Lcom/stshell/app/status/GenerationStatusEvent;

    goto :goto_b

    .line 64
    :goto_a
    nop

    .line 39
    :goto_b
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x769b07a6 -> :sswitch_4
        -0x75d6b65a -> :sswitch_3
        -0x179c2975 -> :sswitch_2
        0x22caa4d3 -> :sswitch_1
        0x301b3dfb -> :sswitch_0
    .end sparse-switch
.end method
