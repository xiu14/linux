.class public final Landroidx/room/b;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Lz1/e;

.field public final d:Landroidx/room/m0;

.field public final e:Ljava/util/List;

.field public final f:Z

.field public final g:Landroidx/room/l0;

.field public final h:Ljava/util/concurrent/Executor;

.field public final i:Ljava/util/concurrent/Executor;

.field public final j:Landroid/content/Intent;

.field public final k:Z

.field public final l:Z

.field public final m:Ljava/util/Set;

.field public final n:Ljava/lang/String;

.field public final o:Ljava/io/File;

.field public final p:Ljava/util/concurrent/Callable;

.field public final q:Ljava/util/List;

.field public final r:Ljava/util/List;

.field public final s:Z

.field public final t:Ly1/b;

.field public final u:Lt4/h;

.field public v:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lz1/e;Landroidx/room/m0;Ljava/util/List;ZLandroidx/room/l0;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Ljava/util/List;Ljava/util/List;ZLy1/b;Lt4/h;)V
    .locals 3

    move-object/from16 v0, p17

    move-object/from16 v1, p18

    const-string v2, "context"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "migrationContainer"

    invoke-static {p4, v2}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "queryExecutor"

    invoke-static {p8, v2}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "transactionExecutor"

    invoke-static {p9, v2}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "typeConverters"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "autoMigrationSpecs"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/room/b;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Landroidx/room/b;->b:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Landroidx/room/b;->c:Lz1/e;

    .line 5
    iput-object p4, p0, Landroidx/room/b;->d:Landroidx/room/m0;

    .line 6
    iput-object p5, p0, Landroidx/room/b;->e:Ljava/util/List;

    .line 7
    iput-boolean p6, p0, Landroidx/room/b;->f:Z

    .line 8
    iput-object p7, p0, Landroidx/room/b;->g:Landroidx/room/l0;

    .line 9
    iput-object p8, p0, Landroidx/room/b;->h:Ljava/util/concurrent/Executor;

    .line 10
    iput-object p9, p0, Landroidx/room/b;->i:Ljava/util/concurrent/Executor;

    .line 11
    iput-object p10, p0, Landroidx/room/b;->j:Landroid/content/Intent;

    .line 12
    iput-boolean p11, p0, Landroidx/room/b;->k:Z

    .line 13
    iput-boolean p12, p0, Landroidx/room/b;->l:Z

    move-object/from16 p1, p13

    .line 14
    iput-object p1, p0, Landroidx/room/b;->m:Ljava/util/Set;

    move-object/from16 p1, p14

    .line 15
    iput-object p1, p0, Landroidx/room/b;->n:Ljava/lang/String;

    move-object/from16 p1, p15

    .line 16
    iput-object p1, p0, Landroidx/room/b;->o:Ljava/io/File;

    move-object/from16 p1, p16

    .line 17
    iput-object p1, p0, Landroidx/room/b;->p:Ljava/util/concurrent/Callable;

    .line 18
    iput-object v0, p0, Landroidx/room/b;->q:Ljava/util/List;

    .line 19
    iput-object v1, p0, Landroidx/room/b;->r:Ljava/util/List;

    move/from16 p1, p19

    .line 20
    iput-boolean p1, p0, Landroidx/room/b;->s:Z

    move-object/from16 p1, p20

    .line 21
    iput-object p1, p0, Landroidx/room/b;->t:Ly1/b;

    move-object/from16 p1, p21

    .line 22
    iput-object p1, p0, Landroidx/room/b;->u:Lt4/h;

    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Landroidx/room/b;->v:Z

    return-void
.end method
