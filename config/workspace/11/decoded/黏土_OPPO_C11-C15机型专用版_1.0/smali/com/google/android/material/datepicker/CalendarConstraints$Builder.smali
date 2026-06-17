.class public final Lcom/google/android/material/datepicker/CalendarConstraints$Builder;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/datepicker/CalendarConstraints;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# static fields
.field public static final synthetic c:I


# instance fields
.field public a:Ljava/lang/Long;

.field public b:Lcom/google/android/material/datepicker/CalendarConstraints$DateValidator;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x76c

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lcom/google/android/material/datepicker/Month;->f(II)Lcom/google/android/material/datepicker/Month;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-wide v0, v0, Lcom/google/android/material/datepicker/Month;->m:J

    .line 9
    .line 10
    invoke-static {v0, v1}, Lcom/google/android/material/datepicker/UtcDates;->a(J)J

    .line 11
    .line 12
    .line 13
    const/16 v0, 0x834

    .line 14
    .line 15
    const/16 v1, 0xb

    .line 16
    .line 17
    invoke-static {v0, v1}, Lcom/google/android/material/datepicker/Month;->f(II)Lcom/google/android/material/datepicker/Month;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-wide v0, v0, Lcom/google/android/material/datepicker/Month;->m:J

    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/google/android/material/datepicker/UtcDates;->a(J)J

    .line 24
    .line 25
    .line 26
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/android/material/datepicker/DateValidatorPointForward;

    .line 5
    .line 6
    const-wide/high16 v1, -0x8000000000000000L

    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lcom/google/android/material/datepicker/DateValidatorPointForward;-><init>(J)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/google/android/material/datepicker/CalendarConstraints$Builder;->b:Lcom/google/android/material/datepicker/CalendarConstraints$DateValidator;

    .line 12
    .line 13
    return-void
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
.end method
