package com.mlapuma.whatsappaireply.profile;

import com.mlapuma.whatsappaireply.user.User;
import jakarta.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "writing_profile")
public class WritingProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String instructions;

    @Column(name = "is_default", nullable = false)
    private boolean defaultProfile;

    @Column(name = "created_at", nullable = false, insertable = false, updatable = false)
    private OffsetDateTime createdAt;

    @Column(name = "updated_at", nullable = false, insertable = false)
    private OffsetDateTime updatedAt;

    protected WritingProfile() {
    }
}
